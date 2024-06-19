package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer integerObj = Integer.valueOf(10);
        System.out.println("integerObj = " + integerObj);
        Long longObj = Long.valueOf(100);
        Double v = Double.valueOf(10.5);
        System.out.println("longObj = " + longObj);
        System.out.println("v = " + v);
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
    }
}
