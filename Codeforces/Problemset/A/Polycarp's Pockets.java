import java.util.Scanner;

public class PolycarpsPockets {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[101];
		int c=0;
		for(int i=0;i<n;i++) {
			int j=scan.nextInt();
			a[j]++;
			c=Math.max(c, a[j]);
		}
		System.out.println(c);
		scan.close();
	}
}