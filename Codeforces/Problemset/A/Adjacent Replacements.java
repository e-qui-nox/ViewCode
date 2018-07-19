import java.util.Scanner;

public class AdjacentReplacements {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n;
        n = scan.nextInt();
        long[] a = new long[(int) n];
        for(int i=0;i<n;i++){
        	a[i]=scan.nextInt();
            if(a[i]%2==0)
                a[i]=(a[i]-1);
        }
        for(int i=0;i<n;i++){
        	System.out.print(a[i]+" ");
        }
	}
}
