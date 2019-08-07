package desinemodle.guanchazhe;

public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        System.out.println("--------输出15----------");
        subject.setState(15);
        System.out.println("--------输出10----------");
        subject.setState(10);




    }
}
