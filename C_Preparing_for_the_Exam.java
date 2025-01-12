
//import java.lang.classfile.components.ClassPrinter;
import java.util.Scanner;

public class C_Preparing_for_the_Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int ma[] = new int[m];
            int kn[] = new int[k];
            int sum = 0;
            for (int i = 0; i < m; i++) {
                ma[i] = sc.nextInt();
            }
            for (int i = 0; i < kn.length; i++) {
                kn[i] = sc.nextInt();
                sum += kn[i];
            }
            // int notknown=0;
            // for (int i = 0; i < kn.length; i++) {

            // }

            if (n - 1 > k) {

                for (int i = 0; i < m; i++) {
                    System.out.print("0");
                }
                System.out.println();
            } else {
                if (n <= k) {
                    for (int i = 0; i < ma.length; i++) {
                        System.out.print("1");
                    }
                    System.out.println();
                } else {
                    if (n - 1 == k) {
                        int w = 0;
                        int ta = 0;
                        for (int j = 0; j < ma.length; j++) {
                            if (ta == 1) {
                                break;
                            }
                            for (int i = 0; i < kn.length; i++) {
                                if (k == 1) {
                                    if (ma[0] == kn[0]) {
                                        System.out.print("01");
                                        ta = 1;
                                        break;
                                    } else {
                                        System.out.print("10");
                                        ta = 1;
                                        break;
                                    }
                                }
                                if (ma[j] == kn[i]) {
                                    System.out.print("0");
                                    break;
                                } else {
                                    w++;
                                }

                                if (w == k - 1) {
                                    System.out.print("1");
                                    break;

                                }

                            }

                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}