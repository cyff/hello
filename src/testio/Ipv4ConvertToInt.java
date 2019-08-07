package testio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv4ConvertToInt {

    public static void main(String[] args) {
        Ipv4ConvertToInt ipv4ConvertToInt = new Ipv4ConvertToInt();


        String str=" 172. 16  8  .5  .  1 ";
        System.out.println("用来测试的ipv4地址:"+str);
        Pattern pattern = Pattern.compile("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\s*)\\.)((\\s*)(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\s*)\\.){2}((\\s*)(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d))");
        Matcher matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        if(flag){
            System.out.println("ipv4地址符合要求:"+str);
            System.out.println("将IPv4地址转换为32位整数的结果是:"+ipv4ConvertToInt.ipConvert(str));
        } else {
            System.out.println("ipv4地址不符合要求:"+str);
        }
}
    private long ipConvert(String str) {

        String[] strArr  = str.replaceAll("\\s*", "").split("\\.");

        long result = 0;
        for (int i = 0; i < strArr.length; i++) {
            result += Long.parseLong(strArr[i]) << 8 * (3 - i) ;
        }
        return result;
    }
}
