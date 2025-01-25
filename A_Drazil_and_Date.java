import java.util.Scanner;

public class A_Drazil_and_Date {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long s = sc.nextLong();
        if ((s - Math.abs(a) + Math.abs(b)) % 2 == 0 && s - (Math.abs(a)+ Math.abs(b)) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}