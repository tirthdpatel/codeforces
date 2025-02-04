import java.util.Scanner;

public class A_Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = n / 2;
        if (even >= 2) {
            System.out.println(n);
            if (n % 2 == 0) {
                for (int i = n - 1; i > 0; i -= 2) {
                    System.out.print(i + " ");
                }
                for (int i = n; i > 0; i -= 2) {
                    System.out.print(i + " ");

                }
            } else {
                for (int i = n; i > 0; i -= 2) {
                    System.out.print(i + " ");
                }
                for (int i = n - 1; i > 0; i -= 2) {
                    System.out.print(i + " ");

                }
            }
        } else {
            if (n == 3) {
                System.out.println("2");
                System.out.println("1 3");
            } else {
                System.out.println("1");
                System.out.println("1");

            }
        }

    }
}