public class Methods {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        Matematik.div(a, b);
        System.out.println(Matematik.pi);
    }
}

class Matematik {
    public final static double pi = Math.PI;

    public static void div(int in1, int in2) {
        System.out.println(in1 / in2);

    }
}
