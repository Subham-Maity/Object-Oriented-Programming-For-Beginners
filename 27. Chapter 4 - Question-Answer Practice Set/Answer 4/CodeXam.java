//4. Create an interface TVremote and use it to inherit another interface smart TVremote and Create a class TV which implements TVremote interface
interface TVremote {
    void on();
    void off();
    void volumeUp();
    void volumeDown();
}
interface smartTVremote extends TVremote {
    void channelUp();
    void channelDown();
}
class TV implements smartTVremote {
    public void on() {
        System.out.println("TV is on");
    }
    public void off() {
        System.out.println("TV is off");
    }
    public void volumeUp() {
        System.out.println("Volume is up");
    }
    public void volumeDown() {
        System.out.println("Volume is down");
    }
    public void channelUp() {
        System.out.println("Channel is up");
    }
    public void channelDown() {
        System.out.println("Channel is down");
    }
}
public class CodeXam {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.on();
        tv.off();
        tv.volumeUp();
        tv.volumeDown();
        tv.channelUp();
        tv.channelDown();
    }
}
