# [Java_SE_Course]
Project to review Java and learn new features.

---
# What is Java?

Java is a high level programming language (although not as high as Python or JavaScript) that helps us build applications for different devices and operating systems.

It was created in 1991 by James Gosling while working at Sun Microsystems, a company that was later acquired by Oracle. This means that Java has very good maintenance, but also some changes that we will not all agree with.

Java has two categories: Standard Edition for building desktop or console applications and Enterprise Edition for companies to work with the latest web applications.

In this course we will learn the basics of Java Standard Edition: language syntax, declare variables, work with functions, cycles and conditionals, programming logic, algorithms and many other things.

But do not worry. Java follows the philosophy of Write Once, Run Anywhere (WORA), so everything you read in this document can also be applied with Java EE.

---
# Java and JDK versions
The JDK or Java Development Kit consists of the following elements:

Java Runtime Environment (JRE): The Java virtual machine, which allows us to write the same code to work the same on all devices and operating systems.
Java compiler: Responsible for translating our code in Java into a language that can understand and interpret our virtual machine.
Development APIs: A code base ready to help us develop.
Java development APIs have evolved over time, so there are different versions of java that you can use. The version that most raised the popularity and job offers with Java was Java SE 6.

In Java SE 9 they announced that updates would occur every 6 months, but LTS (Long Time Support) versions will be maintained for 3 years, so updates are necessary, but not urgent.

In this course we are going to work with the Java SE 11 LTS version, the first licensed version of Java. We can only use it for free when working in development and testing environments. Otherwise, we must pay USD 2.5 per month per desktop user and USD 25 per processor for server applications.

Fortunately, OpenJDK is a free and open source version of using Java SE Platform Edition.

---
# The most used Java tools
Java 8 (LTS) is the most used version of Java until the beginning of 2019, but it will only have support until December 2020, after this date we will have to pay a license to continue with its support.

Java 10 introduced some changes in the way of declaring variables, so in this course we will work with Java versions 8 and 11.

The most used tool to build web projects with Java is Maven, but there are also other alternatives such as Gradle. There are also frameworks like Spring to work with Java EE and ORMs like Hibernate to work with databases.

IDEs are integrated development environments, tools (applications, surely desktop) that help us write our code with editors, compilers, debuggers and graphic interface builders, all in one place.

The IDE recommended by Oracle is NetBeans, but there are also Eclipse and IntelliJ IDEA, the latter is the one that has taken the most strength thanks to Kotlin. All three tools are free, but IntelliJ IDEA also has a paid version.

---
# Creating a development environment in Java
* https://adoptopenjdk.net

---
# First Hello World in Java
Java files use the .java extension. Therefore, to create our first “Hello, world” we can do it from a HolaMundo.java file.

The main method is the entry point of an application in different languages such as Java, Kotlin and C ++. Without this method our application will not run and will show an error.

In Java we define this method as follows:
```java
public static void main (String[] args) {
  // actions
}
```

Therefore, this will be the code of our HolaMundo.java and we can execute it with 
* Right Click> Run 'HelloWorld.main ()':

```java
public class HolaMundo {
  public static void main (String[] args) {
    System.out.println("Hello, world!");
  }
}
```

Remember that our IDE provides us with some shortcuts. For example, just by writing the word sout we can autocomplete the statement System.out.println () ;.

---
# Stages of Java programming
1. Write our .java files.
2. Compile, upload and verify our files with javac (IDEs allow us to compile with the press of a button).
3. When compiling we obtain .class files with code that our computers can understand (Byte Code).
4. The JVM (Java Virtual Machine) is responsible for executing the code so that it works on any device or operating system.

Java is a language compiled and interpreted at the same time.

---
# Variables in Java
A variable is a memory space (RAM) that contains a numerical, Boolean, text or other slightly more complex data type.

Variables in Java are made up of a unique name and a value that can change throughout the execution of the program. When declaring the variables we must define the type of data that we are going to use and a semicolon at the end:

```java
// Variables.java

public class Variables {
  public static void main(String[] args) {
    // Declare the speed variable of type int (integers)
    int spped;

    // Update the content of the speed variable:
    spped = 10; // if you had already declared the variable

    // Declare a variable and assign it a value at the same time:
    int salary = 1000;

    // Create a variable of type String:
    String eployeeName = "Cristian Franco";
  }
}
```

---
# Updating variables
Java allows us to update our variables by reusing the values they previously had, in this way we avoid errors or inconsistencies in our code:

```java
public class UpdatingVariables {
    public static void main (String [] args) {
        // Update numeric data:
        int salary = 1000;
        salary = salary + 200;
        System.out.println (salary); // 1200

        salary += 300;
        System.out.println (salary); // 1500

        // Update variables of type String:
        String employeeName = "Cristian";
        employeeName = employeeName + " Franco";
        System.out.println (salary); // Cristian Franco

        employeeName += " Bedoya";
        System.out.println (employeeName); // Cristian Franco Bedoya

        employeeName = "Super " + employeeName;
        System.out.println (employeeName); // Super Cristian Franco Bedoya
    }
}
```

---
# Java Naming Convention
A naming convention is a pattern that variable names must follow so that the code is organized, understandable, and non-repeating.

Java is case sensitive, this point is key when following a convention.

Variables must always start with a letter symbol, $ or _.

You cannot use the symbol - anywhere in the variable.

Constant variables are variables whose value will never change, so they must be completely capitalized and using the _ character.

---
# Naming Technique: Camel Case
Camel Case is a very popular convention for naming our variables. We can use it in Upper Camel Case or Lower Camel Case mode, the difference is if we start the variable name with upper or lower case.

```java
// Upper Camel Case:
class SoyUnaClase {};

// Lower Camel Case
int amAnNumberInt = 10;
```
We must use Upper Camel Case in the names of the classes and files. And Lower Camel Case in the names of the variables or methods.

---
# Types of numerical data
Data types for integers (without decimals):

Byte: It occupies 1 byte of memory and its range is -128 to 127.
short: It occupies 2 bytes of memory and its range is -32,768 to 32,727.
int: It occupies 4 bytes of memory and its range is from -2,147,483,648 to 2,147,483,647. It is very comfortable to use, since it is not so small that our numbers do not fit nor so large as to waste a lot of memory. You can store up to 10 digits.
long: It occupies 8 bytes of memory and its range is -9,223,372,036,854,775,808 up to 9,223,372,036,854,775,807. To differentiate it from a long data type we must end the number with the letter L.
For example:

```java
// Int:
int n = 1234567890;

// Long:
long nL = 123456789012345L;
```

Data types for floating numbers (with decimals):
* float: They occupy 4 bytes of memory and their range is from 1.40129846432481707e-45 to 3.40282346638528860e + 38. Just as long, we must put a letter F at the end.
* double: They occupy 8 bytes of memory and their range is from 4.94065645841246544e-324d to 1.79769313486231570e + 308d.
For example:

```java
// Double:
double nD = 123.456123456;

// Float
float nF = 123,456F;
```

---
# Char and boolean data types
char: It occupies 2 bytes and can only store 1 digit, we must use single quotes instead of double quotes.
boolean: They are a logical data type, they only accept true and false values. It also occupies 2 bytes and stores only 1 digit.
Surely you realized that we should always write the data type of our variables before defining their name and value. But this changes from Java 10: we only have to write the reserved word var and Java will define the data type of our variables automatically:

```java
var salary = 1000; // INT
var pension = salary * 0.03; // DOUBLE
var totalSalary = salary - pension; // DOUBLE
```

Remember that this only works with versions higher than Java 10.