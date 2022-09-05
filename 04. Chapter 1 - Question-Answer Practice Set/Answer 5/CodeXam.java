//5. Create a class Tommy Vercetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
class TommyVercetti { // class name
    public void hit() {
        System.out.println("hitting the enemy...");
    } // hit method to print hitting the enemy
    public void run() {
        System.out.println("running form the enemy...");
    } // run method to print running from the enemy
    public void fire() {
        System.out.println("firing on the enemy...");
    }// fire method to print firing on the enemy
}
public class CodeXam {
    public static void main(String[] args) {
        TommyVercetti tommyVercetti = new TommyVercetti();// object of TommyVercetti class
        System.out.println("Now Tommy Vercetti ");// print statement
        tommyVercetti.hit();// calling hit method
        tommyVercetti.run();// calling run method
        tommyVercetti.fire();// calling fire method
    }
}


