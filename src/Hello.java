import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.*;
import java.util.concurrent.Semaphore;

public class Hello {
    //public static void main(String[] args) {
    public static void main(String[] args){

       String ssss= toBinaryString(10);
       System.out.println(ssss);

        MyThread mt1 = new MyThread("nihaohei");
        mt1.start();
        try {
            Thread.sleep(3000);   //此处等了3秒，才会先执行第一个start的时候的run方法。如果不等可能是先调用的第二个start方法，先抛出异常，但是
        }catch (Exception e){                                    //第一个start方法已经调用，线程已启动，run方法还是会执行 ， 即先抛出异常，在输出run方法中信息
            e.printStackTrace();
        }
        System.out.println("--------输出10----------");
        mt1.start();

        //信号量   第一个参数是可用信号量的数量  ，第二个参数  是公平锁（true）或者是非公平锁    默认非公平锁
        Semaphore avialable = new Semaphore(5,true);

        String s1 = "Monday";
        String s2 = "Mon"+"day";
        String s3 = new String("Monday");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s3) );


        //查看jvm使用的垃圾收集器
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }


        //定义长度为 5 的数组
        int scores[]=new int[]{57,81,68,75,91};
        //输出源数组
        System.out.println("源数组内容如下：");
        //循环遍历源数组
        for(int i=0;i<scores.length;i++)
        {
            //将数组元素输出
            System.out.print(scores[i]+"\t");
        }
        //定义一个新的数组，将scores数组中的5个元素复制过来
        //同时留3个内存空间供以后开发使用
       // int[] newScores=(int[])Arrays.copyOf(scores,8);
        scores =(int[])Arrays.copyOf(scores,8);
        System.out.println("\n复制的新数组内容如下：");
        //循环遍历复制后的新数组
        for(int j=0;j<scores.length;j++)
        {
            //将新数组的元素输出
            System.out.print(scores[j]+"\t");
        }








        System.out.println("Helo World!  893");
        System.out.println("nihao   haod ");

        List list = new ArrayList();
        Integer nums[]={1,2,3};
        list= Arrays.asList(nums);//aslist 中接收的是对象。 基本类型的数组，
        System.out.println(list);

        Map map = new LinkedHashMap();

        map.put("1","aaa");
        map.put("2","bbb");
        map.put("3","ccc");

        Set set = map.keySet();
        Iterator it =set.iterator();
        //增强for循环，只适合取数据，不能改变集合中的值
        for(Object obj :map.keySet()){
            String key = (String) obj;
            map.get(key);
        }

        while(it.hasNext()){
            String key = (String) it.next();
            String value = (String) map.get(key);
            System.out.println(key+"="+value);
        }
        Set set1 = map.entrySet();
        Iterator it1 =set1.iterator();

        while(it1.hasNext()){
            Map.Entry entry = (Map.Entry) it1.next();
            String key1 = (String) entry.getKey();
            String value1 = (String) entry.getValue();
            System.out.println(key1+"="+value1);
        }


        byte a= 127;
        byte b=7;
        int c = a+b;   //+操作将byte提升为int类型
        b+=a;  //隐式转换，  转换成int类型
    }
    public  void sum(int ...nums){
    //可变参数，可把他看成数组
    }

    public static String toBinaryString(Integer number) {
        StringBuilder sb = new StringBuilder();
        for (int n = number; n > 0 ; n /= 2) {
            sb.append(n %  2);
        }
        return sb.toString();
    }


}
