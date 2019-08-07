package desinemodle.sisuo;

public class DeadLock {
    public static String obj1= "obj1";
    public static String obj2 = "obj2";

    public static void main(String[] args) {
        Thread t1 = new Thread(new Lock1());
        Thread t2 = new Thread(new Lock2());
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
