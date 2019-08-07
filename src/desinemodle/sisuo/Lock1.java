package desinemodle.sisuo;

public class Lock1 implements Runnable {
    @Override
    public void run(){
        try{
            System.out.println("Lock1 running");
            //不加while循环，不会造成死锁。      都会抛出一个java.lang.IllegalMonitorStateException异常
            while(true){
                synchronized (DeadLock.obj1){
                    System.out.println("Lock1 lock obj1");
                    Thread.sleep(3000);//获取obj1后先等一会儿，让Lock2有足够的时间锁住obj2
                    synchronized(DeadLock.obj2){
                        System.out.println("Lock1 lock obj2");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
