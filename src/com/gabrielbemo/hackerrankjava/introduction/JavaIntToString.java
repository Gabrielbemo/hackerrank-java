package com.gabrielbemo.hackerrankjava.introduction;

import java.util.Scanner;

public class JavaIntToString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        s.close();

        String string = Integer.toString(n);

        System.out.println(string);
    }
}
