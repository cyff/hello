

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class c = Class.forName("Person");
        Field f = c.getField("sex");  //此处参数sex是Person类中的属性名
        Method m = c.getMethod("aaa",String.class);  //第一个参数是方法名，第二个参数是该方法需要的参数的类型，通过该参数类型决定反射类中哪个方法
        m.invoke(p,"x");   //调用方法，第一个参数是方法所在类的类对象，第二个参数是真正传的参数
        //获取字段值
        String n= (String) f.get(p);
        //获取字段类型
        Class type = f.getType();
        //通过反射给字段设置值
        f.set(p,"xxxxxxxxxx");
        f.setAccessible(true);  //反射私有方法或者变量时，使用该方法
        System.out.println(n);
        System.out.println(type);
        System.out.println(p.sex);
    }
}
