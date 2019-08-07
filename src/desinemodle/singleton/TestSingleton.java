package desinemodle.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        // T
        //故意写获取两次，创建两个对象
        SingletonTest singleton = SingletonTest.getInstance();
        SingletonTest singleton2 = SingletonTest.getInstance();

        //Singleton对象只创建一次，但是写两次还是可以的，而且方法都是可以调用的，但是看下面
        singleton.show();
        singleton2.show();

        //两个对象的表现形式一样
        if (singleton == singleton2) {
            System.out.println("该对象的字符串表示形式:");
            System.out.println("singleton :" + singleton.toString());
            System.out.println("singleton2:" + singleton2.toString());
        }
    }
}
