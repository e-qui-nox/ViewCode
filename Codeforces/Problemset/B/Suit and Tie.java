import java.util.*;

public class SuitAndTie {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[]=new int[220];
        int ans = 0;
        int n=scan.nextInt();
        for (int i = 1; i <= 2*n; i++) {
            a[i]=scan.nextInt();
        }
        int temp;
        for (int i=2,j;i<=2*n;i+=2){
    		for (j=i;j<=2*n;j++){
        		if (a[j]==a[i-1])
        		break;
    		}	
        		for (;j>i;j--){
        		    temp = a[j];
                    a[j] =a[j-1];
                    a[j-1] = temp;
        			ans++;
        		}
    	}
    	System.out.println(ans);
    }
}