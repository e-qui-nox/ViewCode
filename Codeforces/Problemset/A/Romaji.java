﻿
import java.util.Scanner;

public class Romaji {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		char[] ch = a.toCharArray();
		int n = a.length();
		boolean f = true;
		for (int i = 0; i < n; i++) {
			char cur = ch[i];
			if (!isvowel(cur) && cur != 'n') {
				if (i == n - 1)
					f = false;
				else if (!isvowel(ch[i + 1]))
					f = false;
			}
		}
		if(f==true)
			System.out.println( "YES");
		else
			System.out.println( "NO");
	}
	private static boolean isvowel(char in) {
		return in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u';
	}
}