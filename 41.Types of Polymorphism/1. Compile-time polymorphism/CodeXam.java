// Java Program for Method overloading
// By using Different Types of Arguments

// Class 1
// Helper class
class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {

        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {

        // Returns product of double numbers
        return a * b;
    }
}


class CodeXam {
    public static void main(String[] args) {
       
        System.out.println(Helper.Multiply(2, 4)); //argument 1 and 2 are integer type
        System.out.println(Helper.Multiply(5.5, 6.3)); //argument 1 and 2 are double type
    }
}
