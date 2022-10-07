// Java program to demonstrate Autoboxing
import java.util.ArrayList; // import the ArrayList class before using it in the program
class CodeXam {
    public static void main(String[] args)
    {
        Character ch = 'a';

        // unboxing - Character object to primitive conversion
        char a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // create an ArrayList object of Integer type
        arrayList.add(24); // add an Integer object to the ArrayList
        arrayList.add(25);

        // unboxing because get method returns an Integer object
        int num = arrayList.get(0);
        // printing the values from primitive data types
       System.out.println("Value: " + num);
       int num1 = arrayList.get(1);
       System.out.println("Value: " + num1);

    }
}