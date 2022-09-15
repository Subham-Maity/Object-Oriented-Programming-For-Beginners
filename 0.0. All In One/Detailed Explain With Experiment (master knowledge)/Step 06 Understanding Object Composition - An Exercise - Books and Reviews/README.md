###Programming Exercise PE-OOP-02

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

	Book book = new Book(123, "Object Oriented Programming With Java", "Subham");
	book.addReview(new Review(10, "Great Book", 4));
	book.addReview(new Review(101, "Awesome", 5));
	System.out.println(book);

```