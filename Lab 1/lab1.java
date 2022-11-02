import java.util.Scanner;

public class sumCount {
    //0426 - номер залікової книжки.
    //C2 = 0, тому операція О1 = +.
    //C3 = 0, тому С = 0.
    //C5 = 1, тому О2 = /.
    //C7 = 6, тому тип індексів i та j double.
    
   
    
    public static void main(String[] args) {
        int m, n;
        double a;
        double b;
        int S = 0;
        
         Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        String aDouble = in.nextLine();
        a = Double.parseDouble(aDouble);
        System.out.println(a);

        System.out.print("Enter b: ");
        String bDouble = in.nextLine();
        b = Double.parseDouble(bDouble);
        System.out.println(b);

        System.out.print("Enter m: ");
        m = in.nextInt();
        System.out.println(m);

        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.println(n);
        
        if (b == 0){
            System.out.println("Error!");
        } else if (a < 0 || b < 0 || m < 0 || n < 0) {
            System.out.println("Error!");
        } else if (m <= b || n <= a) {
            System.out.println("Error!");
        } else
            for (double j = b; j <= m; j++) {
                for (double i = a; i <= n; i++) {
                    S += Math.pow(i, 2) / j;
                }

            }
        System.out.println(S);
        }
    }

