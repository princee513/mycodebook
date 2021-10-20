package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[1000];
        int flag = 0;
        for (int j = 2; j < num ; j++)
        {
            boolean answer = true;
            for (int i = 2; i <= Math.sqrt(j); i++)
            {
                if (j % i == 0)
                {
                    answer = false;
                    break;
                }
            }
            if (answer)
            {
                arr[flag] = j;
                flag++;
            }
        }
        for(int i = 0 ; i < flag ; i++){
            int temp = i+1;
            System.out.print(arr[i]);
            if( temp % 10 != 0 && i != flag -1){
                System.out.print(" ");
            }

            if( i == flag -1 && temp % 10 != 0){
                System.out.println();
            }

            if( temp % 10 == 0){
                System.out.println();
            }
        }
    }
}