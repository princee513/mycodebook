import java.util.*;

public class Main {
    public static class Point implements Comparable<Point>{
        long x, y;
        public Point(long x, long y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if((this.x * this.x)+(this.y * this.y) < (o.x * o.x)+(o.y * o.y))
                return -1;
            else if((this.x * this.x)+(this.y * this.y) == (o.x * o.x)+(o.y * o.y)){
                if(this.x < o.x)
                    return -1;
                else if(this.x == o.x){
                    if(this.y < o.y)
                        return -1;
                    else if(this.y == o.y)
                        return 0;
                    else
                        return 1;
                }
                return 1;
            }
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jud = false;
        while(scanner.hasNextLong()) {
            if(jud)
                System.out.println();
            jud = true;
            int n = scanner.nextInt();
            Point[] p = new Point[n];
            for(int i = 0 ; i < n ; i++){
                p[i] = new Point(scanner.nextLong(), scanner.nextLong());
            }
            Arrays.sort(p);
            long max_num = p[0].x + p[0].y;
            int max = 0;
            System.out.println("(" + p[0].x + "," + p[0].y + ")");
            for(int i = 1 ; i < n ; i++){
                System.out.println("(" + p[i].x + "," + p[i].y + ")");
                if(p[i].x + p[i].y > max_num){
                    max = i;
                    max_num = p[i].x + p[i].y;
                }
            }
            System.out.println("max num: " + max_num);
            System.out.println("point:(" + p[max].x + "," + p[max].y + ")");
        }
    }

}
