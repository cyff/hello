package testsynchronized;

public class SynchronizedBlock {
    //声明一个实例变量
    private SynchronizedDemo demo;
    SynchronizedBlock(SynchronizedDemo demo){ this. demo= demo; }
    //
    /**
     * 同步当前对象
     * @throws InterruptedException
     */
    public void demo3() throws InterruptedException{
        synchronized(this){
            System.out.println("A当前访问的线程名称是===="+Thread.currentThread().getName());
            Thread.sleep(10000);
        }
    } /**
     * 同步指定对象
     * @throws InterruptedException
     */
    public void demo3_1() throws InterruptedException{
        synchronized(demo){
            System.out.println("B当前访问的线程名称是===="+Thread.currentThread().getName());
            Thread.sleep(10000);
        }
    } /**
     * 同步class类对象
     * @throws InterruptedException
     */
    public void demo3_2() throws InterruptedException{
        synchronized(SynchronizedDemo.class){
            System.out.println("C当前访问的线程名称是===="+Thread.currentThread().getName());
            Thread.sleep(10000);
        }
    }

}
