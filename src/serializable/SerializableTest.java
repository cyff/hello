package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable {


    private static final long serialVersionUID = -2464786345070840973L;

    public int num = 2018;

    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("serializable.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            SerializableTest test = new SerializableTest();
            oos.writeObject(test);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
