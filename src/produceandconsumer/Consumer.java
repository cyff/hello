package produceandconsumer;

public class Consumer implements Runnable{

    Person p;

    public Consumer(Person p){
        this.p = p;
    }

    @Override
    public  void run(){

        for(int i =0;i<50;i++){
            p.getInfo();
        }

    }
}
