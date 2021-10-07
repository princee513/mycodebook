package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            String str = scanner.next();
            if( str == "0"){
                break;
            }
            int tot1 = 0, tot2 = 0;
            for (int i = 0; i <= str.length(); i += 2) {
                tot1 = tot1 + str.charAt(i) - '0';
            }
            for (int i = 1; i <= str.length(); i += 2) {
                tot2 = tot2 + str.charAt(i) - '0';
            }
            if( tot1 > tot2 ){
                judgment( tot1, tot2 );
            }
            else{
                judgment( tot2, tot1 );
            }
        }
    }

    public static void judgment( int a, int b ){
        int judge = a - b;
        if( judge % 11 == 0 ){
            System.out.println( " is a multiple of 11." );
        }
        else{
            System.out.println( " is not a multiple of 11." );
        }
    }
}