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
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
    public static int reverse(int num){
        int tot = 0, buf = 1;
        boolean jud = true;
        while (num > 0) {
            tot = tot * buf + (num % 10);
            num /= 10;
            if(jud) buf *= 10;
            jud = false;
        }
        return tot;
    }
    public static void main(String[] args) {
        int flag = 0, num = 120;
        for (int i = 2; i < 100000; i++) {
            if (palindrome(i) && flag < num) {
                if (prime(i) && prime(reverse(i))) {
                    System.out.print(i);
                    flag++;
                    if (flag % 10 == 0) {
                        System.out.println();
                    }

                    if (flag % 10 != 0 && flag != num) {
                        System.out.print(" ");
                    }

                    if (flag == num && flag % 10 != 0) {
                        System.out.println();
                    }
                }
            }
        }
    }
}