import java.util.Arrays;
import java.util.Scanner;

public class B_Farmer_John_s_Card_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

           
            for (int i = 0; i < n; i++) {
                Arrays.sort(a[i]);
            }
            int k = 0;
           
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (a[i][j] + n != a[i][j + 1]) {
                        k = -1;
                        break;
                    }
                }
                if (k == -1) {

                    break;
                }

            }
            int b[] = new int[n];
            if (k == 0) {
for (int i = 0; i < n; i++) {
    b[a[i][0]]= i;
}
int l =1;
// while(l<=n){
// for (int i = 0; i < b.length; i++) {
//     if(b[i]==l){
//         System.out.print(i+1 + " ");
//         l++;
//     }
// }
// }

for (int i = 0; i < b.length; i++) {
    System.out.print((b[i]+1)+" ");
}
System.out.println();

            }else{
                System.out.println(k);
            }

        }
        sc.close();
    }
}