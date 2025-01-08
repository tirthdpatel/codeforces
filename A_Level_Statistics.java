import java.util.Scanner;

public class A_Level_Statistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p[] = new int[n];
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            int k =-1;
            if(n==1){
                if(c[0]>p[0]){
                    System.out.println("NO");
                    k=1;
                    continue;        
                        }
            }
            for (int i = 0; i < c.length-1; i++) {
                if ((p[i] > p[i + 1])) {
                    System.out.println("NO");
                    k=1;
                    break;
                }else{
                    if((c[i] > p[i])){
                        System.out.println("NO");
                        k=1;
                        break;
                    }else{
                        if((c[i+1] > p[i+1])){
                            System.out.println("NO");
                    k=1;
                    break;
                        }
                            else{
                                if(c[i]>c[i+1]){
                                    System.out.println("NO");
                                    k=1;
                                    break;
                                }else{
                                    if(c[i+1]-c[i]>p[i+1]-p[i]){
                                        System.out.println("NO");
                                    k=1;
                                    break;
                                    }
                                }
                            }
                        }
                    }
                }
                if(k==-1){
                    System.out.println("YES");
                }
            }
        }
    }
