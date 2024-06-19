package nested.inner;

public class InnerOuter {

    public static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);

            System.out.println(outInstanceValue);

            System.out.println(outClassValue);
            //모두 접근 가능
        }

        public Inner(int innerInstanceValue) {
            this.innerInstanceValue = innerInstanceValue;
        }
    }
}
