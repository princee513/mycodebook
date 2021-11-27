import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String str = scanner.nextLine();
            str = str.replaceAll(" ", "");
            str = str.replaceAll("[+]","#+#");
            str = str.replaceAll("[-]","#-#");
            str = str.replaceAll("[*]","#*#");
            str = str.replaceAll("[/]","#/#");
            StringTokenizer st = new StringTokenizer(str, "#");
            String[] arr = new String[3];
            int i = 0;
            while (st.hasMoreTokens()) {
                String str1 = st.nextToken();
                arr[i] = str1;
                i++;
            }
            switch(arr[1]){
                case"+":
                    int add = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                    System.out.println(arr[0] + " + " +arr[2] + " = " + add);
                    break;
                case"-":
                    int sub = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                    System.out.println(arr[0] + " - " +arr[2] + " = " + sub);
                    break;
                case"*":
                    int mul = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                    System.out.println(arr[0] + " * " +arr[2] + " = " + mul);
                    break;
                case"/":
                    int div = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]);
                    System.out.println(arr[0] + " / " +arr[2] + " = " + div);
                    break;
            }
        }
    }
}