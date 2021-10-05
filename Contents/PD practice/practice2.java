package com.company;

public class Main {

    public static void main(String[] args) {
        for( int i = 1 ; i < 10 ; i++ ) {
            for( int j = 1 ; j < 10 ; j++ ) {
                System.out.print( i+ " * "+ j+ " =");
                if( i * j < 10 ){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" ");
                }
                int ans = i * j;
                if( j == 9 )
                {
                    System.out.print(ans);
                }
                else
                {
                    System.out.print( ans+ " " );
                }
            }
            System.out.println();
        }

    }
}