import java.util.Scanner;
public class Main {
    private static int n;
    private static int m;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] array = new int[n][m];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(isConsectiveFour(array));
    }
    public static boolean isConsectiveFour(int[][] values){
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                int count = 0;
                if((j+3 < m) && (values[i][j] == values[i][j+3])){
                    for(int k = j+1 ; k < j+4 ; k++){
                        if(values[i][k] == values[i][j])
                            count++;
                    }
                    if(count == 3)
                        return true;
                    else
                        count = 0;
                }
                if((i+3 < n) && (values[i][j] == values[i+3][j])){
                    for(int k = i+1 ; k < i+4 ; k++){
                        if(values[k][j] == values[i][j])
                            count++;
                    }
                    if(count == 3)
                        return true;
                    else
                        count = 0;
                }
                if((i+3 < n) && (j+3 < m) && (values[i][j] == values[i+3][j+3])){
                    for(int k = 1 ; k < 4 ; k++){
                        if(values[i+k][j+k] == values[i][j])
                            count++;
                    }
                    if(count == 3)
                        return true;
                    else
                        count = 0;
                }
                if((i+3 < n) && (j-3 >= 0) && (values[i][j] == values[i+3][j-3])){
                    for(int k = 1 ; k < 4 ; k++){
                        if(values[i+k][j-k] == values[i][j])
                            count++;
                    }
                    if(count == 3)
                        return true;
                    else
                        count = 0;
                }
            }
        }
        return false;
    }
}
