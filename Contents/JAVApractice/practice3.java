package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if( n >= 2 ){
            System.out.print(2);
        }
        for (int j = 3; j < n ; j++)
        {
            boolean answer = true;
            for (int i = 2; i <= Math.sqrt(j) ; i++)
            {
                if (j % i == 0)
                {
                    answer = false;
                    break;
                }
            }
            if (answer)
            {
                System.out.print( " "+ j );

            }
        }
        System.out.println();
    }
}
