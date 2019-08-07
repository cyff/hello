package testsynchronized;

public class SynchronizedDemo {
    public static void main(String[] args) {
        /**
     * 修饰当前对象代码块
     * 锁的调用方法的当前对象
     * 代码块 this代表当前对象
     * 3与1 2 不是同一个对象 13同时执行 12是同步执行
      *
     */
     SynchronizedDemo block = new SynchronizedDemo();  //该例子中3与1是同一个对象，所以会同步执行，  2与1是不同的对象，同步执行
     new Thread("thread1-1"){
         @Override public void run(){
             try {
                 new SynchronizedBlock(block).demo3();
             } catch (InterruptedException e) {
                 e.printStackTrace(); }
         } }.start();
     new Thread("thread1-2"){
         @Override public void run(){
             try {
                 new SynchronizedBlock(new SynchronizedDemo()).demo3();  //此处的对象与demo4也不是同一个对象，所以也会同步执行
             } catch (InterruptedException e) {
                 e.printStackTrace(); }
         } }.start();
     new Thread("thread1-3"){
         @Override public void run(){
             try { new SynchronizedBlock(block).demo3();
             } catch (InterruptedException e) {
                 e.printStackTrace(); }
         }
     }.start();

     /**
     * 修饰对象实列方法-代码块-指定对象
     * 这里new了两个SynchronizedBlock对象 但由于指定同步对象是SynchronizedDemo
     * 所以方法依然会同步执行
     */
     SynchronizedDemo demo4 = new SynchronizedDemo();
     new Thread("thread4-1"){
         @Override public void run(){
             try {
                 new SynchronizedBlock(demo4).demo3_1();
             } catch (InterruptedException e) {
                 e.printStackTrace(); }
         }
     }.start();
     new Thread("thread4-2"){
         @Override public void run(){
             try {
                 new SynchronizedBlock(demo4).demo3_1();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }.start();
      /**
     * 修饰代码块-class
     * 这里new了两个SynchronizedDemo对象 但锁的是类对象
     * 所以方法依然会同步执行
     */
   new Thread("thread3-1"){ @Override public void run(){ try { new SynchronizedBlock(new SynchronizedDemo()).demo3_2(); } catch (InterruptedException e) { e.printStackTrace(); } } }.start(); new Thread("thread3-2"){ @Override public void run(){ try { new SynchronizedBlock(new SynchronizedDemo()).demo3_2(); } catch (InterruptedException e) { e.printStackTrace(); } } }.start();
        }

}
