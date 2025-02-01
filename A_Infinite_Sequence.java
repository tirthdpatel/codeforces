import java.util.Scanner;

public class A_Infinite_Sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c == 0) {
            if (a == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {

            // if (a > b && c > 0) {
            // System.out.println("NO");
            // } else {
            // if (a > b && c < 0) {
            // if ((a - b) % c == 0) {
            // System.out.println("YES");
            // } else {
            // System.out.println("NO");
            // }
            // } else {

            // if ((b - a) % c == 0) {
            // System.out.println("YES");
            // } else {
            // System.out.println(("NO"));
            // }
            // }
            // }
            if (c > 0) {
                if (a > b) {
                    System.out.println("NO");
                } else {
                    if ((b - a) % c == 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            } else {
                if(a<b){
                    System.out.println("NO");
                }else{
                    if((a-b)%c==0){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }

            }
        }
    }
}