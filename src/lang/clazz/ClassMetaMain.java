package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class; // 클래스에서 조회
//        Class clazz1 = new String().getClass();// 인스턴스에서 조회
//        Class clazz2 = Class.forName("java.lang.String");//문자열로 조회

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //상위 클래스
        String name = clazz.getSuperclass().getName();
        System.out.println("name = " + name);
        
        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("i.getName() = " + i.getName());
        }
    }
}
