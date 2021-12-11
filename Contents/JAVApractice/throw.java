import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            try{
                Fraction fraction = new Fraction(str);
                System.out.println(fraction.turn(str));
            }
            catch(NumberFormatException e){
                System.out.println("String no Binary");
                System.exit(1);
            }
        }
    }
}
class NumberFormatException extends Exception{}
class Fraction{
    public Fraction(String str) throws NumberFormatException{
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != '0' && str.charAt(i) != '1'){
                throw new NumberFormatException();
            }
        }
    }
    public int turn(String str){
        return Integer.parseInt(str, 2);
    }
}