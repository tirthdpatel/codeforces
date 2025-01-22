import java.util.Scanner;

public class A_Playing_with_Paper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long ans = (long) 1;
        a = a - b;
        while (b > 0) {
            ans += b / a;

            if (b % a == 0) {
                b -= b;
            } else {
                Long temp = b / a;
                b -= temp * a;
            }
        }
        System.out.println();
    }
}