import java.util.Scanner;

public class A_Dima_and_Friends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if ((sum) % (n + 1) == 1) {
            System.out.println(1);

        } else {
            if ((sum + 2) % (n + 1) == 1) {
                System.out.println("1");
            } else {

                System.out.println("2");
            }
        }
    }
}