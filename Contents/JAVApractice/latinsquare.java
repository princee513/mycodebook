import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, white = 0;
        if(( num= scanner.nextInt()) > 0 )
        {
            int[] latin = new int[26] ;
            String[][] square = new String[num][num];
            String[] eng ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            int flag = 0;
            boolean ha = true;
            for(int i = 0 ; i < num ; i++)
            {
                int flagg = 0;
                while( scanner.hasNext() && flagg < num)
                {
                    square[i][flagg] = scanner.next();
                    if((square[i][flagg].charAt(0) - '0') > (eng[num].charAt(0)-'0')){
                        System.out.printf("Wrong input: the letters must be from %s to %s\n", eng[0], eng[num-1]);
                        ha = false;
                        break;
                    }
                    flagg++;
                }
                if(flagg != num && ha){
                    System.out.printf("Wrong input: you need to enter exactly %d letters\n", num);
                    ha = false;
                    break;
                }
                flag++;
            }
            if(flag != num && ha){
                System.out.printf("Wrong input: you need to enter exactly %d letters\n", num);
                ha = false;
            }
            if(ha) {
                int rl = 0;
                for (int i = 0; i < num; i++) {
                    int[] row = new int[26];
                    for (int j = 0; j < num; j++) {
                        for (int t = 0; t < 26; t++) {
                            if (square[i][j].equals(eng[t])) {
                                row[t]++;
                                latin[t]++;
                            }
                        }
                    }
                    for (int s = 0; s < 26; s++) {
                        if (row[s] > 1) {
                            rl++;
                        }
                    }
                }
                int cl = 0;
                for (int i = 0; i < num; i++) {
                    int[] column = new int[26];
                    for (int j = 0; j < num; j++) {
                        for (int t = 0; t < 26; t++) {
                            if (square[j][i].equals(eng[t])) {
                                column[t]++;
                            }
                        }
                        for (int s = 0; s < 26; s++) {
                            if (column[s] > 1) {
                                cl++;
                            }
                        }
                    }
                }
                int lc = 0;
                for (int i = 0; i < 26; i++) {
                    if (latin[i] > 0) {
                        lc++;
                    }
                }

                if (white != 0) {
                    System.out.println("");
                }

                if (rl == 0 && cl == 0 && lc == num) {
                    System.out.println("The input array is a Latin square");
                } else {
                    System.out.println("The input array is not a Latin square");
                }
                white++;
            }
        }
    }
}