import java.util.Scanner;

public class A_PizzaForces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n % 2 != 0) {
                n++;
            }
            long ans = (n * 5) / 2;
            if (n < 6) {
                System.out.println("15");
            } else {
                System.out.println(ans);
            }
        }
    }
}
