import java.util.Scanner;

//import javax.swing.text.DefaultStyledDocument;
public class A_Ahahahahahahahaha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int count0 = 0, count1 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    count1++;
                } else {
                    count0++;
                }
            }
            if (count1 < n / 2) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == 0) {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            } else {
                if (((count0 < n / 2) && count1 % 2 == 0) || (count0 + 1 < n / 2 && count1 % 2 == 1)) {
                    if ((count0 < n / 2) && count1 % 2 == 0) {
                    System.out.println(n-count0);
                    }else{
                    System.out.println(n-(count0+1));
                }
                if(count)
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == 1) {
                            System.out.print("1 ");
                        }
                    }
                    System.out.println();
                }
            }

        }
    }
}