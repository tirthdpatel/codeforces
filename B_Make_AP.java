import java.util.Scanner;

public class B_Make_AP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
          
            int new_a = b - (c - b);
            if (new_a >= a && new_a % a == 0 && new_a != 0) {
                System.out.println("YES");
                continue;
            }

            int new_b = a + (c - a) / 2;
            if (new_b >= b && (c - a) % 2 == 0 && new_b % b == 0 && new_b != 0) {
                System.out.println("YES");
                continue;
            }

            int new_c = a + 2 * (b - a);
            if (new_c >= c && new_c % c == 0 && new_c != 0) {
                System.out.println("YES");
                continue;
            }

            System.out.println("NO");

        }
    }

}
// System.out.println("YES");
// System.out.println("NO");