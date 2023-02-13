
public class Car {
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

    public Car(String marka, String sahip, int mesafe) {
        this.marka = marka;
        this.sahip = sahip;
        this.mesafe = mesafe;
    }

    public Car(String marka, String sahip) {
        this.marka = marka;
        this.sahip = sahip;
    }
}
