package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if (n % 2 == 0){
                System.out.println("It is not an odd number.");
                if(scanner.hasNext()){
                    System.out.println();
                }
                continue;
            }
            int sum = (n * ((n * n) + 1))/2;
            System.out.println(sum);

            long[][] square = new long[n][n];
            int row = n-1;
            int col = n/2;
            square[row][col] = 1;
            for (long i = 2 ; i <= n*n ; i++) {
                if (square[(row + 1) % n][(col + 1) % n] == 0) {
                    row = (row + 1) % n;
                    col = (col + 1) % n;
                }
                else {
                    row = (row - 1 + n) % n;
                }
                square[row][col] = i;
            }

            for (int i = 0 ; i < n ; i++) {
                for (int j = 0 ; j < n ; j++) {
                    System.out.printf("%5d", square[i][j]);
                }
                System.out.println();
            }
            if(scanner.hasNext()){
                System.out.println();
            }
        }
    }
}