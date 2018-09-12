import java.util.Arrays;
import java.util.Scanner;

public class DoggoRecoloring {
	public static void main(String []srgs) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		char[] c = s.toCharArray();
		int[] a = new int[26];
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			a[c[i]-'a']++;
		}
		if(n==1) {
			System.out.println("Yes");
			return;
		}
		for(int i = 0; i<26; i++) {
			if(a[i]>=2) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
