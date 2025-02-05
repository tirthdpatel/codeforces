import java.util.Scanner;

public class A_Balanced_Rating_Changes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int l;
        int k = 0;
        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            if (l % 2 != 0) {
                if (k % 2 == 0) {
                    a[i] = (l + 1) / 2;
                    k++;
                } else {
                    a[i] = (l - 1) / 2;
                    k++;
                }
            } else {
                a[i] = l / 2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
