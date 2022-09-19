class Circle {
        public double radius;
        public double area;

        Circle() {//default constructor
            System.out.println("I am non  parameterized constructor of circle");
        }

        Circle(double r) {//parameterized constructor
            System.out.println("I am circle parameterized constructor");
            this.radius = r;//this keyword is used to refer to the current object
        }

        public double getArea() {//method to calculate area of circle
            area = Math.PI * this.radius * this.radius; //formula to calculate area of circle
            return area;
        }
    }
    class Cylinder extends Circle {//Cylinder class extends Circle class and inherits its properties
            public double height;
            public double volume;
            Cylinder(double r , double h){//parameterized constructor
                super(r);
                this.height = h;
                System.out.println("I am cylinder's parameterized constructor");
            }
       public double getVolume(){//method to calculate volume of cylinder
                volume = Math.PI*this.radius*this.radius*this.height;//formula to calculate volume of cylinder
                return volume;
       }

   }

public class CodeXam{
    public static void main(String[] args) {
        Cylinder c = new  Cylinder(20.5 , 30.8);
        System.out.println("Volume of cylinder is: " + c.getVolume());//calling getVolume method

    }
}

