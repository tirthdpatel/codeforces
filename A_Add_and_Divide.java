import java.util.Scanner;

public class A_Add_and_Divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = 0;
            
            int i = 1;
            if (b >= 2) {
                while ((int)(a / (int)(Math.pow(b, i))) != 0) {
                    i++;
                    max = i;
                    // System.out.println(max);
                }
            } else {
                max = 30;
                // System.out.println(max);
            }
            // int temp = 0;

            // System.out.println(Math.pow(2,3));
            for (int j = 1; j <= max; j++) {
                i = 1;
                while ((int) (a / (int)Math.pow(b + j, i)) != 0) {
                    i++;
                
                    //  System.out.println(a/Math.pow(b+j,i));
                }

                if (max > i + j) {
                    max = i + j;
                }

            }
            
            if(a<b){
                System.out.println("1");
            }else{

                System.out.println(max);
            }
        
        }
    }
}