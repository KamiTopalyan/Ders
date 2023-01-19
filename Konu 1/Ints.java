public class Ints {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 10.2;
        double d = 12.2;

        double commonMistake = 10.0 / 4;
        int maxValue = 2147483647; // int limit

        // double olduğunda floor değer(int e çeviriyo)
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        System.out.println(a + "" + b);

        System.out.println(c + d);

        System.out.println(c / a);
        System.out.println(c / a);

        System.out.println(commonMistake);

        System.out.println(7 % 2);

        System.out.println();

        System.out.println(maxValue);
        System.out.println(++maxValue); // exceed int limit and overflow
    }
}
