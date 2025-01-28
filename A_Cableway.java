import java.util.Scanner;

public class A_Cableway {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();

        int redk = red / 2;
        if (red % 2 != 0) {

            redk++;
        }
        int greenk = green / 2;
        if (green % 2 != 0) {

            greenk++;
        }

        int bluek = blue / 2;
        if (blue % 2 != 0) {

            bluek++;
        }
        int ans = 0;

        if (bluek >= greenk && bluek >= redk) {
            ans = 30 + 3 * (bluek - 1) + 2;
        } else {
            if (greenk >= redk && greenk >= bluek) {
                ans = 30 + 3 * (greenk - 1) + 1;
            } else {
                if (redk >= greenk && redk >= bluek) {
                    ans = 30 + 3 * (redk - 1);
                }
            }

        }
        // if (redk >= greenk && redk >= bluek) {
        // ans = 30 + 3 * (redk - 1);
        // }
        // if (greenk >= redk && greenk >= bluek) {
        // ans = 30 + 3 * (greenk - 1) + 1;
        // }
        System.out.println(ans);

    }
}