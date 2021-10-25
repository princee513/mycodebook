package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    private static boolean prime ( int number){
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    private static boolean palindrome ( int number){
        String numstr = number + "";
        int left = 0;
        int right = numstr.length() - 1;
        while (left < right) {
            if (numstr.charAt(left) != numstr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int flag = 0;
            for (int i = 2; i < 100000; i++) {
                if(num == 0){
                    System.out.println();
                    break;
                }

                if (palindrome(i) && flag < num) {
                    if (prime(i)) {
                        System.out.print(i);
                        flag++;
                        if (flag % 10 == 0) {
                            System.out.println();
                        }

                        if (flag % 10 != 0 && flag != num) {
                            System.out.print(" ");
                        }

                        if (flag == num  && flag % 10 != 0) {
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}