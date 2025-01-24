import java.util.*;

public class A_Shape_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x[]= new int[n];
            int y[]= new int[n];
            int stampx[] = new int[n];
            int stampy[] = new int[n];
            int tempx=0,tempy=0;
            int per = m*m;
            for (int i = 0; i < n; i++) {
               x[i] = sc.nextInt();
               y[i] = sc.nextInt();
               tempx+=x[i];
               tempy+=y[i];
               stampx[i]=tempx;
               stampy[i]=tempy;
               

            }
            for (int i = 1; i < stampy.length; i++) {
              tempx =  stampx[i]- (stampx[i-1]+m);
              tempy =  stampy[i]- (stampy[i-1]+m); 
              per-=tempx+tempy ;
              per
            }
           
        }
        
        sc.close();
    }
}