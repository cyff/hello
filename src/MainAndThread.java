
public class MainAndThread {

        public static void main( String args[]){

            new Thread(new Runnable(){     //该线程是一个非守护线程， main方法也是非守护线程，只有所有的非守护线程结束，jvm虚拟机才会退出
                @Override
                public void run(){
                    try {
                        Thread.currentThread().sleep(5000);  //会抛出一个中断异常
                        //Thread.sleep(5000);  //与上边一句效果一样
                        System.out.println("睡了5s后打印,这是出main之外的非守护线程，这个推出后这个引用结束，jvm声明周期结束。任务管理的java/javaw.exe进程结束");

                    }catch (Exception e){

                        System.out.println("exception le");
                    }
                }
            }).start();   //创建的线程，需要start启动才能生效
            System.out.println("mian线程直接打印，mian线程结束，电脑任务管理器的java/javaw.exe进程并没有结束。");
        }

}
