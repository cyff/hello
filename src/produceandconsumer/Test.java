package produceandconsumer;

public class Test {

    public static void main(String[] args){

        //参考链接 ：  https://www.cnblogs.com/ysocean/p/6896219.html

        Person p = new Person();
        new Thread(new Producer(p)).start();
        //new Thread(new Producer(p)).start();

        new Thread(new Consumer(p)).start();

    }
}
