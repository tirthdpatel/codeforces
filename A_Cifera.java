import java.util.Scanner;

public class A_Cifera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int count = 0;
        int k = -1;
        while (n <= l) {
            if (l % n == 0 && l != n) {
                l /= n;
                count++;

            } else {
                if (l == n) {
                    count++;
                    break;
                }
                k = 0;
                break;
            }
        }

        if (k == 0 || count == 0 || l < n) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(count - 1);
        }
    }
}