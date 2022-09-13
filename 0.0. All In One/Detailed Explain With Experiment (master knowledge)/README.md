## Object Oriented Programming (*OOP*) 

In this section, we revisit the principles of *OOP*, armed with the knowledge of
* Arrays and their variants
* Built-in Java classes and utilities, and 
* Conditionals and loops (normal and enhanced). 

### Step 01: Objects Revisited - State And Behavior

The attributes of an object determine what it is made up of. At different points in an object's lifetime, the value of any of its attributes can change. 

At any given time, values of these attributes defines the object's **state**. 

In The ```MotorBike``` example, the attribute ```speed``` defines a ```MotorBike```'s state. The ```speed``` of a ```ducati``` defines its state.

How an object responds to an external event, or a message sent to it, defines its **behavior**. 

Messages are delivered to an object using methods. Methods are used to implement an object's **behavior**. 

The methods ```setSpeed```, ```increaseSpeed``` and ```decreaseSpeed``` have an effect on the observed speed of the ```MotorBike```s. The future `state` of a `MotorBike` depends on `behavior` and current `state`.

`behavior` affects `state`. And `state` affects `behavior`. 


**_MotorBikeRunner.java_**

```java

	package com.in28minutes.oops;

	public class MotorBikeRunner {
		public static void main(String[] args) {
			MotorBike ducati = new MotorBike(100);
			MotorBike honda = new MotorBike(200);
			MotorBike yamaha = new MotorBike();
			ducati.start();
			honda.start();
			yamaha.start();

			ystem.out.println(ducati.getSpeed());
			System.out.println(honda.getSpeed());
			System.out.println(yamaha.getSpeed());

			ducati.increseSpeed(50);
			yamaha.setSpeed(250);
			honda.increaseSpeed(100);
			yamaha.decreaseSpeed(50);
			System.out.println(ducati.getSpeed());
			System.out.println(honda.getSpeed());
			System.out.println(yamaha.getSpeed());
		}
	}

```


**_MotorBike.java_**

```java

	package com.in28minutes.oops;

	public class MotorBike {
		//state
		private int speed;
		//behavior
		MotorBike() {
			this(5);
		}

		MotorBike(int speed) {
			if(speed > 0)
				this.speed = speed;
		}
		
		public void start() {
			System.out.println("Bike started!");
		}

		public void setSpeed(int speed) {
			if(speed > 0)
				this.speed = speed;
		}

		public int getSpeed() {
			return this.speed;
		}

		public void increaseSpeed(int howMuch) {
			setSpeed(this.speed + howMuch);
		}

		public void decreaseSpeed(int howMuch) {
			setSpeed(this.speed - howMuch);
		}
	}

```

### Step 02: Managing ```class``` state

At a basic level, when we design a class, we decide:
* `state` - member variables
* `how to create objects` - Define constructors
* `behavior` - What methods are exposed

Consider the example of a ```Fan``` ```class```.

The above three major areas that correspond to its design could be as follows:

* State
	* make
	* radius
	* color
	* isOn
	* speed
* Constructors
	*  Fan(String make, double radius, String color)
* Behavior
	* void switchOn()
	* void SwitchOff()
	* void changeSpeed(int change)
	* String toString()

Let's try to write a simple ```Fan``` ```class```, that covers all these aspects. 

**_Fan.java_**

```java

	package com.in28minutes.oops.level2;
	
	public class Fan {
		//state
		private String make;
		private double radius;
		private String color;
		private boolean isOn;
		private byte speed;	//levels: 0 to 5

		//constructors

		public Fan(String make, double radius, String color) {
			this.make = make;
			this.radius = radius;
			this.color = color;
		}

		//methods
		public String toString() {
			return String.format("Make : %s, Radius : %f, Color : %s, Is On : %b, Speed : %d",
									make,
									radius,
									color,
									isOn,
									speed);
		}
	}

```

**_FanRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class FanRunner {
		public static void main(String[] args) {
			Fan fan = new Fan("Fan-Tastic", 0.456, "GREEN");
			System.out.println(fan);
		}
	}

```
**_Console Output_**

_Make : Fan-tastic, Radius : 0.45600, Color : GREEN, Is On : false, Speed : 0_

The fields which were not set by the constructor, namely ```isOn``` and ```speed```, assumed the language default values for their data types, namely ```false``` (for ```booelan```) and ```0``` (for ```int```).

### Step 03: Augmenting ```Fan``` With Behavior
- - - 

We need to decide what kind of behavior should be provided by a `Fan` object.

The default state attributes of the ```Fan``` class objects, namely ```make```, ```color``` and ```radius``` are fixed at manufacturing time, and cannot be altered by a user of this ```class```'s instances. 

The other two state attributes, ```isOn``` and ```speed``` need to be exposed to change by ```Fan``` object users. We will offer methods that change them.

##### Snippet-01 : The ```Fan``` ```class``` - v4

**_FanRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class FanRunner {
		public static void main(String[] args) {
			Fan fan = new Fan("Fan-Tastic", 0.456, "GREEN");
			System.out.println(fan);
			fan.switchOn();
			System.out.println(fan);
			fan.setSpeed((byte)5);
			System.out.println(fan);
			fan.switchOff();
			System.out.println(fan);
		}
	}

```

**_Fan.java_**

```java

	package com.in28minutes.oops.level2;

	public class Fan {
		//state
		private String make;
		private double radius;
		private String color;
		private boolean isOn;
		private byte speed;	//levels: 0 to 5

		//constructors
		public Fan(String make, double radius, String color) {
			this.make = make;
			this.radius = radius;
			this.color = color;
		}

		//methods
		public String toString() {
			return String.format("Make : %s, Radius : %f, Color : %s, Is On : %b, Speed : %d",
									make,
									radius,
									color,
									isOn,
									speed);
		}

		//isOn
		/*public void isOn(boolean isOn) {
			this.isOn = isOn;
		}*/

		public void switchOn() {
			isOn = true;
			setSpeed((byte)1);
		}

		public void switchOff() {
			isOn = false;
			setSpeed((byte)0);
		}

		public void setSpeed(byte speed) {
			this.speed = speed;
		}
	}

```

**_Console Output_**

_Make : Fan-Tastic, Radius : 0.45600, Color : GREEN, Is On : false, Speed : 0_

_Make : Fan-Tastic, Radius : 0.45600, Color : GREEN, Is On : true, Speed : 1_

_Make : Fan-Tastic, Radius : 0.45600, Color : GREEN, Is On : true, Speed : 5_

_Make : Fan-Tastic, Radius : 0.45600, Color : GREEN, Is On : false, Speed : 0_

##### Snippet-01 Explained

* Regarding the state attribute ```isOn```:
	* A state modifier method such as ```public void isOn(boolean)``` is not preferred, even though it does alter this attribute. This is because it is not intuitive from the ```class``` user's perspective.
	* Alternatively, methods such as ```public void switchOn()``` and ```public void switchOff()``` not only toggle the attribute ```isOn```, but are also intuitive and useful to the ```Fan``` ```class``` users (Here, the ```FanRunner``` class).

* Regarding the state attribute ```speed```:
	*  ```setSpeed``` is both intuitive as well as useful, so not much rethinking needed here
	*  ```speed``` needs to be affected by the operations ```switchOn()``` and ```switchOff()```. We have added calls to ```setSpeed()``` in these method definitions.


#### Summary

The best way to design a class is using an `Outside In` thought process:
* Who all could possibly be using my ```class```?
* What functionality would they absolutely require?

### Step 04: Programming Exercise PE-OOP-01

1. Write a simple ```Rectangle``` ```class``` , while covering the following constituents:
* State
	* length
	* width
* Constructors
* Behavior or Methods

#### Solution To PE-OOP-01

**_RectangleRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class RectangleRunner {
		public static void main(String[] args) {
			Rectangle rectangle = new Rectangle(12, 23);
			System.out.println(rectangle);
			rectangle.setWidth(25);
			System.out.println(rectangle);
			rectangle.setLength(20);
			System.out.println(rectangle);
		}
	}

```

**_Rectangle.java_**

```java

	package com.in28minutes.oops.level2;

	public class Rectangle {
		//state:
			private int length;
			private int width;
		
		//creation:
		public Rectangle(int length, int width) {
			this.length = length;
			this.width = width;
		}

		//behaviors:
		public int getLength() {
			return length;
		}

		public int getWidth() {
			return width;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int area() {
			return length * width;
		}

		public int perimeter() {
			return 2*(length + width);
		}

		public String toString() {
			return String.format("Rectangle - length : %d, width : %d, area : %d, perimeter : %d", 
									length,
									width,
									area(),
									perimeter());
		}
	}

```

**_Console Output_**

_Rectangle - length : 12, width : 23, area : 276, perimeter : 70_

_Rectangle - length : 12, width : 25, area : 300, perimeter : 74_

_Rectangle - length : 20, width : 25, area : 500, perimeter : 90_

#### Solution Explained

* A ```Rectangle``` object created without a specified ```length``` and ```width``` makes no practical sense, therefore a default constructor is not provided.

### Step 06: Understanding Object Composition

Let's take a re-look at the state attributes of the ```Fan``` ```class```:

**_Fan.java_**

```java

	package com.in28minutes.oops.level2;

	public class Fan {
		//state
		private String make;
		private double radius;
		private String color;
		private boolean isOn;
		private byte speed;
		
		//constructors
		//methods
	}

```

All member variables of 'Fan' class are primitive variables. Can we make it complex and include other classes?

##### Snippet-01 : Object composition - State

**_CustomerRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class CustomerRunner {
		public static void main(String[] args) {
			Customer customer = new Customer();
		}
	}

```

**_Address.java_**

```java

	package com.in28minutes.oops.level2;

	public class Address {
		//state
		private String doorNo;
		private String streetInfo;
		private String city;
		private String zipCode;

		//creation
		//behaviors
	}

```

**_Customer.java_**

```java

	package com.in28minutes.oops.level2;

	public class Customer {
		//state
		private String name;
		private Address homeAddress;
		private Address workAddress;

		//creation
		//behaviors
	}

```

##### Snippet-01 Explained

```Customer customer``` is composed of:
*  ```name```,
*  ```homeAddress```, and
*  ```workAddress```. 

```String``` is a built-in type, and is simple. ```Address``` is a user defined type, and is composed of:	
* ```doorNo```,
* ```streetInfo```,
* ```city```, and
* ```zipCode```
	
##### Snippet-02 : Object Composition v2 - Construction

Let's now add constructors to allow easy creation of these objects.

**_CustomerRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class CustomerRunner {
		public static void main(String[] args) {
			//Customer customer = new Customer();
			Address homeAddress = new Address("Flat No. 51", "Hiranandani Gardens", Mumbai", "400076");
			Address workAddress = new Address("Administrative Office", "Western Block", "Mumbai", "400076");
			Customer customer = new Customer("Ashwin Tendulkar", homeAddress, workAddress);
		}
	}

```

**_Address.java_**

```java

	package com.in28minutes.oops.level2;

	public class Address {
		//state
		private String doorNo;
		private String streetInfo;
		private String city;
		private String zipCode;

		//creation
		public Address(String doorNo, String streetInfo, String city, String zipCode) {
			this.doorNo = doorNo;
			this.streetInfo = streetInfo;
			this.city = city;
			this.zipCode = zipCode;
		}

		//behaviors
	}

```

**_Customer.java_**

```java

	package com.in28minutes.oops.level2;

	public class Customer {
		//state
		private String name;
		private Address homeAddress;
		private Address workAddress;

		//creation
		//workAddress not mandatory for creation
		public Customer(String name, String homeAddress) {
			this.name = name;
			this.homeAddress = homeAddress;
		}

		//behaviors
	}

```

##### Snippet-9 : Object Composition v3 : Behaviors

Let's add methods to provide behavior.

**_CustomerRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class CustomerRunner {
		public static void main(String[] args) {
			//Customer customer = new Customer();
			Address homeAddress = new Address("Flat No. 51", "Hiranandani Gardens", "Mumbai", "400076");
			Customer customer = new Customer("Ashwin Tendulkar", homeAddress);
			System.out.println(customer);
			Address workAddress = new Address("Administrative Office", "Western Block", "Mumbai", "400076");
			customer.setWorkAddress(workAddress);
			System.out.println(customer);
		}
	}

```

**_Address.java_**

```java

	package com.in28minutes.oops.level2;

	public class Address {
		//state
		private String doorNo;
		private String streetInfo;
		private String city;
		private String zipCode;

		//creation
		public Address(String doorNo, String streetInfo, String city, String zipCode) {
			super();
			this.doorNo = doorNo;
			this.streetInfo = streetInfo;
			this.city = city;
			this.zipCode = zipCode;
		}

		//behaviors
		public String toString() {
			return doorNo + ", " + streetInfo + ", " + city + " - " + zipCode;
		}
	}

```

**_Customer.java_**

```java

	package com.in28minutes.oops.level2;

	public class Customer {
		//state
		private String name;
		private Address homeAddress;
		private Address workAddress;

		//creation
		//workAddress not mandatory for creation
		public Customer(String name, String homeAddress) {
			this.name = name;
			this.homeAddress = homeAddress;
		}

		//behaviors
		//certain components of homeAddress and workAddress can be modified, not the name
		public void setHomeAddress(Address homeAddress) {
			this.homeAddress = homeAddress;
		}

		public void setWorkAddress(Address workAddress) {
			this.workAddress = workAddress;
		}

		public Address getHomeAddress() {
			return homeAddress;
		}

		public Address getWorkAddress() {
			return workAddress;
		}

		public String toString() {
			return String.format("Customer [%s] lives at [%s], works at [%s]", 
									name,
									homeAddress,
									workAddress);
		}
	}

```

**_Console Output_**

_Customer [Ashwin Tendulkar] lives at [Flat No. 51, Hiranandani Gardens, Mumbai - 400076], works at [null]_

_Customer [Ashwin Tendulkar] lives at [Flat No. 51, Hiranandani Gardens, Mumbai - 400076], works at [Administrative Office, Western Block, Mumbai - 400076]_

### Step 07: Programming Exercise PE-OOP-02

#### Exercises

Write a program that manages Books and their Reviews:

* Book:
	* Id
	* Name
	* Author
* Review:
	* Id
	* Description
	* Rating

```java

	Book book = new Book(123, "Object Oriented Programming With Java", "Ranga");
	book.addReview(new Review(10, "Great Book", 4));
	book.addReview(new Review(101, "Awesome", 5));
	System.out.println(book);

```

#### Solution To PE-OOP-02

**_BookReviewRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class BookReviewRunner {
		public static void main(String[] args) {
			Book book = new Book(123, "Object Oriented Programming With Java", "Ranga");
			book.addReview(new Review(10, "Great Book", 4));
			book.addReview(new Review(101, "Awesome", 5));
			System.out.println(book);
		}
	}

```

**_Review.java_**

```java

	package com.in28minutes.oops.level2;

	public class Review {
		private int id;
		private String description;
		private byte rating;

		public Review(int id, String description, byte rating) {
			this.id = id;
			this.description = description;
			this.rating = rating;
		}

		public String toString() {
			return "(Review-" + id + ", " + description + ", " + rating + ")";
		}
	}

```

**_Book.java_**

```java

	package com.in28minutes.oops.level2;

	public class Book {
		private int id;
		private String title;
		private String author;

		private ArrayList<Review> reviewList = new ArrayList<Review>();
		public Book(int id, String title, String author) {
			this.id = id;
			this.title = title;
			this.author = author;
		}

		public void addReview(Review review) {
			reviewList.add(review);
		}

		public String toString() {
			return "Book-" + id + ",  " + title + ", " + author + ", " + reviews);
		}
	}

```

**_Console Output_**

_Book-123, Object Oriented Programming With Java, Ranga, [(Review-10, Great Book", 4), (Review-101, Awesome, 5)]_

### Step 07: The Need For Inheritance

Let's look at two classes `Person` and `Student`.


**_Person.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Person {
		private String name;
		private String email;
		private String phoneNumber;
		
		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
	}

``` 

**_StudentWithoutInheritance.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class StudentWithoutInheritance {
		private String name;
		private String email;
		private String phoneNumber;
		private String college;
		private int year;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		public String getCollege() {
			return college;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

```

In above code examples, you can see that there is a lot of 
* The member fields of ```Person```, namely ```name```, ```email``` and ```phoneNumber```, are replicated in ```Student```.
* The setter and getter methods pertaining to the above fields of ```Person``` get repliated in ```Student``` as well.


Every `Student` is a `Person`. What if we could extend `Person` class instead of duplicating everything?

#### Enter Inheritance

```Student``` **is a** ```Person```. Java supports one of the basic Object Oriented Programming Paradigms : **Inheritance**.  

```Student``` can *inherit* from ```Person```, to model the fact that a ```Student``` *is a* ```Person```. 

This is accomplished by using the Java keyword ```extends```, during class definition of ```Student```. 

```java

	public class Person {
		// <Person Definition>
	}

	public class Student extends Person {
		// <Student Definition, after reusing Person Code>
	}

```

Inheritance is a mechanism of code reuse. In this case, all the fields and methods previously defined in ```Person``` are available for ```Student``` as well.

In this Inheritance relationship, ```Person``` is called the **super-class** of ```Student```. Likewise, ```Student``` is the **sub-class** of ```Person```.

Let's now look at how we go about changing the ```Student``` ```class``` definition.

##### Snippet-02 : Student inherits from Person - v1

**_Person.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Person {
		private String name;
		private String email;
		private String phoneNumber;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
	}

``` 


**_Student.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Student extends Person {
		private String collegeName;
		private int year;

		public void setCollegeName(String college) {
			this.collegeName = collegeName;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

```

**_StudentRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;
	public class StudentRunner {
		public static void main(String[] args)
			Student student = new Student();
			// < all setter() and getter() methods of Person and Student available >
			student.setName("Ranga");			
			student.setEmail("in28minutes@gmail.com");
		}
	}

```

### Step 09:  Introducing ```Object``` class

In the Java language, every class, whether an in-built Java library class, or a user-defined class, implicitly inherits from the class ```Object```. 

This ```Object``` class is available in the Java system package ```java.lang```. This class is at the root of the Java class hierarchy. All classes, including arrays, implement/inherit the methods of this ```class```. 

Let's take a look at the ```Person``` and ```Student``` classes.

##### Snippet-01 : The Object class

**_Person.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Person {
		private String name;
		private String email;
		private String phoneNumber;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
	}

``` 


**_Student.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Student extends Person {
		private String collegeName;
		private int year;
		
		public void setCollegeName(String college) {
			this.collegeName = collegeName;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

```

**_StudentRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class StudentRunner {
		public static void main(String[] args)
			//Student student = new Student();
			//student.setName("Ranga");
			//student.setEmail("in28minutes@gmail.com");

			Person person = new Person();
			String personStr = person.toString();
			System.out.println(personStr);
			System.out.println(person);
			int hashCode = person.hashCode();			
			person.notify();
		}
	}

```

**_Console Output_**

_com.in28minutes.oops.level2.inheritance.Person@7a46a697_

_com.in28minutes.oops.level2.inheritance.Person@7a46a697_

##### Snippet-01 Explained

Methods of the ```Object``` ```class``` such as ```toString()```, ```hashCode()``` and ```notify()``` are available to objects of ```class``` ```Person``` as default implementations.

The statement ```System.out.println(person);``` actually gets translated to ```System.out.println(person.toString())```, as the Java system implicitly makes the call ```person.toString()``` as it is inherited from ```class``` ```Object``` for use in the ```String``` context.

### Step 10: Inheritance And Method Overriding

Sub-class inherit features from super-class
* state attributes : super-class member variables
* behavior components  : super-class method definitions

These are of course, available for access (and modification), and invocation, respectively, within the sub-class. 

You can also override super class method implementations in a sub class - **method overriding**. 

##### Snippet-01: Method Overriding

**_Person.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Person {
		private String name;
		private String email;
		private String phoneNumber;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public String toString() {
			return String.format("Person %s , Email : %s, Phone Number : %s", name, email, phoneNumber);
		}
	}

``` 

**_PersonRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class PersonRunner {
		public static void main(String[] args)
			Person person = new Person();
			person.setName("Ranga");
			person.setEmail("in28minutes@gmail.com");
			person.setPhoneNumber("9898989898");
			String personStr = person.toString();
			System.out.println(personStr);
			System.out.println(person);
		}
	}

```

**_Console Output_**

_Person Ranga , Email : in28minutes@gmail.com, Phone Number : 9898989898_

_Person Ranga , Email : in28minutes@gmail.com, Phone Number : 9898989898_

##### Snippet-01 Explained

By defining the method ```toString()``` within the ```Person``` sub-```class```, we are overriding the default version provided by the ```Object``` super-```class```.

### Step 11: Classroom Exercise CE-OOP-01 

Create an Employee class extending Student Class with following attributes:
* Title
* Employer
* EmployeeGrade
* Salary

Create a method toString() within Employee to print all state attribute values, including those of Person.

##### Snippet-01 : Employee Inheritance

**_Person.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Person {
		private String name;
		private String email;
		private String phoneNumber;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public String toString() {
			return Sring.format("Person %s , Email : %s, Phone Number : %s", name, email, phoneNumber);
		}
	}

``` 

**_Employee.java_**

```java

	package com.in28minutes.oops.level2.inheritance;
	import java.math.BigDecimal;

	public class Employee extends Person {
		private String title;
		private String employerName;
		private char employeeGrade;
		private BigDecimal salary;

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setEmployerName(String employer) {
			this.employerName = employerName;
		}

		public String getEmployerName() {
			return employerName;
		}

		public void setEmployeeGrade(char  employeeGrade) {
			this.employeeGrade = employeeGrade;
		}

		public char getEmployeeGrade() {
			return employeeGrade;
		}

		public void setSalary(BigDecimal  salary) {
			this.salary = salary;
		}

		public BigDecimal getSalary() {
			return salary;
		}

		public String toString() {
			return String.format("Employee Title: %s, Employer: %s, Employee Grade: %c, Salary: %s",
									title,
									employerName,
									employeeGrade,
									salary);
		}
	}

```

**_EmployeeRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class EmployeeRunner {
		public static void main(String[] args) {
			Employee employee = new Employee();
			employee.setName("Ranga");
			employee.setEmail("in28minutes@gmail.com");
			employee.setPhoneNumber("123-456-7890");
			employee.setTitle("Programmer Analyst");
			employee.setEmployerName("In28Minutes");
			employee.setEmployeeGrade('A');
			employee.setSalary(new BigDecimal("50000"));
			System.out.println(employee);
		}
	}

```

**_Console Output_**

_Employee Title: Programmer Analyst, Employer: In28Minutes, Employee Grade: A, Salary: 50000.0000_

##### Snippet-01 Explained

We have not printed the underlying ```Person``` object details in ```Employee.toString()``` method overriding. Let's look to do that next.

### Step 12: Constructors, And Calling ```super()``` 

The ```super``` keyword allows an sub-class to access the attributes present in the super-class. 

##### Snippet-01 : Calling Person.toString()

**_Employee.java_**

```java

	package com.in28minutes.oops.level2.inheritance;
	import java.math.BigDecimal;

	public class Employee extends Person {
		//focusing only on the toString() method
		public String toString() {
			return String.format("Employee Name: %s, Email: %s, Phone Number: %s, Title: %s, Employer: %s, Employee Grade: %c, Salary: %s",
									super.getName(),
									super.getEmail(),
									super.getPhoneNumber(),
									title,
									employerName,
									employeeGrade,
									salary);
		}
	}

```

**_EmployeeRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;
	
	public class EmployeeRunner {
		public static void main(String[] args) {
			Employee employee = new Employee();
			employee.setName("Ranga");
			employee.setEmail("in28minutes@gmail.com");
			employee.setPhoneNumber("123-456-7890");
			employee.setTitle("Programmer Analyst");
			employee.setEmployerName("In28Minutes");
			employee.setEmployeeGrade('A');		
			employee.setSalary(new BigDecimal("50000"));
			System.out.println(employee);
		}
	}

```

**_Console Output_**

_Employee Name: Ranga, Email: in28minutes@gmail.com, Phone Number: 123-456-7890, Title: Programmer Analyst, Employer: In28Minutes, Employee Grade: A, Salary: 50000.0000_

The ```super``` keyword allows an sub-class to access the attributes present in the super-class. Hence, we were able to invoke the getter methods of the ```Person``` object within the ```Employee``` object, like this within ```Employee.toString()```
	* ```super.getName()```
	* ```super.getEmail()```
	* ```super.getPhoneNumber()```


#### Sub-Class Contructor 

What happens when a sub class object is created? Does the super class constructor get called?

##### Snippet-7 : Person class

**_Person.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Person {

		public Person() {
			System.out.println("Inside Person Constructor");
		}

	}

``` 

**_Employee.java_**

```java

	package com.in28minutes.oops.level2.inheritance;
	import java.math.BigDecimal;

	public class Employee extends Person {

		public Employee() {
			//super();
			System.out.println("Inside Employee Constructor");
		}

	}

```

**_EmployeeRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class EmployeeRunner {
		public static void main(String[] args) {
			Employee employee = new Employee();
		}
	}

```

**_Console Output_**

_Inside Person Constructor_

_Inside Employee Constructor_

##### Snippet-02 Explained

When a sub-class object is created
* sub-class constructor is called and it implicitly invokes its super-class constructor. 

The Java compiler inserts the code ```super();``` (if it is not explicitly added by the programmer) as the first statement in the body of the sub-class default constructor, here ```Employer()```. 
* The statement ```super();``` is the invocation of the super-class default constructor. 
* Hence, the body of the super-class constructor is always invoked before the body of the sub-class constructor.

##### Snippet-3 : ```Person``` - Non-Default Constructor

Let's remove the no argument constructor and add a one argument constructor to `Person` class.

```
		public Person(String name) {
			this.name = name;
		}
```

**_PersonRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class PersonRunner {
		public static void main(String[] args)
			Person person = new Person("Ranga");
			person.setEmail("in28minutes@gmail.com");
			person.setPhoneNumber("123-456-7890");
			System.out.println(person);
		}
	}

```

**_Console Output_**

_Person Ranga , Email : in28minutes@gmail.com, Phone Number : 123-456-7890_

##### Snippet-03 Explained

When we added the constructor with one argument for ```class``` ```Employee```, the existing code in **_EmployeeRunner.java_** will cause a compilation error, because there is no longer any default constructor for ```Person``` ! 

```super()``` cannot be called from within the default constructor of ```Employee```.

One option is to put the no argument constructor back.

```java

	public Person() {
		System.out.println("Inside Person Constructor");
	}

```

But, it doesn't really make sense to create a ```Person``` without a ```name```, does it? 

The solution in this case would be to call the single-argument constructor ```Person(String)``` by an invocation such as ```super(name);```

```
		public Employee(String name, String title, String employerName, char employeeGrade) {
			super(name);
			this.title = title;
			this.employerName = employerName;
			this.employeeGrade = employeeGrade;
		}
```

**_EmployeeRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;
	
	public class EmployeeRunner {
		public static void main(String[] args) {
			Employee employee = new Employee("Ranga", "Programmer Analyst", "In28Minutes", 'A');
			System.out.println(employee);
		}
	}

```

**_Console Output_**

_Employee Name: Ranga, Email: null, Phone Number: null, Title: Programmer Analyst, Employer: In28Minutes, Employee Grade: A, Salary: null_

##### Snippet-10 : EmployeeRunner complete

Let's provide setters to set the non mandatory attributes.

**_EmployeeRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class EmployeeRunner {
		public static void main(String[] args) {
			Employee employee = new Employee("Ranga", "Programmer Analyst", "In28Minutes", 			'A');
			employee.setEmail("in28minutes@gmail.com");
			employee.setPhoneNumber("123-456-7890");
			employee.setSalary(new BigDecimal("50000"));
			System.out.println(employee);
		}
 	}

```

**_Console Output_**

_Employee Name: Ranga, Email: in28minutes@gmail.com, Phone Number: 123-456-7890, Title: Programmer Analyst, Employer: In28Minutes, Employee Grade: A, Salary: 50000.0000_


##### Snippet-10: ```Student``` updated

Let's add a two argument construtor to the `Student` class.

**_Student.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class Student extends Person {
		private String collegeName;
		private int year;
	
		public Student(String name, String collegeName) {
			super(name);
			this.collegeName = collegeName;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public String toString() {
			return "Student : " + super.name() + ", College: " + collegeName;
		}
	}

```

**_StudentRunner.java_**

```java

	package com.in28minutes.oops.level2.inheritance;

	public class StudentRunner {
		public static void main(String[] args)
			//Student student = new Student();
			Student student = new Student("Ranga", "IIT Bombay");
			System.out.println(student);
		}
	}

```

**_Console Output_**

_Student : Ranga, College : IIT Bombay_

### Step 13: Multiple Inheritance, Reference Variables And ```instanceof```

In other programming languages, Multiple Inheritance is allowed. A class can directly inherit from two or more classes. 

However, in Java, direct Multiple Inheritance is not allowed.

##### Snippet-01 : Multiple Inheritance

```java

	jshell> class Animal {
	   ..>> }
	| created class Animal
	jshell> class Pet {
	   ..>> }
	| created class Pet

	jshell> class Dog extends Animal, Pet {
	   ..>> }
	| Error:
	| '{' expected
	| class Dog extends Animal, Pet {
	|_________________________^
	jshell>**

```

`class Dog extends Animal, Pet {}` throws an error. You cannot extend two classes.

#### Inheritance Chains

However you can create an inheritance chain.
*  ```class``` ```C``` **is a** ```class``` ```B```
*  ```class``` ```B``` **is a** ```class``` ```A```

Let's check out a small code snippet.

##### Snippet-02 : An Inheritance Chain

`Dog``` **is a** ```Pet```, ```Pet``` **is a** ```Animal```. This is an example of what is called an **inheritance hierarchy**.

```java

	jshell> class Animal {
	   ..>> }
	| created class Animal
	jshell> class Pet extends Animal {
	   ..>> public void groom() {
	   ..>> System.out.println("Pet Groom");
	   ..>> }
	   ..>> }
	| created class Pet_
	jshell> class Dog extends Pet {
	   ..>> }
	| created class Dog
```

 If you want, you can visualize in your mind as :  *```Dog``` --> ```Pet``` --> ```Animal``` --> ```Object```* (Yes, ```Object``` is sitting at the top of *all* inheritance hierarchies in Java!)

The statement ```Dog dog = new Dog();``` sets off constructor invocations up the inheritance hierarchy:
	*  ```Dog()``` invokes ```Pet()```
		*  ```Pet()``` invokes ```Animal()```
			*  ```Animal()``` invokes ```Object()```


```java
	jshell> Dog dog = new Dog();
	dog ==> Dog@23a6e47f
```

The expression ```dog.toString()``` does a traversal up the inheritance hierarchy as well:
	* Since ```Dog.toString()``` is not defined, the compiler looks for ```Pet.toString()```
	* Since ```Pet.toString()``` is not defined, the compiler looks for ```Animal.toString()```
	* Since ```Animal.toString()``` is not defined, the compiler looks for ```Object.toString()```, which is always provided as the default implementation for all sub-classes of ```class``` ```Object``` in Java.

```java
	jshell> dog.toString();
	$1 ==> "Dog@23a6e47f"
```

The invocation ```dog.groom();``` is also resolved by traversing up the inheritance hierarchy.

```java
	jshell> dog.groom();
	"Pet Groom"
```


The statement ```Pet pet = new Dog();``` is really interesting. In Java, it is permitted for a *super-class reference variable to reference a sub-class object instance*.

Through such a reference, method invocations are also permitted, and the correct thing gets done. Hence, ```pet.groom();``` causes the output "*```Pet Groom```*".

However, the converse assignment is not allowed. *A sub-class reference variable*  **_cannot_** *reference a super-class object instance*. 
	* The statement ```Dog dog = new Pet();``` therefore, causes a compiler error. 

```java
	jshell> Pet pet = new Dog();
	pet ==> Dog@22d37d54
	jshell> pet.groom();
	Pet Groom
```

```java
	jshell> Dog dog = new Pet();
	| Error:
	| incompatible types: Pet cannot be converted to Dog
	| Dog dog = new Pet();
	|___________^-------^
```



The ```instanceof``` operator is to find the relationship between an object and a class. If the object is an instance of the class or its sub class, it returns true. 


```java
	jshell> pet instanceof Pet
	$2 ==> true
	jshell> pet instanceof Dog
	$3 ==> true
```

The ```instanceof``` operator throws an error if the object and class are unrelated.

```java
	jshell> pet instanceof String
	| Error:
	| incompatible types: Pet cannot be converted to java.lang.String
	| pet instanceof String
	|_^-^
	jshell> pet instanceof Animal
	$4 ==> true
	jshell> pet instanceof Object
	$5 ==> true
```

The ```instanceof``` operator returns ```false``` if the object is an instance of a super class of the class provided.

```java
	jshell> Animal animal  new Animal();
	animal ==> Animal@3632be31
	jshell> animal instanceof Pet
	$6 ==> false
	jshell> animal instanceof Dog
	$7 ==> false
	jshell> animal instanceof Object
	$8 ==> true
	jshell>

```

### Step 14: Introducing Abstract Classes

An ```abstract class``` can contain ```abstract``` methods.

An abstract method does not have a method definition.

Here's how a typical class looks like. You can create methods inside the class and you can create instances of the class.

```java

	jshell> class Animal {
	   ..>> public void bark() {
	   ..>> System.out.println("Animal Bark");
	   ..>> }
	   ..>> }
	| created class Animal
	jshell> Animal animal = new Animal();
	animal ==> Animal@335eadca
	jshell> animal.bark();
	Animal Bark
```

Let's see how to create an abstract class:

```java
	jshell> abstract class AbstractAnimal {
	   ..>> abstract public void bark();
	   ..>> }
	| created class AbstractAnimal
```

The syntax is simple: add `abstract` keyword before the class.

An ```abstract class``` cannot be instantiated.
```java
	jshell> AbstractAnimal animal = new AbstractAnimal();
	| Error:
	| AbstractAnimal is abstract; cannot be instantiated.
	| AbstractAnimal animal = new AbstractAnimal();
	|^--------------------------------------------^
	jshell>
```

However, it can be sub-classed, creating inheritance hierarchies below it.  A sub-class of an abstract class (often called a **concrete class**) must override its ```abstract``` methods. 


```java
	jshell> class Dog extends AbstractAnimal {
	   ..>> }
	| Error:
	| Dog is not abstract and does not override abstract method bark() in AbstractAnimal
	| class Dog extends AbstractAnimal {
	|^----------------------------------...
	jshell> class Dog extends AbstractAnimal {
	   ..>> public void bark() {
	   ..>> System.out.println("Bow Bow");
	   ..>> }
	   ..>> }
	| created class Dog
	jshell> Dog dog = new Dog();
	dog ==> Dog@5a8e6209
	jshell> dog.bark();
	Bow Bow
	
```

### Step 15: Abstract Classes - Design Aspects

Why do we need an abstract class?

Consider a feast being prepared at a home, and several dishes are on the menu for the event. Obviously, each dish would have certain procedure for it to be prepared. Cooking any dish normally involves following a tried and tested recipe, and its preparation boils down to these basic steps:
* Prepare the Ingredients
* Cook the Recipe
* Cleanup (the Mess created!)

These steps would be different for each dish but the order of steps remain the same.


##### Snippet-01 : The Recipe Hierarchy 

Let's use abstract class to build the recipe.

**_AbstractRecipe.java_**

```java

	package com.in28minutes.oops.level2;

	public abstract class AbstractRecipe {
		public void execute() {
			prepareIngredients();
			cookRecipe();			
			cleanup();
		}

		abstract void prepareIngredients();
		abstract void cookRecipe();
		abstract void cleanup();
	}

```

We defined abstract methods for each of the steps and created an `execute` method calling them. `execute` method ensures that the order of method call is followed.

You can define implementations implementing the abstract methods.

**_CurryRecipe.java_**

```java

	package com.in28minutes.oops.level2;

	public class CurryRecipe extends AbstractRecipe {
		public CurryRecipe() {
			System.out.println("[Curry Preparation Method]");
		}

		@Override
		void prepareIngredients() {
			System.out.println("Get Vegetables Cut and Ready");
			System.out.println("Get Spices Ready");
		}

		@Override
		void cookRecipe() {
			System.out.println("Steam And Fry Vegetables");
			System.out.println("Cook With Spices");
			System.out.println("Add Seasoning");
		}

		@Override
		void cleanup() {
			System.out.println("Discard unused Vegetables");
			System.out.println("Discard unused Spices");
		}
	}

```

**_RecipeRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class RecipeRunner {
		public static void main(String[] args) {
			CurryRecipe curryRecipe = new CurryRecipe();
			curryRecipe.execute();
		}
	}

```

**_Console Output_**

_[Curry Preparation Method]_

_Get Vegetables Cut and Ready_

_Get Spices Ready_

_Steam And Fry Vegetables_

_Cook With Spices_

_Add Seasoning_

_Discard unused Vegetables_

_Discard unused Spices_

##### Snippet-01 Explained

`CurryRecipe` defines what needs to be done in each step. When we invoke the `execute` method, the steps are executed in order.

##### Snippet-02 : MicrowaveCurryRecipe

We can easily create more recipes.

**_MicrowaveCurryRecipe.java_**

```java

	package com.in28minutes.oops.level2;
	
	public class MicrowaveCurryRecipe extends AbstractRecipe {
		public MicrowaveCurryRecipe() {
			System.out.println("[Curry Microwave Method]");
		}

		@Override
		void prepareIngredients() {
			System.out.println("Get Vegetables Cut and Ready");
			System.out.println("Switch on Microwave");
		}

		@Override
		void cookRecipe() {
			System.out.println("Microwave Vegetables");
			System.out.println("Add Seasoning");
		}

		@Override
		void cleanup() {
			System.out.println("Switch Off Microwave");
			System.out.println("Discard unused Vegetables");
		}
	}

```

**_RecipeRunner.java_**

```java

	package com.in28minutes.oops.level2;

	public class RecipeRunner {
		public static void main(String[] args) {
			MicrowaveCurryRecipe mcirowaveRecipe = new MicrowaveCurryRecipe();
			microwaveRecipe.execute();
		}
	}

```


**_Console Output_**

_[Curry Microwave Method]_

_Get Vegetables Cut and Ready_

_Switch on Microwave_

_Microwave Vegetables_

_Add Seasoning_

_Switch off Microwave_

_Discard unused Vegetables_

##### Snippet-02 Explained

`MicrowaveCurryRecipe` defines what needs to be done in each step. When we invoke the `execute` method, the steps are executed in order. 

#### Summary

This pattern is called a `Template method` pattern. You define an abstract class with the order of steps defined. You leave the implementation of each of the steps to the sub classes.

### Step 16: Abstract Classes - Puzzles

Let's look a few FAQ regarding abstract classes.

An ```abstract class``` can be created, without any ```abstract``` member methods.

```java

	jshell> abstract class AbstractTest {
	   ...>}
	| creates abstract class AbstractTest
```

An ```abstract class``` can be a sub class to create another ```abstract class```, without overriding any of the super-class ```abstract``` methods.

```java
	jshell> abstract class AbstractAlgorithm {
	   ...> abstract void flowChart();
	   ...> }
	| creates abstract class AbstractAlgorithm
	jshell> abstract class AlgorithmTypeOne extends AbstractAlgorithm {
	   ...> }
	| creates abstract class AlgorithmTypeOne

```

An ```abstract class``` can have member variables.
```java
	jshell> abstract class AbstractAlgorithm {
	   ...> private int stepCount;
	   ...> }
	| replaced abstract class AbstractAlgorithm
```

An ```abstract class``` can have non-abstract methods.
```java
	jshell> abstract class AbstractAlgorithm {
	   ...> private int stepCount;
	   ...> public int getStepCount() {
	   ...> return stepCount;
	   ...> }
	   ...> }
	| replaced abstract class AbstractAlgorithm
	jshell>

```


### Step 17: Introducing Interfaces
- - - 

What does a "*gaming console*" mean to you?

A device that has buttons or other controls on it, that enable us to play video games.

What are the typical buttons on it?
- Arrows - up down left right
- Select
- etc

Gaming console offers an interface to play your games.

Who provides the implementation of what happens when a button is clicked? The game implementor - for example, the implementor of Mario game or the Chess game.

How do you represent this in Java program?


**_GamingConsole.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public interface GamingConsole {
		public void up();
		public void down();
		public void left();
		public void right();
	}

```


```interface``` ```GamingConsole``` contains methods without definitions. 

Who provides the implementations?

Welcome `MarioGame`.

**_MarioGame.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class MarioGame implements GamingConsole {
		@Override
		public void up() {
			System.out.println("Jump");
		}

		@Override
		public void down() {
			System.out.println("Go into a hole");
		}

		@Override
		public void left() {
		}

		@Override
		public void right() {
			System.out.println("Go Forward");
		}
	}

```

`MarioGame` provides a definition for all the methods declared in the interface `GamingConsole`. Syntax is simple. `class MarioGame implements GamingConsole` and implement all the methods.

Let's look at how you can run these games.

**_GameRunner.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class GameRunner {
		public static void main(String[] args) {
			MarioGame game = new MarioGame();
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}

```


**_Console Output_**

_Jump_

_Go into a hole_

_Go forward_

##### Snippet-01 Explained

The main advantage of having an interface is that it can be used to enforce a contract for its implementors. 

##### Snippet-02 : Code Reuse With Interfaces

Let's look at another example - `ChessGame`.

**_ChessGame.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class ChessGame implements GamingConsole {

		@Override
		public void up() {
			System.out.println("Move Piece Up");
		}

		@Override
		public void down() {
			System.out.println("Move Piece Down");
		}

		@Override
		public void left() {
			System.out.println("Move Piece Left");
		}

		@Override
		public void right() {
			System.out.println("Move Piece Right");
		}
	}

```

Running it is simple. All that you need to do is to comment out `MarioGame game = new MarioGame();` and replace it with an implementation of `ChessGame`.

**_GameRunner.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class GameRunner {
		public static void main(String[] args) {
			//MarioGame game = new MarioGame();
			ChessGame game = new ChessGame();
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}

```

**_Console Output_**

_Move Piece Up_

_Move Piece Down_

_Move Piece Left_

_Move Piece Right_

##### Snippet-2 explained

In the same ```GamerRunner``` ```class```, if we now instantiate a ```ChessGame``` object instead of a ```MarioGame``` one, none of the other code needs to change. This is because both ```MarioGame``` and ```ChessGame``` implement the same ```interface```, ```GamingConsole```. 

#### Using Interface as type for reference variable

```GamingConsole``` is an interface.```MarioGame``` and ```ChessGame``` are it's implementations.

Let's try this -  `GamingConsole game = new ChessGame();`

**_GameRunner.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class GameRunner {
		public static void main(String[] args) {
			GamingConsole game = new ChessGame();
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}

```

**_Console Output_**

_Move Piece Up_

_Move Piece Down_

_Move Piece Left_

_Move Piece Right_

#### Explained
`GamingConsole game = new ChessGame();` - You can store an implementation of an interface into a reference variable of the type of the interface.

How does this help?

Let's look at the next example:

##### Snippet-4 : GameRunner Version 4

**_GameRunner.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class GameRunner {
		public static void main(String[] args) {
			GamingConsole game = new MarioGame();
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}

```

**_Console Output_**

_Jump_

_Go into a hole_

_Go forward_

##### Snippet-04 Explained

You can replace `GamingConsole game = new ChessGame()` with `GamingConsole game = new MarioGame()` and now the program runs the `MarioGame`. Isn't it awesome?

### Step 18: Using Interfaces To Design APIs

Consider a Software Development project, which involves programming a fairly large and complex application.  Project team (Team A) decided to out-source part of this project to an external team (Team B). Let's say this external team needs to implement a farily complex algorithm to achieve a specific task, and which needs to interface with the rest of the application. Work on both parts of the application needs to proceed simultaneously.

Suppose the algorithm logic is implemented using a single method:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;```int complexAlgorithm(int number1, int number2);```

How do we ensure that the work done by both the teams remains compatible?

They start with defining an interface.

**_ComplexAlgorithm.java_**

```java
  
	package com.in28minutes.oops.level2.interfaces;

	public interface ComplexAlgorithm {
		int complexAlgorithm(int number1, int number2);
	}

```

Now the teams can go on their merry way. Team A can create a stub for the interface `OneComplexAlgorithm` and start working on their project.

**_OneComplexAlgorithm.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class OneComplexAlgorithm {
		public int complexAlgorithm(int number1, int number2) {
			return number1 + number2;
		}
	}

```

Team B can take time to implement the actual algorithm.

**_ActualComplexAlgorithm.java_**

```java

	package com.in28minutes.oops.level2.interfaces;

	public class ActualComplexAlgorithm {
		public int complexAlgorithm(int number1, int number2) {
			//Your complex implementation will be present here..
			return number1 * number2;
		}
	}

```

### Step 19: Interfaces - Puzzles And Interesting Facts
- - -  

Let's look at a few examples to understand interfaces further.


An ```interface``` can be extended by another ```interface```. We can have an inheritance hierarchy purely consisting of interfaces.

```java

	jshell> interface InterfaceOne {
	   ...> void methodOne();
	   ...> }
	| created interface InterfaceOne

	jshell> interface InterfaceTwo extends InterfaceOne {
	   ...> void methodTwo();
	   ...> }
	| created interface InterfaceTwo
```

An implementation of interface should implement all its methods including the methods in its super interfaces.

```java
	jshell> class Implementation implements InterfaceTwo {
	   ...>}
	| Error:
	| Implementation is not abstract and does not implement abstract method methodTwo() of 	InterfaceTwo
	| class Implementation implements InterfaceTwo {
	|^---------------------------------------------...

	jshell> public class Implementation implements InterfaceTwo {
	   ...> public void methodTwo() {}
	   ...> }
	| Error:
	| Implementation is not abstract and does not implement abstract method methodOne() of 	InterfaceOne
	| class Implementation implements InterfaceTwo {
	|^---------------------------------------------...

	jshell> public class Implementation implements InterfaceTwo {
	   ...> public void methodTwo() {}
	   ...> public void methodOne() {}
	   ...> }
	| created class Implementation
```

If a class is declared as abstract, it can skip providing implementations for all interface methods.
```java
	jshell> public abstract class AbstractImplementation implements InterfaceTwo {
	   ...> public void methodOne() {}
	   ...> }
	| created class AbstractImplementation
```

```interfaces``` cannot have member variables. An ```interface``` can only have declared **constants**

```java
	jshell> interface InterfaceThree {
	   ...> int test;
	   ...> }
	| Error:
	| = expected 
	| int test;
	|_________^

	jshell> interface InterfaceThree {
	   ...> int test = 5;
	   ...> }
	| created interface InterfaceThree
```

Starting from Java SE 8, an interface can provide a default implementation of the methods it provides.  It can be done by including the keyword ```default``` in the signature of that method, and providing a body to that method in its definition.


```java
	jshell> interface InterfaceFour {
	   ...> public default void print() {
	   ...> System.out.println("default print");
	   ...> }
	   ...> }
	| created interface InterfaceFour

	jshell> class TestPrint implements InterfaceFour {
	   ...> }
	| created class TestPrint


	jshell> TestPrint testPrint = new TestPrint();
	testPrint ==> TestPrint@6ebc05a6
	jshell> testPrint.print();
	default print
```

Implementations of ```interface``` can override the default method implementation.

```java
	jshell> class ParticularPrint implements InterfaceFour {
	   ...> public void print() {
	   ...> System.out.println("particular print");
	   ...> }
	   ...> }
	| created class ParticularPrint
```
```java
	jshell> ParticularPrint particularPrint = new ParticularPrint();
	particularPrint ==> ParticularPrint@5fad14c4
	jshell> particularPrint.print();
	particular print
	jshell>

```

No method declared inside an ```interface``` can be qualified with the ```private``` access specifier. However, an ```abstract class``` can have ```private``` methods declared within.


#### Why do we need ```default``` method implementations.

Let's consider a `Provider` interface with three implementations.

```java

	public interface Provider {
		public void doSomething();
	}

	public class ImplementorOne {
		@Override
		public void doSomething() {
			System.out.println("Do One");
		}
	}

	public class ImplementorTwo {
		@Override
		public void doSomething() {
			System.out.println("Do Two");
		}
	}

	public class ImplementorThree {
		@Override`
		public void doSomething() {
			System.out.println("Do Three");
		}
	}

```

What happens if a new method is added to the `interface`?

```java

	public interface Provider {
		public void doSomething();
		public void doMore();
	}

```

Compilation Error! All implementations classes ```ImplementationOne```, ```ImplementationTwo``` and ```ImplementationThree``` **must** me updated to implement ```doMore()``` in each case. 

Alternative : provide a default implementation for `doMore`.

```java

	public interface Provider {
		public void doSomething();
	
		public default void doMore(){
			System.out.println("Do More");
		}
	}

```

No other code needs to immediately change, and specific implementation classes can override this default version, as and when needed.

This is especially useful in building and extending frameworks. You are not breaking a user of your framework interface when you add new methods to the interface.

### Step 20:  ```abstract class``` And ```interface``` : A Comparison

```abstract class``` and ```interface``` are very different, except that they have a very similar syntax. 

When would you want to use them in your application?

#### interface

```interface``` is a **Contract**.

An ```interface``` is primarily used when you have two software components that need to communicate with each other, and there is a need to establish a contract. 

Recall the following example: `ComplexAlgorithm` defines the interface which helps both the teams involved.

```java

	package com.in28minutes.oops.level2.interfaces;
	public interface ComplexAlgorithm {
		int complexAlgorithm(int number1, int number2);
	}

```

#### abstract class

An ```abstract class``` is primarily used when you want to generalize behavior by creating a super class. 

Recall the following example we had discussed:

```java

	public abstract class AbstractRecipe {
		public void execute() {
			prepareIngredients();
			cookRecipe();
			cleanup();
		}

		abstract void prepareIngredients();
		abstract void cookRecipe();
		abstract void cleanup();
	}

```
 
#### Syntactical Comparison

Here are important syntactical differences:
* No method declared inside an ```interface``` can be qualified with a ```private``` access specifier. However, an ```abstract class``` can have ```private``` methods.
* An ```interface``` cannot have declared member variables. An ```abstract class``` can have member variable declarations.
* A ```class``` or an ```abstract class``` can implement multiple ```interface```s. But, an ```interface``` can extend only one ```interface```, and a ```class``` or an ```abstract class``` can extend only one ```class``` or ```abstract class```.

### Step 21: Programming Exercise PE-OOP-03

#### Exercises

TODO

#### Solution To PE-OOP-03

#### Solution - 1

#### Solution - 2

### Step 21: Introducing Polymorphism

TODO

