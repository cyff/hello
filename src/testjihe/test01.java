package testjihe;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test01 {
    @Test
    public void Test() {

        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");


        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {// i % 2 !=0 同样好使
                list.remove(i);
            } else {
                list.remove(i);
            }

           // list.remove(i);
        }
        System.out.println(list);
    }

}
