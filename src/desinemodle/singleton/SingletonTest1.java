package desinemodle.singleton;

public class SingletonTest1 {

    //饿汉式单例类.在类初始化时，已经自行实例化

    private static SingletonTest singletonTest = new SingletonTest();

    public static SingletonTest getInstance(){
        return singletonTest;
    }
}

