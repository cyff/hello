import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class IntrospectorTest {
    @Test
    public void test1(){

        String soap = "1111";
        List<String> list = new ArrayList<>();
       JSONObject param1 = new JSONObject();
        Map<String, String> param0 = new HashMap<String, String>();
        list.add(soap);
        list.add(soap);
       param1.put("soap",soap);param1.put("soap","2222");

        param0.put("soap",soap);
        param0.put("soap","3333");
        param0.put("aa","12345");

        System.out.println("这是list的输出：" + list);
        System.out.println("这是json的输出：" + param1);
        System.out.println("这是map的输出：" + param0);


    }
    public static void main(String[] args) throws Exception {

       BeanInfo info = Introspector.getBeanInfo(Person.class,Object.class);//加上第二个参数时，去掉从父类继承的class属性

       PropertyDescriptor[] pds = info.getPropertyDescriptors();
       for(PropertyDescriptor p:pds){
           System.out.println(p.getName());
       }
       Person pp = new Person();
       PropertyDescriptor ps = new PropertyDescriptor("age",Person.class);
       Method m = ps.getWriteMethod();
       m.invoke(pp,30);
        System.out.println(pp.getAge());
    }
}
