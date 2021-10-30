import java.util.Scanner;

public class Main {
    private static boolean[] PrimeArray(long N){
        boolean[] A = new boolean[(int)N+1];
        A[0] = true;
        A[1] = true;
        for(long j = 2; j <= N ; j++) {
            boolean judge = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    judge = false;
                    A[(int) j] = false;
                    break;
                }
            }
            if(judge){
                A[(int)j] = true;
            }
        }
        return A;
    }
    private static String PrimeFactorization(long N){
        String str = "";
        boolean jud = false;
        for(long i = 2 ; N > 1 ; i++) {
            int flag = 1;
            if(N % i == 0) {
                if(jud) {
                    str = str + " * ";
                }
                N = N / i;
                str = str.concat(Long.toString(i));
                jud = true;
                while (N % i == 0) {
                    N = N / i;
                    flag++;
                }
                if(flag > 1){
                    str = str + "^";
                    str = str.concat(Long.toString(flag));
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxn = 0, flag = 0;
        int[] max = new int[1000];
        while(scanner.hasNextInt()){
            int N = scanner.nextInt();
            max[flag] = N;
            if(max[flag] > maxn){
                maxn = max[flag];
            }
            flag++;
        }
        System.out.print(maxn + " ");
        System.out.printf("%d\n", (int)Math.sqrt(maxn));
        boolean[] A = PrimeArray(maxn);
        for(int i = 0 ; i < flag ; i++){
            if(A[max[i]]){
                System.out.println(max[i]);
            }
            else{
                System.out.println(PrimeFactorization(max[i]));
            }
        }
    }
}