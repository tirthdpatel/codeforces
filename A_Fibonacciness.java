import java.util.Scanner;

public class A_Fibonacciness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
            
            int max = 0;
            
            // Possible values for a3
            int[] pos = {a4 - a2, a5 - a4};
            
            for (int a3 : pos) {
                int d = 0;
                if (a3 == a1 + a2){
                    d++;
                } 
                if (a4 == a2 + a3) {
                    d++;
                } 
                if (a5 == a3 + a4) {
                    d++;
                } 
                max = Math.max(max, d);
            }
            
            System.out.println(max);
        }
        
        sc.close();
    }
}