package com.company;
import java.util.Scanner;
public class Main {
    private static String str;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while( scanner.hasNext() ) {
            str = scanner.next();
            if(str.equals("0")){
                break;
            }
            int tot1 = 0, tot2 = 0;
            for (int i = 0; i < str.length(); i += 2) {
                tot1 = tot1 + str.charAt(i) - '0';
            }
            for (int j = 1; j < str.length(); j += 2) {
                tot2 = tot2 + str.charAt(j) - '0';
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
            System.out.println( str +" is a multiple of 11." );
        }
        else{
            System.out.println( str +" is not a multiple of 11." );
        }
    }
}