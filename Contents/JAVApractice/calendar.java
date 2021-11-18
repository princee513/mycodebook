import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int year = scanner.nextInt();
        int d = scanner.nextInt();
        int t = 0;
        boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        for(int i = 0 ; i < 12 ; i++) {
            System.out.println("          " + month[i] + " " + year);
            System.out.print("-----------------------------\n Sun Mon Tue Wed Thu Fri Sat\n");
            if( d == 7){
                d = 0;
            }
            t = 0;
            for(int j = 0 ; j < d ; j++){
                System.out.print("    ");
                t++;
            }
            int day, nd = 1;
            switch(i+1){case 4: case 6: case 9: case 11: day = 30;break;
                case 2: if(leap){day = 29;}else{day = 28;}break;
                default: day = 31;break;}
            while(nd <= day){
                if(t % 7 == 0 && t != 0) {
                    System.out.println();
                    t = 0;
                }
                System.out.printf("%4d", nd);
                nd++;
                t++;
            }
            System.out.println();
            d = t;
            if(i != 11)
                System.out.println();
        }
    }
}