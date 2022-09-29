
interface Camera {
    void takePhoto();
}
interface GPS {
    void getLocation();
}
interface Wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}
interface Bluetooth {
    void connect();
}
interface Flashlight {
    void turnOn();
    void turnOff();
}
interface Phone {
    void call();
    void hangup();
}
interface MusicPlayer {
    void play();
    void pause();
    void stop();
}
interface network {
    void connect();
}
class MyCellPhone{
    void callNumber(int number){
        System.out.println("Calling " + number);
    }
    void hangup(){
        System.out.println("Hangup");
    }
    void takePhoto(){
        System.out.println("Take photo");
    }
}
class IPhone extends MyCellPhone implements Phone, Camera, Wifi, Bluetooth, Flashlight, MusicPlayer {
    public void call() {
        System.out.println("Calling");
    }
    public void hangup() {
        System.out.println("Hangup");
    }
    public void takePhoto() {
        System.out.println("Take photo");
    }
    public void turnOn() {
        System.out.println("Turn on");
    }
    public void turnOff() {
        System.out.println("Turn off");
    }
    public void play() {
        System.out.println("Play");
    }
    public void pause() {
        System.out.println("Pause");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public String[] getNetworks() {
        return new String[]{"Airtel", "Jio", "Vodafone"};
    }
    public void connectToNetwork(String network) {
        System.out.println("Connect to " + network);
    }
    public void connect() {
        System.out.println("Connect");
    }
}

public class CodeXam {
    public static void main(String[] args) {
        Camera camera = new IPhone();
        camera.takePhoto();
//        camera.getLocation(); -> This is a smartphone but, use it as a camera

        IPhone iPhone = new IPhone();
        iPhone.callNumber(1234567890);
        iPhone.hangup();
        iPhone.takePhoto();
        iPhone.turnOn();
        iPhone.turnOff();
        iPhone.play();
        iPhone.pause();
        iPhone.stop();
        String[] networks = iPhone.getNetworks();
        for (String network : networks) {
            System.out.println(network);
        }
        iPhone.connectToNetwork("Airtel");
        iPhone.connect();

    }
}