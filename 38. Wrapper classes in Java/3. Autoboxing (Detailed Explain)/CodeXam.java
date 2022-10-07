// Java program to demonstrate Autoboxing
import java.util.ArrayList; // import the ArrayList class before using it in the program
class CodeXam {
    public static void main(String[] args)
    {
        char ch = 'a'; // primitive data type

        //Autoboxing- primitive to Character object conversion
        Character a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();// ArrayList of Integer type

        //Autoboxing because ArrayList stores only objects
        arrayList.add(25);//now compiler will write arrayList.add(Integer.valueOf(25)) internally
        arrayList.add(30);

        //printing the values from object
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
    }
}