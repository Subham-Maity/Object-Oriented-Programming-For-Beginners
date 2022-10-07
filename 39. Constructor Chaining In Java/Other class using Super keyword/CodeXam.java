class CodeXam
{
    String name;

    // constructor 1
    CodeXam()
    {
        this("");
        System.out.println("No-argument constructor of" +
                " CodeXam class");
    }

    // constructor 2
    CodeXam(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of CodeXam");
    }
}

class Derived extends CodeXam
{
    // constructor 3
    Derived()
    {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    Derived(String name)
    {
        // invokes CodeXam class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }

    public static void main(String args[])
    {
        // calls parameterized constructor 4
        Derived obj = new Derived("test");

        // Calls No-argument constructor
         Derived obj1 = new Derived();
    }
}