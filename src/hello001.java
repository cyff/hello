public class hello001 {

    public static void main(String[] args){
        String s = Integer.toBinaryString(10);
        System.out.println(s);
        binaryToDecimal(10);
        binaryToDecimal2(10);
    }


    public static void binaryToDecimal(int n){
        int t = 0;  //用来记录位数
        int bin = 0; //用来记录最后的二进制数
        int r = 0;  //用来存储余数
        while(n != 0){
            r = n % 2;
            n = n / 2;
            bin += r * Math.pow(10,t);
            t++;
        }
        System.out.println(Integer.toString(bin));
    }

    public static void binaryToDecimal2(int n){
        String str = "";
        while(n!=0){
            str = n%2+str;
            n = n/2;
        }
        System.out.println(str);
    }
}
