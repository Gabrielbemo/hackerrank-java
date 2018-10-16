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


# Java Stdin and Stdout II

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

# Java If - Else

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.
An if-else statement has the following logical flow:

![image](../../../../../resource/imagens/diagrama-if-else.png)

**Task**
Given an integer,N , perform the following conditional actions:
 - If N is odd, print Weird
 - If N is even and in the inclusive range of 2 to 5, print Not Weird
 - If N is even and in the inclusive range of 6 to 20, print Weird
 - If N is even and greater than 20, print Not Weird

 **Input Format**
 A single line containing a positive integer, N.

 **Constraints**
 1<=N<=100

 **Output Format**
 Print Weird if the number is weird; otherwise, print Not Weird.

 **Sample Input 0**
 ```java
    3
 ```

 **Sample Output 0**
 ```java
    Weird
 ```

 **Sample Input 1**
 ```java
    24
 ```

 **Sample Output 1**
 ```java
    Not Weird
 ```

 **Explanation**
 Sample Case 0: N = 3;
 N is odd and odd numbers are weird, so we print Weird.

 Sample Case 1: N = 24
 n > 20 and N is even, so it isn't weird. Thus, we print Not Weird.

 # Java Output Formatting

 Java's System.out.printf function can be used to print formatted output.
 The purpose of this exercise is to test your understanding of formatting output using printf.

 To get you started, a portion of the solution is provided for you in the editor;
 you must format and print the input to complete the solution.

 **Input Format**
 Every line of input will contain a String followed by an integer.
 Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

 **Output Format**
 In each line of output there should be two columns:
 The first column contains the String and is left justified using exactly 15 characters.
 The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits,
 you must pad your output's leading digits with zeroes.

 **Sample Input**
  ```java
     java 100
     cpp 65
     python 50
  ```

 **Sample Output**
  ```java
     ================================
     java           100
     cpp            065
     python         050
     ================================
  ```

  **Explanation**
  Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character,
  and each integer that was less than 3 digits now has leading zeroes.

  # Java Loops I

  **Objective**
  In this challenge, we're going to use loops to help us do some simple math.

  **Task**
  Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10 ) should be printed on a new line in the form: N x i = result.

  **Input Format**
  A single integer, N.

  **Constraints**
  2 <= N <= 20

  **Output Format**
  Print 10 lines of output; each line i (where 1 <= i <= 10 ) contains the result of N x i in the form:

  N x i = result.

  **Sample Input**
  ```
  2
  ```

  **Sample Output**
  ```
    2 x 1 = 2
    2 x 2 = 4
    2 x 3 = 6
    2 x 4 = 8
    2 x 5 = 10
    2 x 6 = 12
    2 x 7 = 14
    2 x 8 = 16
    2 x 9 = 18
    2 x 10 = 20
  ```

  # Java Int To String

  You are given an integer n, you have to convert it into a string.

  Please complete the partially completed code in the editor. If your code successfully converts n into a string string the code will print "Good job". Otherwise it will print "Wrong answer".

  n can range between -100 to 100 inclusive.

  **Sample Input 0**
  ```
    100
  ```

  **Sample Output 0**
  ```
    100
  ```

  # Java End-of-file

  The challenge here is to read n lines of input until you reach EOF,
  then number and print all n lines of content.

  **Hint:** Java's Scanner.hasNext() method is helpful for this problem.

  **Input Format**
  Read some unknown n lines of input from stdin(System.in) until you reach EOF;
  each line of input contains a non-empty String.

  **Output Format**
  For each line, print the line number, followed by a single space,
  and then the line content received as input.

  **Sample Input**
  ```
  Hello world
  I am a file
  Read me until end-of-file.
  ```

  **Sample Output**
  ```
  Hello world
  I am a file
  Read me until end-of-file.
  ```