
// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
class CodeXam
{

    CodeXam()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    CodeXam(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    CodeXam(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        new CodeXam();
    }
}