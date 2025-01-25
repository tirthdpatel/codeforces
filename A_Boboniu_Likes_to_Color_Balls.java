import java.util.Scanner;

public class A_Boboniu_Likes_to_Color_Balls {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long red = sc.nextLong();
            long green = sc.nextLong();
            long blue = sc.nextLong();
            long white = sc.nextLong();
            long odd = red % 2 + green % 2 + blue % 2 + white % 2;
            if (odd <= 1) {
                System.out.println("Yes");
            } else {
                red--;
                green--;
                blue--;
                white++;
                if (red < 0 || white < 0 || blue < 0 || green < 0) {
                    System.out.println("No");
                    continue;
                }
                odd = red % 2 + green % 2 + blue % 2 + white % 2;
                if (odd <= 1) {
                    System.out.println("Yes");
                } else {

                    System.out.println("No");
                }

            }
        }
    }
}
