import java.util.Scanner;
public class A_Berland_Poker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int a1=0,a2=0;
            int d = n/k;
            a1= Math.min(d, m);
            a2 = ((m-a1+k-2 )/(k-1) );
            // rest of joker distributed across k-1 players
            
            System.out.println(a1-a2);
        }
    }
}