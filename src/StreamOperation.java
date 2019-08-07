import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamOperation {
    public static void main(String[] args) throws IOException {
        //create two File class object
//  File inputFile=new File("E:\\workspace\\tmpfile\\farrago.txt");
//  File outputFile=new File("E:\\workspace\\tmpfile\\outagainb.txt");

        //create file input/output byteStream
        FileInputStream inputStream=new FileInputStream(new File("D:\\1.txt")); //attention：throw exception
        FileOutputStream outputStream=new FileOutputStream(new File("D:\\2.txt"));
        FileOutputStream outputStream2=new FileOutputStream(new File("D:\\4.txt"));

        int c;
        int d;
        byte[] buff = new byte[1024];
        while((inputStream.read(buff))!=-1){
            outputStream.write(buff);
            System.out.println(buff);
        }
        inputStream.close();
        outputStream.flush();
        System.out.println("好好好好好好");


      //  inputStream=new FileInputStream(new File("D:\\1.txt"));

            outputStream2.write(buff);
            System.out.println(buff);

        System.out.println("不好了");

//        InputStreamCacher  cacher = new InputStreamCacher(inputStream);
//        InputStream stream = cacher.getInputStream();
////读取stream
//        stream = cacher.getInputStream();

    }

}
