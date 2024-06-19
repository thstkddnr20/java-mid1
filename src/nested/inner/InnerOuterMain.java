package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(1); // 어떤 인스턴스인지 알아야 하므로 outer.new Inner() 이런식으로 선언

        InnerOuter.Inner inner2 = outer.new Inner(2);
        InnerOuter.outClassValue = 4;

        inner.print();
        inner2.print();

        System.out.println(inner.getClass());

    }
}
