# Basic Project 1 - Implement a Book library

## Methods: addBook, issueBook, returnBook, showAvailableBooks
## Properties: Array to store the available books,
## Array to store the issued books
************
### Solution:
```java


```

********************
*********************
****************************

# Advance project 2 - Make a Calculator 
## Make a calculator that can add, subtract, multiply, divide also Advanced calculator that can do square root, power, factorial, and log of a number and also a ScientificCalculator that can sin cos tan and also a programmer calculator that can convert binary to decimal and vice versa and make all calculator that can factorial fibonacci and prime number and so on then implement all calculator in a single class CalculatorClass  that can perform all the operation of all calculator.
************
### Solution
```java
interface Calculator { // interface class
    int add(int a, int b);//addition method declaration
    int sub(int a, int b);//subtraction method declaration
    int mul(int a, int b);//multiplication method declaration
    int div(int a, int b);//division method declaration
}

interface AdvancedCalculator extends Calculator { //interface Advanced Calculator extends Calculator interface class
    int mod(int a, int b);//modulus method declaration
    int power(int a, int b);//power method declaration
}
interface ScientificCalculator extends AdvancedCalculator {//interface Scientific Calculator extends Advanced Calculator interface class
    double sin(int a);//sin method declaration
    double cos(int a);//cos method declaration
    double tan(int a);//tan method declaration
    double log(int a);//log method declaration
    double sqrt(int a);//sqrt method declaration

}
interface ProgrammerCalculator extends ScientificCalculator {//interface Programmer Calculator extends Scientific Calculator interface class
    int binary(int a);//binary method declaration
    int octal(int a); //octal method declaration

}
interface AllCalculator extends ProgrammerCalculator {//interface All Calculator extends Programmer Calculator interface class
    int factorial(int a);//factorial method declaration
    int fibonacci(int a);//fibonacci method declaration

    int gcd(int a, int b);//gcd method declaration

    int lcm(int a, int b);//lcm method declaration

    int permutation(int a, int b);//permutation method declaration

    int combination(int a, int b);//combination method declaration

    int prime(int a);//prime method declaration

    int armstrong(int a);//armstrong method declaration

    int palindrome(int a);//palindrome method declaration

}
class CalculatorClass implements AllCalculator { //class CalculatorClass implements AllCalculator interface class
    public int add(int a, int b) { //addition method
        return a + b;//
    }
    public int sub(int a, int b) { //subtraction method
        return a - b;
    }
    public int mul(int a, int b) { //multiplication method
        return a * b;
    }
    public int div(int a, int b) { //division method
        return a / b;
    }
    public int mod(int a, int b) { //modulus method
        return a % b;
    }
    //Idea of power method is to multiply the number with itself for the number of times given in the exponent variable and return the result.
    public int power(int a, int b) { //power method
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
    public double sin(int a) { //sin method - Math.sin() in java returns the sine of the given angle in radians.
        return Math.sin(a);
    }
    public double cos(int a) { //cos method - Math.cos() in java returns the cosine of the given angle in radians.
        return Math.cos(a);
    }
    public double tan(int a) { //tan method - Math.tan() in java returns the tangent of the given angle in radians.
        return Math.tan(a);
    }
    public double log(int a) { //log method - Math.log() in java returns the natural logarithm of the given number.
        return Math.log(a);
    }
    public double sqrt(int a) { //sqrt method - Math.sqrt() in java returns the square root of the given number.
        return Math.sqrt(a);
    }
    public int binary(int a) { //binary method - Integer.toBinaryString() in java returns the binary representation of the given integer.
        return Integer.parseInt(Integer.toBinaryString(a));//Integer.parseInt() in java converts the given string into integer.
    }
    public int octal(int a) { //octal method - Integer.toOctalString() in java returns the octal representation of the given integer.
        return Integer.parseInt(Integer.toOctalString(a));//Integer.parseInt() in java converts the given string into integer.
    }



    //Idea of factorial method is to multiply the number with itself for the number of times given in the factorial variable and return the result.
    public int factorial(int a) { //factorial method
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }


    //using dynamic programming top-down approach
    //Idea of fibonacci method is to add the previous two numbers in the series and store it in the current variable and return the result.
    //dynamic programming top-down approach is used to reduce the time complexity of the program.
    public int fibonacci(int a) { //fibonacci method
        int[] fib = new int[a + 2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= a; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[a];
    }

    //Idea of gcd method is to find the greatest common divisor of the two numbers and return the result.

    public int gcd(int a, int b) { //gcd method
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i) {
            // Checks if i is factor of both integers
            if (a % i == 0 && b % i == 0)
                gcd = i;//if i is factor of both integers then store it in the gcd variable.
        }
        return gcd;
    }

    //Idea of lcm method is to find the least common multiple of the two numbers and return the result.
    public int lcm(int a, int b) { //lcm method
        //store the greater number in the lcm variable. (a > b) ? a : b; means if a is greater than b then store a in the lcm variable else store b in the lcm variable.
        int lcm = (a > b) ? a : b;
        // Always true
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {//if lcm is divisible by both the numbers then return the lcm variable.
                return lcm;//return lcm variable.
            }
            ++lcm;//increment the lcm variable.
        }
    }


    //Idea of permutation method is to find the permutation of the two numbers and return the result.
    public int permutation(int a, int b) { //permutation method
        int permutation = 1;
        for (int i = 1; i <= a; i++) {
            permutation = permutation * i;//multiply the number with itself for the number of times given in the factorial variable and store it in the permutation variable.
        }
        return permutation;
    }


    //Idea of combination method is to find the combination of the two numbers and return the result.
    public int combination(int a, int b) { //combination method
        int combination = 1;
        //calculate the factorial of the first number and store it in the combination variable.
        for (int i = 1; i <= a; i++) {
            combination = combination * i;
        }
        //calculate the factorial of the second number and store it in the combination variable.
        for (int i = 1; i <= b; i++) {
            combination = combination * i;
        }
        //calculate the factorial of the difference of the two numbers and store it in the combination variable.
        for (int i = 1; i <= a - b; i++) {
            combination = combination * i;
        }
        //calculate the combination of the two numbers and store it in the combination variable.
        return combination;
    }


    //Idea of prime method is to find whether the given number is prime or not and return the result.
    public int prime(int a) { //prime method
        //if the number is less than 2 then it is not a prime number.
        int i, m = 0, flag = 0;
        //if the number is less than 2 then it is not a prime number.
        m = a / 2;
        //if the number is less than 2 then it is not a prime number.
        if (a == 0 || a == 1) { //if the number is less than 2 then it is not a prime number.
            System.out.println(a + " is not prime number");
        } else {
            //if the number is less than 2 then it is not a prime number.
            for (i = 2; i <= m; i++) {
                //if the number is less than 2 then it is not a prime number.
                if (a % i == 0) {
                    System.out.println(a + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            //if the number is less than 2 then it is not a prime number.
            if (flag == 0) {
                System.out.println(a + " is prime number");
            }
        }
        return 0;
    }
    //Idea of armstrong method is to find whether the given number is armstrong or not and return the result.
    public int armstrong(int a) { //armstrong method
        int c = 0, a1, temp;//declare the variables.
        temp = a;//store the given number in the temp variable.
        //if the number is less than 2 then it is not a armstrong number.
        while (a > 0) {
            a1 = a % 10;
            a = a / 10;
            c = c + (a1 * a1 * a1);
        }
        //if the number is less than 2 then it is not a armstrong number.
        if (temp == c) {
            System.out.println("armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
        return 0;
    }

    //Idea of palindrome method is to find whether the given number is palindrome or not and return the result.

    public int palindrome(int a) { //palindrome method
        //if the number is less than 2 then it is not a palindrome number.
        int r, sum = 0, temp;
        temp = a;
        //if the number is less than 2 then it is not a palindrome number.
        while (a > 0) {
            r = a % 10;  //getting remainder
            //if the number is less than 2 then it is not a palindrome number.
            sum = (sum * 10) + r;
            a = a / 10;
        }
        //if the number is less than 2 then it is not a palindrome number.
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
        return 0;
    }
}
public class CodeXam {
    public static void main(String[] args) {
        CalculatorClass calculatorClass = new CalculatorClass();
        System.out.println("Addition: " + calculatorClass.add(10, 20));
        System.out.println("Subtraction: " + calculatorClass.sub(10, 20));
        System.out.println("Multiplication: " + calculatorClass.mul(10, 20));
        System.out.println("Division: " + calculatorClass.div(10, 20));
        System.out.println("Power: " + calculatorClass.power(10, 20));
        System.out.println("Sin: " + calculatorClass.sin(10));
        System.out.println("Cos: " + calculatorClass.cos(10));
        System.out.println("Tan: " + calculatorClass.tan(10));
        System.out.println("Log: " + calculatorClass.log(10));
        System.out.println("Sqrt: " + calculatorClass.sqrt(10));
        System.out.println("Binary: " + calculatorClass.binary(10));
        System.out.println("Octal: " + calculatorClass.octal(10));
        System.out.println("Factorial: " + calculatorClass.factorial(4));
        System.out.println("Fibonacci: " + calculatorClass.fibonacci(9));
        System.out.println("GCD: " + calculatorClass.gcd(10, 20));
        System.out.println("LCM: " + calculatorClass.lcm(10, 20));
        System.out.println("Permutation: " + calculatorClass.permutation(10, 20));
        System.out.println("Combination: " + calculatorClass.combination(10, 20));
        System.out.println("Prime: " + calculatorClass.prime(10));
        System.out.println("Armstrong: " + calculatorClass.armstrong(10));
        System.out.println("Palindrome: " + calculatorClass.palindrome(101));
    }
}


```

Output:
```
Addition: 30
Subtraction: -10
Multiplication: 200
Division: 0
Power: 1661992960
Sin: -0.5440211108893698
Cos: -0.8390715290764524
Tan: 0.6483608274590866
Log: 2.302585092994046
Sqrt: 3.1622776601683795
Binary: 1010
Octal: 12
Factorial: 24
Fibonacci: 34
GCD: 10
LCM: 20
Permutation: 3628800
Combination: -872415232
10 is not prime number
Prime: 0
Not armstrong number
Armstrong: 0
palindrome number 
Palindrome: 0
```



