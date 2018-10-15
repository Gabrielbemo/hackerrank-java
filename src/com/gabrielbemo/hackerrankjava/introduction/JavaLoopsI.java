package com.gabrielbemo.hackerrankjava.introduction;

import java.util.Scanner;

public class JavaLoopsI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int inte = N;

        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", inte, i, inte*i);
        }
        scanner.close();
    }

}
