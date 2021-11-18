package com.company;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        BigDecimal ans = new BigDecimal(0);
        String[] num = new String[50];
        String[] sign = new String[50];

        int flag = 0, flagg = 0;

        StringTokenizer token = new StringTokenizer(str,"+-*/%,()",true);
        while(token.hasMoreTokens()){
            String str1 = token.nextToken();
            if( Character.isDigit(str1.charAt(0))){
                num[flag] = str1;
                if( flag > 0 ){
                    System.out.print(" ");
                }
                System.out.print(num[flag]);
                flag++;
            }
            else{
                sign[flagg] = str1;
                flagg++;
            }
        }
        System.out.println();

        for(int i = 0 ; i < sign.length ; i++ ){
            if(sign[i] == null){
                break;
            }
            else if(i > 0){
                System.out.print(" ");
            }
            System.out.print(sign[i]);
        }
        System.out.println();

        for( int i = 0 ; i < num.length ; i++ ){
            if( num[i] == null ){
                break;
            }
            BigDecimal cal = new BigDecimal(num[i]);
            ans = ans.add(cal);
        }
        System.out.printf("%.3f",ans);
        System.out.println();
    }
}