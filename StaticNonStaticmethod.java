public class StaticNonStaticmethod {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        StaticNonStaticmethod s = new StaticNonStaticmethod();
        s.Disp();
        StaticNonStaticmethod.Show();

    }

    static void Show() {
        System.out.println("Show() " + b);
    }

    void Disp() {  // nonStatic variable access both 
        System.out.println("Disp()" + a + " " + b);
    }
}
