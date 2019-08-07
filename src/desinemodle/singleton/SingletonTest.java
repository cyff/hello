package desinemodle.singleton;

public class SingletonTest {
    //懒汉式：第一次调用的时候才会实例化
    private static SingletonTest single = null;

    public static SingletonTest getInstance(){
        if(single == null ){
            single = new SingletonTest();
            System.out.println("创建一次");
        }
        return single;
    }
    //测试时候，调用
    public void show(){
        System.out.println("我是show");
    }

    //静态内部类来实现线程安全
//    private static class SingletonHolder{
//        private static final SingletonTest INSTANCE  = new SingletonTest();
//
//    }
//    private SingletonTest (){}
//
//    public static final  SingletonTest getInstacne(){
//        return SingletonHolder.INSTANCE ;
//    }

    //同步锁
//    public static  synchronized SingletonTest getInstance(){
//        if(single == null ){
//            single = new SingletonTest();
//            System.out.println("创建一次");
//        }
//        return single;
//    }


//    // 双重校验锁   --提高效率    因为synchronized用了java的内置锁，  锁的是当前方法所属的对象，  只有锁把当前对象释放了，其他线程才能获得该对象
//    public static SingletonTest getInstance(){
//        if(single == null ){  //如果第一个线程已经获得单例对象，后边的线程在不在进入同步代码块
//           synchronized (SingletonTest.class){
//               if(single ==null){
//                   single = new SingletonTest();
//               }
//           }
//        }
//        return single;
//    }
 }
