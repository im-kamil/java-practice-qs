public class ThrowvsThrows {
    void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            int c = a / b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        // throw vs throws
        ThrowvsThrows t = new ThrowvsThrows();
        t.div(20, 0);
        // try {
        //     t.div(20, 0);
        // } catch (Exception e) {
        //     System.out.println("The value of b is zero ");
        // }

    }
}
