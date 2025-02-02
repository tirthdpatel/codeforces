import java.util.Scanner;

public class A_Nuts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        if ((int) (b / k) == 0) {
            int rest = a - (b + 1) * v;
            int mb = 1;

            if (rest % v == 0) {
                System.out.println(mb + rest / v);
            } else {
                System.out.println(mb + rest / v + 1);
            }

        } else {

            int mb = b / k;
            int ans = mb *( (k + 1) * v);
            b -= mb * k;

            int rest = -ans + a;
            if (rest < (b + 1) * v &&b!=0) {
                System.out.println(mb + 1);
            } else {
               rest -=(b+1)*v;
               mb+=1;

                if (rest % v == 0) {
                    System.out.println(mb + rest / v);// mb= 4rest = 347-4*6=323;
                } else {
                    System.out.println(mb+ rest / v + 1);// mb = 1 ; 
                }
            }
        }
        // max 12 per box
    }
}