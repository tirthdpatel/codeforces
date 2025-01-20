import java.util.Scanner;

public class B_Journey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = sc.nextLong();
            Long ans = n / (a + b + c);
            Long day = n / (a + b + c) * 3;
            // day/=3;
            if (n % (a + b + c) == 0) {

            } else {
                if (n % (a + b + c) <= a) {
                    day += 1;
                } else {
                    if (n % (a + b + c) <= a + b) {
                        day += 2;
                    } else {
                        day += 3;
                    }
                }
            }
            System.out.println(day);
        }
    }
}