package testio;

import java.util.Scanner;

public class test2 {
    //求出 IPV4 IP地址所对应的整数，比如 192.168.199.1 对应整数3194598946
    public static void main(String[] args) {
        test2 test1 = new test2();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个IPV4的地址：");
        String st=scanner.next();
        System.out.println(test1.transformation(st));

    }

    // 求任意的一个IPV4地址所对应的整数
    public long transformation(String st) {

        String[] st1 = st.split("\\.");
        //long a = 0l;
        long result = 0;
        for (int i = 0; i < st1.length; i++) {
            //a += Long.parseLong(st1[i]) * Math.pow(255, (3 - i));
//           long  intSlice = Long.parseLong(st1[i])<< 8*(3-i) ;
//
//            // 求或
//            result = result | intSlice;
            result += Long.parseLong(st1[i])<< 8*(3-i) ;
        }
        return result;
    }

}
