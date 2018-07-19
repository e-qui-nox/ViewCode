import java.util.*;
 
public class PackagingCupcakes{
	public static void main (String[] args) {
		int t;
        Scanner scan =new Scanner(System.in);
        t = scan.nextInt();
        while(t-->0){
            int n;
            n=scan.nextInt();
            System.out.println((n/2)+1);
        }
        scan.close();
	}
}