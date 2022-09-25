interface Bicycle {

    int a = 43;
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);

}
interface HornBicycle {
    int x = 48;
    void blowHornRing1();
    void blowHornRing2();

}
class AvonCycle implements Bicycle , HornBicycle {
       void blowHorn(){
        System.out.println("Peeeeeep!");
    }
    public void changeCadence(int newValue) {
        System.out.println("changeCadence");
    }
    public void changeGear(int newValue) {
        System.out.println("changeGear");
    }
    public void speedUp(int increment) {
        System.out.println("speedUp");
    }
    public void applyBrakes(int decrement) {
        System.out.println("applyBrakes");
    }
    public void blowHornRing1() {
        System.out.println("Nagin Song Pooo poo poo:)");
    }
    public void blowHornRing2() {
        System.out.println("Yamla Pagla Deewana Pee peee peeeeeee :)");
    }

}
public class CodeXam {
    public static void main(String[] args) {
        AvonCycle avonCycle = new AvonCycle();

//         avonCycle.a = 45;

        avonCycle.applyBrakes(1);
        System.out.println(avonCycle.a);

        avonCycle.blowHornRing1();
        avonCycle.blowHornRing2();

    }
}