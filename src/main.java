import model.Student;

import java.lang.reflect.Field;

public class main {
    public static void main(String[] args){
        Student stu = new Student("lcw",21,"female",1601030049);
        String varName = stu.toString();
        System.out.println(varName);
        // 获取实体类的所有属性，返回Field数组
//        Field[] fields = stu.getClass().getDeclaredFields();
//        for(int i=0; i < fields.length; i++) {
//            String varName = fields[i].getName();
//            System.out.println(varName);
//        }
    }
}
