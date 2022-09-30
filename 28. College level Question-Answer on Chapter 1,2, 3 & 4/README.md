**_Copyright Owner | License - CodeXam_** 

### College level questions and answers List
- [**Question 1**](#question-1)
- [**Question 2**](#question-2)
- [**Question 3**](#question-3)
- [**Question 4**](#question-4)
- [**Question 5**](#question-5)
- [**Question 6**](#question-6)

******************
## Question 1
### a. Create a class Box with data member height, width and breadth and define setHeight(), setWidth() and setBreadth() to initialize the data members and also define volume() to compute volume using those data members. Display your results by creating appropriate type of objects, calling those methods. Instead of calling the respective methods for initialization, also directly initialize those variables using objects and call volume() and display results.

### b. Use constructor of the Box class to initialize the instance variable, define volume(). Create objects and call volume and display results.

#### Answer: a & b
```CodeXam.java```
```java
class Box {
    private int height;
    private int width;
    private int breadth;

    public Box(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public int volume() {
        return height * width * breadth;
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        System.out.println("Volume of box is: " + box.volume());
        
    }
}
```
#### Output:
```
Volume of box is: 6000
```

****************************
## Question 2
### a. Define a class. Inside that class define 5 versions of add() by differing order of parameters, number of parameters and data types of parameters. From the main(), create object of that class and call all the versions of add() by passing appropriate parameters.

### b. Define Box class and define three instance variables height, width & depth in that class. Then define 4 different versions of the constructors of that class - one version must be parameter-less one version must has a single parameter, one version must has 3 parameters and last one has object reference as its parameter. Define vol() method to compute the volume. From main(), create objects so that all the versions of the constructor gets invoked. Call vol(), and display results.

#### Answer: a 
```CodeXam.java```
```java
class CodeXam {
    public static void main(String[] args) {
        CodeXam obj = new CodeXam();
        obj.add(1, 2);
        obj.add(1, 2, 3);
        obj.add(1, 2, 3, 4);
        obj.add(1, 2, 3, 4, 5);
        obj.add(1, 2, 3, 4, 5, 6);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public void add(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }

    public void add(int a, int b, int c, int d, int e, int f) {
        System.out.println(a + b + c + d + e + f);
    }
}
```
#### Output:
```
3
6
10
15
21
```

#### Answer: b

```CodeXam.java```
```java
class Box {
    int height;
    int width;
    int depth;

    Box() {
        height = 0;
        width = 0;
        depth = 0;
    }

    Box(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }

    Box(int h, int w) {
        height = h;
        width = w;
        depth = 0;
    }

    Box(Box b) {
        height = b.height;
        width = b.width;
        depth = b.depth;
    }

    int vol() {
        return height * width * depth;
    }
}



class CodeXam {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10, 20, 30);
        Box b3 = new Box(10, 20);
        Box b4 = new Box(b2);

        System.out.println("Volume of b1 is " + b1.vol());
        System.out.println("Volume of b2 is " + b2.vol());
        System.out.println("Volume of b3 is " + b3.vol());
        System.out.println("Volume of b4 is " + b4.vol());

    }
}
```
#### Output:
```
Volume of b1 is 0
Volume of b2 is 6000
Volume of b3 is 0
Volume of b4 is 6000
```
*******************************
## Question 3
###  Define a class Shape with two instance variables length and breadth. Create two classes Rectangle and Square that inherits Shape class. Use super to call super-class constructor in the base class. Define area() and perimeter() in Rectangle and Square class respectively. Create appropriate objects and display the results.



#### Answer: 
```CodeXam.java```
```java
//Define a class Shape with two instance variables length and breadth. Create two classes Rectangle and Square that inherits Shape class. Use super to call super-class constructor in the base class. Define area() and perimeter() in Rectangle and Square class respectively. Create appropriate objects and display the results.

class Shape {
    int length;
    int breadth;
    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    int area() {
        return length * breadth;
    }
    int perimeter() {
        return 2 * (length + breadth);
    }
}
class Square extends Shape {
    Square(int length, int breadth) {
        super(length, breadth);
    }
    int area() {
        return length * breadth;
    }
    int perimeter() {
        return 2 * (length + breadth);
    }
}

class CodeXam {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Square s = new Square(10, 10);
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Perimeter of Rectangle: " + r.perimeter());
        System.out.println("Area of Square: " + s.area());
        System.out.println("Perimeter of Square: " + s.perimeter());


    }
}

```

#### Output:
```
Area of Rectangle: 200
Perimeter of Rectangle: 60
Area of Square: 100
Perimeter of Square: 40
```
***************************
## Question 4
###  Create a class Sup with instance variable i. define show() to display the value of i. Create another class Sub by inheriting Sup with instance variable j. Also define show() in this class to display the values of i and j. Create objects of necessary types to call both versions of show().



#### Answer: 

```CodeXam.java```
```java
class Sup {
    int i = 10;
    void show() {
        System.out.println("i = " + i);
    }
}
class Sub extends Sup {
    int j = 20;
    void show() {
        System.out.println("i = " + i + " j = " + j);
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Sup sup = new Sup();
        sup.show();
        Sub sub = new Sub();
        sub.show();
    }
}
```
#### Output:
```
i = 10
i = 10 j = 20
```
********************************
## Question 5
###  Create a class Figure with two abstract methods area() and perimeter() and one normal method show() to display the values of instance variables length and breadth. Create two subclasses Triangle and Rectangle that inherits all the members of the previous class

#### Answer:

```CodeXam.java```
```java
abstract class Figure {
    double length;
    double breadth;
    abstract double area();
    abstract double perimeter();
    void show() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}
class Triangle extends Figure {
    Triangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return 0.5 * length * breadth;
    }
    double perimeter() {
        return length + breadth + Math.sqrt(length * length + breadth * breadth);
    }
}
class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return length * breadth;
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class CodeXam {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4);
        Rectangle r = new Rectangle(3, 4);
        t.show();
        System.out.println("Area of Triangle: " + t.area());
        System.out.println("Perimeter of Triangle: " + t.perimeter());
        r.show();
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Perimeter of Rectangle: " + r.perimeter());

    }
}
```
#### Output:
```
Length: 3.0
Breadth: 4.0
Area of Triangle: 6.0
Perimeter of Triangle: 12.0
Length: 3.0
Breadth: 4.0
Area of Rectangle: 12.0
Perimeter of Rectangle: 14.0
```
********************************
## Question 6
###  Create two interfaces A and S that contains two methods add() and sub() respectively. Create a class X that uses those interfaces. Instance variables have to be created as per requirements.

#### Answer:

```CodeXam.java```
```java
interface A {
    void add();
}
interface S {
    void sub();
}
class X implements A, S {
    int a, b, c;
    public void add() {
        c = a + b;
        System.out.println("Addition is: " + c);
    }
    public void sub() {
        c = a - b;
        System.out.println("Subtraction is: " + c);
    }
}

public class CodeXam {
    public static void main(String[] args) {
        X obj = new X();
        obj.a = 10;
        obj.b = 5;
        obj.add();
        obj.sub();
    }
}
```
#### Output:
```
Addition is: 15
Subtraction is: 5
```

********************************
