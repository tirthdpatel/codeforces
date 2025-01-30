import java.util.Scanner;

public class A_Long_Comparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long a1 = sc.nextLong();
            long b = sc.nextLong();
            long b1 = sc.nextLong();
            long temp = a;
            long lena = 0;
            long lasta = 0, lastb = 0;
            long k = Math.min(a1, b1);
            a1 -= k;
            b1 -= k;
            a = a * (long) Math.pow(10, a1);
            b = b * (long) Math.pow(10, b1);
            if (a1 >= 7) {
                System.out.println(">");
                continue;
            }
            if (b1 >= 7) {
                System.out.println("<");
                continue;
            }
            if (a > b) {
                System.out.println(">");
            } else {
                if (a < b) {
                    System.out.println("<");
                } else {
                    System.out.println("=");
                }
            }
        }
    }
}