import java.util.Scanner;

public class A_Vova_and_Train {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int L = sc.nextInt();
            int v = sc.nextInt();
            int k = sc.nextInt();
            int r = sc.nextInt();
            if (k % v == 0) {
                System.out.println(L / v - r / v + k / v - 1);
            } else {
                System.out.println(L / v - r / v + k / v);
            }
        }
    }
}
// 5 1 3