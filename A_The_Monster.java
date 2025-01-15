import java.util.Scanner;
public class A_The_Monster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        float j = 0;
        int k =-1;
        // a*n+b -d /c
        for (int i = 0; i <=100; i++) {
            j=(float)(a*i+b-d)/c;
            if(j==(int)j && j>=0){
                k= a*i+b;

                break;
            }
        }
        System.out.println(k);
    }
} 