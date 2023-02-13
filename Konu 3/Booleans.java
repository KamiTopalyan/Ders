public class Booleans {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;

        int num = 5;

        System.out.println(no == true || yes == true);
        System.out.println(!no == true || yes == true);

        if(num > 10) {
            System.out.println("num is bigger");
        }
        else if(num < 10) {
            System.out.println("num is smaller");
        }   
        else {
            System.out.println("num is 10");
        }
    }    
}
