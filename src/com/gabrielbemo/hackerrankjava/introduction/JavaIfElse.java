package com.gabrielbemo.hackerrankjava.introduction;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N % 2 == 1 || (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        scan.close();
    }
}
