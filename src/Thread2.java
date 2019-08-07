import java.util.TreeSet;

public class Thread2 implements Runnable{


    public <T> T demo(T t){
        System.out.println("当前线程：");
        return t;
    }
    private int num;

    private int ticket=5;

    @Override
    public void run(){
//        num = 2;
//        System.out.println("当前线程："+Thread.currentThread().getName()+ "+++num的值"+num);
//        num =6 ;
//        System.out.println("当前线程："+Thread.currentThread().getName()+ "+++num的值"+num*3);
//
//        for(int i=0;i<10;i++){
//            if(ticket>0){
//                System.out.println("卖票："+Thread.currentThread().getName()+ "ticket的值"+ticket--);
//            }
//        }

        while (true){
            System.out.println("当前线程："+Thread.currentThread().getName()+ "在运行");
        }
    }

    public static void main(String[] args){
       Thread2 t2 = new Thread2();

       Thread t = new Thread(t2);
       t.setDaemon(true);
       t.start();


//        for(int i=0;i<500;i++){
//            new Thread(t2,"Thread--"+i).start();   //单例线程  因为只创建了一个Thread2实例   输出结果会出现 =6 的情况，线程不安全
//        }
        int int1 = 1_00_0;  //数字用下划线表示
        System.out.println(int1);

//        new Thread(t2).start();
//        new Thread(t2).start();
//
//        t2.run();
//
//
//        String str = "123";
//        int n1 = Integer.valueOf(str);
//        int n2 = Integer.parseInt(str);

//        System.out.println(n1);
//
//        for(int i=0;i<10;i++){
//            new Thread(new Thread2(),"Thread--"+i).start();   //多例线程  每个线程重新new一个Thread2实例  ，线程安全
//        }
    }
}
