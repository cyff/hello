package produceandconsumer;

public class Producer implements Runnable {

    Person p;

    public Producer(Person p){
        this.p = p;
    }
    @Override
    public void run(){
        int i ;
        for(i= 0;i<50;i++){
            if(i%2 ==0){
                p.setInfo("tom",11);
            }else {
                p.setInfo("jack",21);
            }
        }
    }
}
