package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n-1;
        for( int i = 1 ; i <= 2*n-1 ; i=i+2 ) {
            for( int j = m ; j > 0 ; j-- ) {
                System.out.print(" ");
            }
            m--;
            for (int t = 0; t < i; t++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}