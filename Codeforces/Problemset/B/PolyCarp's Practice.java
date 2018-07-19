import java.util.*;

public class PolyCarpsPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scan.nextInt();
            b[i]=a[i];
        }
        int c[]=new int[k];
        
        Arrays.sort(a);
        int sum=0;
        for (int i=n-1,j=0;i>=n-k;i--,j++) {
            sum+=a[i];
            c[j]=a[i];
        }
        System.out.println(sum);
        int count=1;
        int t=k;
        for (int i = 0; i < n; i++) {
            if(t==1){
                System.out.print(n-i+" ");
                return;
            }
            boolean f=false;
            for (int j=0; j<k; j++) {
                if(c[j]==b[i]){
                    System.out.print(count+" ");
                    c[j]=0;
                    count=1;
                    f=true;
                    t--;
                    break;
                }
            }
            
            if(!f) count++;
        }
    }
}