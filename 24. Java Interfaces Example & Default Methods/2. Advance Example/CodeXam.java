interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){//overriding the method of interface MyCamera
        System.out.println("Taking snap");
    }
    public void recordVideo(){//overriding the method of interface MyCamera
        System.out.println("Taking snap");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){ //overriding the method of interface MyWifi
        System.out.println("Getting List of Networks");
        String[] networkList = {"AirTel", "Jio", "Vodafone", "Idea"};
        return networkList;
    }
    public void connectToNetwork(String network){ //overriding the method of interface MyWifi
        System.out.println("Connecting to " + network);
    }
}
public class CodeXam {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}