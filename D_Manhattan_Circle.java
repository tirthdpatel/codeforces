import java.util.Scanner;

public class D_Manhattan_Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
          
            int l = m;
            int k = n;
            char b[][] = new char[n+1][m+1];

            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=m; j++) {
                    b[i][j] = (char)sc.next().charAt(j);
                    char c = '#';
                    if (b[i][j] == c) {
                        if (i+1 < l) {
                            l = i+1;
                        }
                        if (j+1 < k) {
                            k = j+1;
                        }
                    }
                }

            }
            System.out.println(k + " " + l);
        }

    }
}