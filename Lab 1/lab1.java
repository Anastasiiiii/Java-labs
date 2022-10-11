import java.util.Scanner;

public class sumCount {
    public static void main(String[] args) {
        int m, n;
        int b, a;
        int S = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        m = in.nextInt();
        System.out.println(m);
        System.out.print("Enter b: ");
        b = in.nextInt();
        System.out.println(b);
        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.println(n);
        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.println(a);
        if (b <= 0){
            System.out.println("Error!");
        } else if (m < b || n < a) {
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

