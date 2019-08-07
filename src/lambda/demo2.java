package lambda;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {
        // 定义字符串
        String str = "helloworld";

        // 调用方法
        // 在调用的时候写方法体，方法比较灵活
        //int length = testFun(str, (s) -> s.length());

       // System.out.println(length);

        String str1 = testFun(str, (s) -> s.concat("aaa"));

         System.out.println(str1);


        // 调用     供给型接口：Supplier<T>
        String sup = testSup(() -> str);

        System.out.println(sup);

        getString(String :: new);


        List<Long> list = new ArrayList<>();

        // 封装到集合
        for (long i = 1; i <= 100; i++) {
            list.add(i);
        }

        // 计算
        // reduce：参1，和的初始值
        Long sum = list.stream().parallel().reduce(0L, (r, l) -> r + l);

        System.out.println(sum);


        //获取当前时间
        Instant now = Instant.now();
        System.out.println(now);

        // 获取当前时间
        Instant instant = Instant.parse("1993-02-06T10:12:35Z");
        System.out.println(instant);

        // 当前时间
        LocalDate now1 = LocalDate.now();
        System.out.println(now);

        // 往前推两天
        LocalDate date = now1.minusDays(2);
        System.out.println(date);

        // 制定一个日期
        LocalDate localDate = LocalDate.of(1993, 2, 6);
        System.out.println(localDate);


        // 当前时间
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);

        // 22:33
        LocalTime localTime = LocalTime.of(22, 33);
        System.out.println(localTime);

        // 一天中的4503秒
        LocalTime ofDay = LocalTime.ofSecondOfDay(4503);
        System.out.println(ofDay);



        List<String> list2 = new ArrayList<>();

        // 添加元素
        list2.add("sdf");
        list2.add("a");
        list2.add("asdf");
        list2.add("d");
        list2.add("basdfgh");

        long count = list2.stream().filter((r)->r.length()>2).count();
        System.out.println(count);
        List<String> list3 = list2.stream().filter((r)->r.length()>2).collect(Collectors.toList());

        list3.forEach(System.out::println);


        List<String> list4 = list2.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());
        list4.forEach(System.out::println);


        Stream<?> flatMap = Stream.of(Arrays.asList("a", "b"), Arrays.asList(1, 2, 3)).flatMap((s) -> s.stream());
        flatMap.forEach(System.out :: println);


        String[] str2 = {"a", "b", "c"};

        String join = String.join("-", str2);
        System.out.println(join);

    }

    // 方法
    /**
     *
     * @param str 输入参数
     * @param fun 表达式 String 为输入类型，Integer为输出类型
     * @return 返回字符串长度
     */
//    public static int testFun(String str, Function<String, Integer> fun) {
//        // 执行
//        Integer length = fun.apply(str);
//
//        return length;
//    }

        //Function<String, String>    第一个参数 ，是作为表达式的参数，   第二个是返回值
        public static String testFun(String str, Function<String, String> fun) {
        // 执行
        String s = fun.apply(str);    //该方法执行的是lambda表达式中的方法，即 s.concat("aaa") 、s.length() 等

        return s;

        }

    /**
     *
     * @param sup
     * @return
     */
    public static String testSup(Supplier<String> sup) {
        // 执行
        String s = sup.get();
        return s;
    }


    public static void getString(Supplier<String> su) {
        String s = su.get();

        String s1 = new String();    //new 出来的是个  空字符串
        System.out.println(s1.equals(""));   //true
        System.out.println(s.concat("aaaff"));
        System.out.println(s == null);
    }
}
