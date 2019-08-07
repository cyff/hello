package testio;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testAmino {


        public static void main(String[] args) {



            testAmino test1=new testAmino();
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入一个IPV4的地址：");
            String st=scanner.next();

             //String st="172.168.5.1";
            System.out.println(test1.ipToLong(st));

            //Pattern pattern = Pattern.compile("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\s+\\.)+(\\s+(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\s+\\.)+(\\s+(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.)");

//            Pattern pattern = Pattern.compile("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\s*)\\.)((\\s*)(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\s*)\\.)((\\s*)(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\s*)\\.)((\\s*)(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d))");
//            Matcher matcher = pattern.matcher(st);
//            boolean flag = matcher.matches();
//            if(flag){
//                System.out.println(flag);
//                System.out.println(st);
//                System.out.println("ip地址符合规范");
//                System.out.println(test1.transformation(st));
//
//            } else {
//
//                System.out.println("ip地址不符合规范");
//            }
        }

        // 求任意的一个IPV4地址所对应的整数
        public long transformation(String st) {
            //String st1 = st.replaceAll("\\s*", "");
           // System.out.println(st1);
            String[] st2 = st.split("\\.");
            for(String s:st2){
                System.out.println(s);
            }
            long a = 0l;
            for (int i = 0; i < st2.length; i++) {
                a += Long.parseLong(st2[i]) * Math.pow(255, (3 - i));
            }
            return a;
        }

    public  long ip2Int(String ipString) {
        // 取 ip 的各段
        String[] ipSlices = ipString.split("\\.");
        long rs = 0;
        for (int i = 0; i < ipSlices.length; i++) {
            // 将 ip 的每一段解析为 int，并根据位置左移 8 位
            long intSlice = Integer.parseInt(ipSlices[i]) << 8 * i;
            // 或运算
            rs = rs | intSlice;
        }
        return rs;
    }

    public static long ipToLong(String strIp) {
        long[] ip = new long[4];
        //先找到IP地址字符串中.的位置
        int position1 = strIp.indexOf(".");
        int position2 = strIp.indexOf(".", position1 + 1);
        int position3 = strIp.indexOf(".", position2 + 1);
        //将每个.之间的字符串转换成整型
        ip[0] = Long.parseLong(strIp.substring(0, position1));
        ip[1] = Long.parseLong(strIp.substring(position1+1, position2));
        ip[2] = Long.parseLong(strIp.substring(position2+1, position3));
        ip[3] = Long.parseLong(strIp.substring(position3+1));
        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
    }



}
