import java.util.Scanner;

public class A_Pasha_and_Stick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 6) {
            System.out.println("0");
        } else {
            if(n%2==0){
            n /= 2;
            
            if (n / 2 - 1 == 0)
                System.out.println(n / 2);
            else {
                if(n%2==0){

                    System.out.println(n / 2 - 1);
                }else{
                    System.out.println(n/2);
                }

            }
        }else{
            System.out.println("0");
        }
    }
    }
}