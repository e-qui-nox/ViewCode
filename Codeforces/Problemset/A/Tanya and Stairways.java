import java.util.*;
    public class A{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 0,j = -1;
		int[] a = new int[n];
		for(int i:a) {
			int s = sc.nextInt();
			if(s == 1) {
				j++;
				a[j]++;
				c++;
			} else {
				a[j]++;
			}
		}
		
		System.out.println(c);
		for(int i=0;i<a.length;i++) 
		    if(a[i] != 0) 
		         System.out.print(a[i] + " ");
		
		sc.close();

	}

}