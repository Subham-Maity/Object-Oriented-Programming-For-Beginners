//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class cellphone {//class name is cellphone
    public void ring() {
        System.out.println("ringing...");
    } //method to print ringing
    public void vibrate() {
        System.out.println("vibrating...");
    }//method to print vibrating
    public void silent() {
        System.out.println("silent...");
    }//method to print silent
}
public class CodeXam {
    public static void main(String[] args) {//main method
        cellphone nokia = new cellphone();//object creation
        System.out.println("calling Xam...");//calling Xam print
        nokia.ring();//calling ring method
        nokia.vibrate();//calling vibrate method
        nokia.silent();//calling silent method
    }
}


