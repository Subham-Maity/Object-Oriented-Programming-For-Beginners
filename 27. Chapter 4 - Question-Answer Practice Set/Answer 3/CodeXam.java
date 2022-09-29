//3. Create a class telephone with ring( ), lift ( ), and disconnected( ) methods as abstract methods create another class smart telephone, and demonstrate polymorphism using these methods.


abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnected();
}
interface Camera {
    void takePhoto();
    void recordVideo();
    void editPhoto();
}
interface Internet {
    void browse();
    void download();
    void upload();
}
interface Music {
    void play();
    void pause();
    void stop();
}
class SmartTelephone extends Telephone implements Camera, Internet, Music {
    @Override
    void ring() {
        System.out.println("Ringing...");
    }
    @Override
    void lift() {
        System.out.println("Lifting...");
    }
    @Override
    void disconnected() {
        System.out.println("Disconnected...");
    }
    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }
    @Override
    public void editPhoto() {
        System.out.println("Editing photo...");
    }
    @Override
    public void browse() {
        System.out.println("Browsing...");
    }
    @Override
    public void download() {
        System.out.println("Downloading...");
    }
    @Override
    public void upload() {
        System.out.println("Uploading...");
    }
    @Override
    public void play() {
        System.out.println("Playing...");
    }
    @Override
    public void pause() {
        System.out.println("Pausing...");
    }
    @Override
    public void stop() {
        System.out.println("Stopping...");
    }
}

public class CodeXam {
    public static void main(String[] args) {
        SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.ring();
        smartTelephone.lift();
        smartTelephone.disconnected();
        smartTelephone.takePhoto();
        smartTelephone.recordVideo();
        smartTelephone.editPhoto();
        smartTelephone.browse();
        smartTelephone.download();
        smartTelephone.upload();
        smartTelephone.play();
        smartTelephone.pause();
        smartTelephone.stop();

        System.out.println("Demonstrating Polymorphism");
        Telephone telephone = new SmartTelephone();
        telephone.ring();
        telephone.lift();
        telephone.disconnected();
//        telephone.browse();//error
//        telephone.download();//error
//        telephone.upload();//not possible

        Camera camera = new SmartTelephone();
        camera.takePhoto();
        camera.recordVideo();
        camera.editPhoto();
//        camera.browse();//error
//        camera.download();//error
//        camera.upload();//not possible

 }
}