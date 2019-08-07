package produceandconsumer;

public class Person {

    private String name;

    private int age;
    //表示共享资源对象是否为空，如果为 true，表示需要生产，如果为 false，则有数据了，不要生产
    private boolean isEmpty = true;

    public synchronized void setInfo(String name,int age){


        try {
            while (!isEmpty){
                this.wait();
            }
            //-------生产数据开始-------
            this.name = name;
            //这段延时代码的作用是可能只生产了 name，age为nul，消费者就拿去消费了
            Thread.sleep(10);
            this.age = age;

            //-------生产数据结束，提示消费者消费-------
            isEmpty = false;
            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public synchronized void getInfo(){
        try {
            while (isEmpty){
                this.wait();
            }
            Thread.sleep(1000);

            System.out.println(this.name+"---"+this.age);

            isEmpty =true;
            this.notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
