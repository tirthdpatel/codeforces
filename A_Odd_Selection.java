import java.util.Scanner;

public class A_Odd_Selection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int a[] = new int[n];
            int odd = 0, even = 0, temp = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                temp = (a[i] % 2 == 0) ? even++ : odd++;
            }

            if (odd >= x&&x%2!=0) {
                System.out.println("Yes");
            } else {
                if (odd >= x&&x%2==0) {
                    if(even==0){
                        System.out.println("No");
                        continue;
                    }else{
                        System.out.println("Yes");
                        continue;
                    }
                } 
                if (odd >= 1) {
                    if (even - 1 >= x) {
                        System.out.println("Yes");
                    } else {
                        if ((x - even) % 2 == 1) {
                            if (x - even <= odd) {
                                System.out.println("Yes");
                                
                            } else {

                                System.out.println("No");
                                
                            }
                        } else {
                            if (x - even + 1 <= odd) {

                                System.out.println("Yes");
                                
                            } else {

                                System.out.println("No");
                                
                            }
                        }
                    }
                } else {

                    System.out.println("No");
                    continue;
                }
                // System.out.println("No");
            }

        }
    }
}