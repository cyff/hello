package concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args){
        CountDownLatch begin = new CountDownLatch(2); //参数是大于0 的整数，是几，就需要调用对应对象如begin，end ，分别调用该对象几次，才能唤醒await
        CountDownLatch end = new CountDownLatch(2);

        //因为启动了两个线程，线程中 begin.await() 和end.countDown() 各调用两次，但是begin只需调用一次begin.countDown()方法即可，
        //   在主线程中，调用一次begin.countDown()，将两个线程唤醒后，每个线程调用了一次end.countDown方法，总共调用了两次，才能将主线程中的end.await唤醒
        //不管阻塞线程的数量是多少，主要调用初始化 CountDownLatch 对象时指定次数，， 都能将阻塞的线程 唤醒
        for(int i=0;i<2;i++){
            Thread thread = new Thread(new Player(begin,end));
            thread.start();
        }

        try {
            System.out.println("the race begin");
            begin.countDown();//将begin的改成2之后，此处需要调用2次countDown才能将阻塞的线程唤醒
            begin.countDown();
            end.await();
            System.out.println("the race end");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
