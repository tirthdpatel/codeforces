import java.util.Scanner;

public class C_The_Legend_of_Freya_the_Frog {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
          Long x = sc.nextLong();
          Long y = sc.nextLong();
          Long k = sc.nextLong();
           
          Long xsteps = (x+k-1)/k;
          Long ysteps = (y+k-1)/k;
          Long ans = xsteps>ysteps?2*xsteps-1:2*ysteps;
            System.out.println(ans);
        }
    }
}