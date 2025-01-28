import java.util.Scanner;
public class A_Help_Vasilisa_the_Wise_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2= sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int a = (c1+d1-r2)/2;
        int b =(c2+d2-r2)/2;
        int c =(c1+d2-r1)/2;
        int d =(c2+d1-r1)/2;

        if(a==b || a==c||a==d||b==c||b==d||c==d ||a>9||b>9||c>9||d>9||a<1||b<1||c<1||d<1){
            System.out.println(-1);
        }else{
            if(a+c!=c1||b+d!=c2||a+d!=d1||b+c!=d2||a+b!=r1||c+d!=r2){
                System.out.println(-1);
            }else{
                System.out.println((c1+d1-r2)/2+" " + (c2+d2-r2)/2);
                System.out.println((c1+d2-r1)/2+" "+ (c2+d1-r1)/2);

            }
        }
    }
} 


/*
     13  10 19 16
     12 3  9
     17 

   
*/ 