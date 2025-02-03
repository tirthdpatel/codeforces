
import java.util.Arrays;
import java.util.Scanner;

public class A_Restoring_Three_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < 3; i++) {
            System.out.print(a[3] - a[i] + " ");
        }
        sc.close();

    }
}