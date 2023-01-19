package classes.Car;

public class Objects {
    public static void main(String[] args) {
        Car kamiCar = new Car("Buggati", "Kami", 42);
        Car alpCar = new Car("Lambo", "Alp", 0);

        // alpCar.sahip = "Kami";
        alpCar.honk();
        System.out.println(alpCar.getSahip());
        System.out.println(kamiCar.getSahip());
        alpCar.go(10);
        System.out.println(alpCar.getMesafe());
        alpCar.go(20);
        System.out.println(alpCar.getMesafe());
        alpCar.go(300);
        System.out.println(alpCar.getMesafe());
        System.out.println(kamiCar.getMesafe());
    }
}

class Car {
    private String marka;
    private String sahip;
    private int mesafe;

    public void honk() {
        System.out.println("HOOOOOOOOOONK!!!!");
    }

    public void go(int x) {
        mesafe += x;
    }

    public String getMarka() {
        return marka;
    }

    public String getSahip() {
        return sahip;
    }

    public int getMesafe() {
        return mesafe;
    }

    public Car(String marka, String sahip, int mesafe) {
        this.marka = marka;
        this.sahip = sahip;
        this.mesafe = mesafe;
    }
}
