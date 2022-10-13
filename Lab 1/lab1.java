import java.util.Scanner;

public class sumCount {
    public static void main(String[] args) {
        int m = 2, n = 3;
        double b = 1.2, a = 2.3;
        int S = 0;
        if (b <= 0){
            System.out.println("Error!");
        } else if (m <= b || n <= a) {
            System.out.println("Error");
        } else
            for (double j = b; j <= m; j++) {
                for (double i = a; i <= n; i++) {
                    S += Math.pow(i, 2) / j;
                }

            }
        System.out.println(S);
        }
    }

