# A complete set of frequently asked Object-Oriented Programming (OOP) Interview Questions and Answers:
### List :
1. [CodeXam OOPs Course Chapter 1 FAQ:](#codexam-oops-course-chapter-1-faq)
***********************************
## CodeXam OOPs Course Chapter 1 FAQ: 
Topic : 
1. Basic Terminologies
2. Creating Our Own Java Class
3. Access modifiers, Getters & Setters
4. Constructors in Java

### 1. Explain in brief what do you mean by Object Oriented Programming in Java?
#### Answer:
OOP deals with objects, like real-life entities such as pen, mobile, bank account which has state (data) and behavior (methods).

With help of access, specifiers access to this data and methods is made secured. Concepts of encapsulation and abstraction offer data hiding and access to essentials, inheritance, and polymorphism help code reuse and overloading/overriding of methods and constructors, making applications platform-independent, secured and robust using languages like Java

### 2. Explain is Java a pure Object Oriented Programming language?
#### Answer:
Java is not an entirely pure object-oriented programming language. 

**In Simple terms:** Because For a Language to be "pure Object-Oriented" Must Not contain any primitive Data type as non-object form. In JAVA we use data types like int, float, double etc. which are not object-oriented

- Java supports and uses primitive data types such as int, float, double, char, etc.
- Primitive data types are stored as variables or on the stack instead of the heap.
- In Java, static methods can access static variables without using an object, contrary to object-oriented concepts.

### 3. What is the difference between Java and C++?

#### Answer:

<div class="table-wrapper">

<p>Differences between Java and C++ are as follows:<strong>&nbsp;</strong></p>
                                        <figure class=table>
                                            <table>
                                                <thead>
                                                    <tr>
                                                        <th>Parameters</th>
                                                        <th>Java</th>
                                                        <th>C++</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>Founder</td>
                                                        <td>Java was developed by James Gosling at Sun Microsystems.
                                                        </td>
                                                        <td>C++ was developed by Bjarne Stroustrup at Bell Labs in 1979
                                                            as an extension of the C language.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>First Release</td>
                                                        <td>On May 23, 1995</td>
                                                        <td>In October 1985</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Stable Release</td>
                                                        <td>Java SE 18 released on 22 March 2022</td>
                                                        <td>C++20 &nbsp;released on 15th December 2020</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Official Website</td>
                                                        <td>oracle.com/java</td>
                                                        <td>isocpp.org</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Influenced By:</td>
                                                        <td>Java was Influenced by Ada 83, Pascal, C++, <a
                                                                href=https://www.geeksforgeeks.org/csharp-programming-language />C#</a>,
                                                            etc. languages.</td>
                                                        <td>C++ was Influenced by Influenced by Ada, ALGOL 68, C, ML,
                                                            Simula, Smalltalk, etc. languages.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Influenced to:</td>
                                                        <td>Java was influenced to develop BeanShell, C#, Clojure,
                                                            Groovy, Hack, J#, Kotlin, PHP, Python, Scala, etc.
                                                            languages.</td>
                                                        <td>C++ was influenced to develop C99, Java, JS++, Lua, Perl,
                                                            PHP, Python, Rust, Seed7, etc. languages.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Platform Dependency</td>
                                                        <td>Platform independent, Java bytecode works on any operating
                                                            system.</td>
                                                        <td>Platform dependent, should be compiled for different
                                                            platforms.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Portability</td>
                                                        <td>It can run in any OS hence it is portable.</td>
                                                        <td>C++ is platform-dependent. Hence it is not portable.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Compilation</td>
                                                        <td>Java is both Compiled and Interpreted Language.</td>
                                                        <td>C++ is a Compiled Language.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Memory Management</td>
                                                        <td>Memory Management is System Controlled.</td>
                                                        <td>Memory Management in C++ is Manual.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Virtual Keyword</td>
                                                        <td>It doesn&#8217;t have Virtual Keyword.</td>
                                                        <td>It has Virtual keywords.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Multiple Inheritance</td>
                                                        <td>It supports only single inheritance. Multiple inheritances
                                                            are achieved partially using interfaces.</td>
                                                        <td>It supports both single and multiple Inheritance.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Overloading</td>
                                                        <td>It supports only method overloading and doesn&#8217;t allow
                                                            operator overloading.</td>
                                                        <td>It supports both method and operator overloading.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Pointers</td>
                                                        <td>It has limited support for pointers.</td>
                                                        <td>It strongly supports pointers.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Libraries</td>
                                                        <td>It doesn&#8217;t support direct native library calls but
                                                            only Java Native Interfaces.</td>
                                                        <td>It supports direct system library calls, making it suitable
                                                            for system-level programming.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Libraries</td>
                                                        <td>Libraries have a wide range of classes for various
                                                            high-level services.</td>
                                                        <td>C++ libraries have comparatively low-level functionalities.
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>Documentation Comment</td>
                                                        <td>It supports documentation comments (e.g., /**.. */) for
                                                            source code.</td>
                                                        <td>It doesn’t support documentation comments for source code.
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>Thread Support</td>
                                                        <td>Java provides built-in support for multithreading.&nbsp;
                                                        </td>
                                                        <td>C++ doesn’t have built-in support for threads, depends on
                                                            third-party threading libraries.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Type</td>
                                                        <td>Java is only an object-oriented programming language.</td>
                                                        <td>C++ is both a procedural and an object-oriented programming
                                                            language.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Input-Output mechanism</td>
                                                        <td>Java uses the (System class): <strong>System.in</strong> for
                                                            input and <strong>System.out</strong> for output.</td>
                                                        <td>C++ uses <strong>cin</strong> for input and
                                                            <strong>cout</strong> for an output operation.
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>goto Keyword</td>
                                                        <td>Java doesn&#8217;t support goto Keyword</td>
                                                        <td>C++ supports goto keyword.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Structures and Unions</td>
                                                        <td>Java doesn&#8217;t support Structures and Unions.</td>
                                                        <td>C++ supports Structures and Unions.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Parameter Passing</td>
                                                        <td>Java supports only the Pass by Value technique.</td>
                                                        <td>C++ supports both Pass by Value and pass by reference.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Global Scope</td>
                                                        <td>It supports no global scope.</td>
                                                        <td>It supports both global scope and namespace scope.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Object Management</td>
                                                        <td>Automatic object management with garbage collection.</td>
                                                        <td>It supports manual object management using new and delete.
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>Call by Value and Call by reference</td>
                                                        <td>Java supports only call by value.</td>
                                                        <td>C++ both supports call by value and call by reference.</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Hardware</td>
                                                        <td>Java is not so interactive with hardware.</td>
                                                        <td>C++ is nearer to hardware.</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>  


### 4. Describe class and object in Java?
#### Answer: 
- Class is a prototype or a template that has state and behavior supported by an object and used in the creation of objects.
- The object is an instance of the class, for example, Human is a class with the state as having a vertebral system, brain, color, and height and has behavior such as canThink(), ableToSpeak(), etc.

### 5. What is the difference between class and object?
#### Answer:
<table class="tablepress tablepress-id-1776 tablepress-responsive">
  <thead>
    <tr class="row-1 odd">
      <th class="column-1">Class</th>
      <th class="column-2">Object</th>
    </tr>
  </thead>
  <tbody class="row-hover">
    <tr class="row-2 even">
      <td class="column-1">Class is a logical entity</td>
      <td class="column-2">Object is physical entity</td>
    </tr>
    <tr class="row-3 odd">
      <td class="column-1">
        Class is a template from which object can be created
      </td>
      <td class="column-2">Object is an instance of the class</td>
    </tr>
    <tr class="row-4 even">
      <td class="column-1">
        Class is a prototype that has the state and behavior of similar objects
      </td>
      <td class="column-2">
        Objects are entities that exist in real life such as mobile, mouse, or
        intellectual objects such as bank account
      </td>
    </tr>
    <tr class="row-5 odd">
      <td class="column-1">
        Class is declared with class key word like class Classname { }
      </td>
      <td class="column-2">
        Object is created via new keyword as Employee emp = new Employee();
      </td>
    </tr>
    <tr class="row-6 even">
      <td class="column-1">
        During class creation, there is no allocation of memory
      </td>
      <td class="column-2">
        During object creation, memory is allocated to the object
      </td>
    </tr>
    <tr class="row-7 odd">
      <td class="column-1">
        There is only one-way class is defined using the class keyword
      </td>
      <td class="column-2">
        Object creation can be done many ways such as using new keyword,
        newInstance() method, clone() and factory method.
      </td>
    </tr>
    <tr class="row-8 even">
      <td class="column-1">
        Real-life examples of Class can be a <br />
        •A recipe to prepare food.<br />
        •Blue prints for an automobile engine.<br />
      </td>
      <td class="column-2">
        Real-life examples of Object can be<br />
        •A food prepared from recipe.<br />
        •Engine constructed as per blue-prints.<br />
      </td>
    </tr>
  </tbody>
</table>

### 6. Why is a need for Object-oriented programming?
#### Answer:
- OOPs allows clarity in programming thereby allowing simplicity in solving complex problems
- Code can be reused through inheritance thereby reducing redundancy
- Data and code are bound together by encapsulation
- OOPs allows data hiding, therefore, private data is kept confidential
- Problems can be divided into different parts making it simple to solve
- The concept of polymorphism gives flexibility to the program by allowing the entities to have multiple forms

### 7. How many types of Modifiers in Java?
#### Answer:
- There are four types of modifiers in Java:
  - Access Modifiers
  - Non-access Modifiers

### 8. What are Access modifiers in java and explain?
#### Answer:
Access Modifiers are those modifiers that are used to restrict the visibility of classes, fields, methods, and constructors.

Java supports four types of access modifiers:

1. Private
2. Default
3. Protected
4. Public

**a) Private:** Private members of a class can be accessed only within the class. It cannot be accessed from outside the class.

**b) Default:** Default members of a class are accessible within the same package due to visible only within the package. They cannot be accessed from outside the package.

**c) Protected:** Protected members of a class are visible within the package. Therefore, we can only access within the package but can be accessed to the subclasses outside the package through the inheritance only.

**d) Public:** Public members are visible anywhere. So, we can access it anywhere within or outside the package.
  
### 9. Can we have a private constructor in Java?

#### Answer:
Yes, we can have a private constructor in Java.

- The private constructor is used when we do not want to create the object of that class.
- We cannot create a subclass of that class.
- It is also used in Singleton design and Factory method design patterns.

### 10. Which access modifiers can be used with a class?
#### Answer:
Public and Default access modifiers can be used with a class.

### 11. Can we instantiate the object of derived class if the parent constructor is protected?
#### Answer:
No, we cannot instantiate the object of derived class if the parent constructor is protected.

### 12. What are non-access modifiers in Java? Explain.
#### Answer:
There are four non-access modifiers in Java. They are as follows:

- Static
- Final
- Abstract
- Synchronized

a) Static: This modifier is used to check that a member is a class member or instance member. If you declare a class as static, this class will be executed first.

b) Final: Final is a keyword that is used to restrict the users. In other words, it is used to restrict further modification of a class, field, or method. If a class is declared as ‘final’, the class cannot be subclassed.

c) Abstract: Abstract is a keyword that is used with a class or a method. An abstract class or abstract method is used for further modification. If a class is declared as ‘abstract’, the class cannot be instantiated.

d) Synchronized: It is used to achieve thread safeness. Only one thread can enter in a synchronized method or block at a given time.

### 13. Why are access modifiers used?
#### Answer:
Access modifiers are used to restrict the access of classes, fields, methods, and constructors.

### 14. Which is the default access modifier?
#### Answer:
‘Internal’ is the default access modifier if no access modifier is mentioned with a class or its members. Internal is a keyword that is used for declaration.

### 15. Which is the least restrictive access modifier in Java?
#### Answer:
Public is the least restrictive access modifier in Java.

### 16. Which is the most restrictive access modifier in Java?
#### Answer:
Private is the most restrictive access modifier in Java.

### 17. Which access modifier is also known as Universal access modifier?
#### Answer:
Public is also known as Universal access modifier.

### 18. Explain visibility control in Java.
#### Answer:
Visibility control in Java is used to restrict the access of classes, fields, methods, and constructors. It is also known as access control.

### 19. What Are Getter and Setter?
#### Answer:
- Getter and Setter are the methods that are used to access the private fields of a class. 
```java
public class SimpleGetterAndSetter {
    private int number;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int num) {
        this.number = num;
    }
}
```

### 20. What is a Constructor?
#### Answer:
 A constructor is a special method that is used to initialize the object.

### 21. Do we have Copy Constructor in Java?
#### Answer:
Like C++, Java also supports copy constructor. But, unlike C++, Java doesn’t create a default copy constructor if you don’t write your own.
To copy the values of one object into another in java, you can use:

- Constructor
- Assigning the values of one object into another
- clone() method of Object class

### 22. What is the difference between Constructor and Method?
#### Answer:

<table class="alt">
<tr>
<th>Sr. No.</th>
<th>Constructor</th>
<th>Method</th>
</tr>
<tr>
<td>1.</td>
<td>A block of code that initialize at the time of creating a new object of the class is called constructor.</td>
<td>A set of statements that performs specific task with and without returning value to the caller is known as method.</td>
</tr>
<tr>
<td>2.</td>
<td>It is mainly used for initializing the object.</td>
<td>It is mainly used to reuse the code without writing the code again.</td>
</tr>
<tr>
<td>3.</td>
<td>It is implicitly invoked by the system.</td>
<td>A method is called by the programmer.</td>
</tr>
<tr>
<td>4.</td>
<td>The new keyword plays an important role in invoking the constructor.</td>
<td>Method calls are responsible for invoking methods.</td>
</tr>
<tr>
<td>5.</td>
<td>It has no return type.	It can or cannot return any value to the caller.</td>
<td>So, it has a return type.</td>
</tr>
<tr>
<td>6.</td>
<td>The constructor name will always be the same as the class name.</td>
<td>We can use any name for the method name, such as addRow, addNum and subNumbers etc.</td>
</tr>
<tr>
<td>7.</td>
<td>A class can have more than one parameterized constructor. But constructors should have different parameters.</td>
<td>A class can also have more than one method with the same name but different in arguments and datatypes. </td>
</tr>
<tr>
<td>8.</td>
<td>Sub-class cannot inherit parent class constructor.</td>
<td>Sub-class can inherit the method of the parent class.</td>
</tr>
</table>

### 23. What is Constructor Chaining ?
#### Answer:
Constructor Chaining is a technique of calling another constructor from one constructor. this() is used to call same class constructor where as super() is used to call super class constructor.

### 24. Can we call sub class constructor from super class constructor?
#### Answer:
No, we cannot call sub class constructor from super class constructor.

### 25. What are private constructors and where are they used?
#### Answer:
Like any method we can provide access specifier to the constructor. If it’s made private, then it can only be accessed inside the class.
The major scenarios where we use private constructor:
- Internal Constructor chaining
- Singleton class design pattern

### 26. When do we need Constructor Overloading?
Sometimes there is a need of initializing an object in different ways. This can be done using constructor overloading. Different constructors can do different work by implementing different line of codes and are called based on the type and no of parameters passed.
According to the situation , a constructor is called with specific number of parameters among overloaded constructors.

### 27. Do we have destructors in Java?
#### Answer:
No, Because Java is a garbage collected language you cannot predict when (or even if) an object will be destroyed. Hence there is no direct equivalent of a destructor.