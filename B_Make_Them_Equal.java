import java.util.Scanner;

public class B_Make_Them_Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int temp = 0, ans = 0,l=0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      
            if ((a[0] - a[a.length - 1]) % 2 == 0) {
                ans = (a[a.length-1] - a[0]) / 2;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == a[0] || a[j] == a[a.length - 1] || a[j] == a[0] + ans) {

                    } else {
                        System.out.println("-1");
                        l=-1;
                        break;
                    }

                }
                if(l==0){
                    System.out.println(ans);
                }
            }else{
                ans=a[a.length-1]-a[0];
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == a[0] || a[j] == a[a.length - 1] || a[j] == a[0] + ans) {

                    } else {
                        System.out.println("-1");
                        l=-1;
                        break;
                    }
                }
                if(l==0){
                    System.out.println(ans);
                }
            }

        
        sc.close();
    }
}
