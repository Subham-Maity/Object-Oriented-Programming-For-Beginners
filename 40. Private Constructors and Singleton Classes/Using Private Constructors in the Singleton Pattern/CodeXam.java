class MySingleton
{
    static MySingleton instance = null; // static instance of class
    public int x = 10;

    // private constructor can't be accessed outside the class
    private MySingleton() { }

    // Factory method to provide the users with instances
    static public MySingleton getInstance()
    {
        if (instance == null)
            instance = new MySingleton();

        return instance;
    }
}

// Driver Class
class CodeXam {
    public static void main(String args[]) {
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
}
