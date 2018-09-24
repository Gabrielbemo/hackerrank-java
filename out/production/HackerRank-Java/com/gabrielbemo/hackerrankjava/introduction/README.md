# Welcome to java.

Welcome to the world of Java! In this challenge, we practice printing to stdout.

The code stubs in your editor declare a Solution class and a main method. Complete the main method by copying the two lines of code below and pasting them inside the body of your main method.

```java
System.out.println("Hello, World.");
System.out.println("Hello, Java.");
```

**Input Format**

There is no input for this challenge.

**Output Format**

You must print two lines of output:

Print Hello, World. on the first line.
Print Hello, Java. on the second line.

**Sample Output**

```java
Hello, World.
Hello, Java.
```

# Java Stdin and Stdout I.

Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

```java
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

```java
Hi 5
```

Our code will print:

```java
myString is: Hi
myInt is: 5
```

Alternatively, you can use the BufferedReader class.

**Task**

In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

**Input Format**

There are  lines of input, and each line contains a single integer.

**Sample Input**

```java
42
100
125
```

**Sample Output**

```java
42
100
125
```
```

# Java Stdin and Stdout II.

In this challenge, you must read an integer, a double, and a String from stdin,
then print the values according to the instructions in the Output Format section below.
To make the problem a little easier, a portion of the code is provided for you in the editor.

**Input Format**

There are three lines of input:
 - The first line contains an integer.
 - The second line contains a double.
 - The third line contains a String.

**Output Format**

There are three lines of output:
 - On the first line, print String: followed by the unaltered String read from stdin.
 - On the second line, print Double: followed by the unaltered double read from stdin.
 - On the third line, print Int: followed by the unaltered integer read from stdin.

**Note:** If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

**Sample Input**
```java
42
3.1415
Welcome to HackerRank's Java tutorials!
```

**Sample Output**
```java
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
```