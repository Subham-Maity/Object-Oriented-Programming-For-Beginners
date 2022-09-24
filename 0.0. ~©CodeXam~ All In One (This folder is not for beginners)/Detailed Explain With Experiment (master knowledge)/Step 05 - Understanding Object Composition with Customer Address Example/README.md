### Step 05: Understanding Object Composition

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