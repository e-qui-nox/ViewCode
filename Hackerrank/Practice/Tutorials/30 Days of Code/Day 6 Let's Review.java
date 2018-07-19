import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		String str1 = "", str2 = "";
		for (int i = 0; i < t; i++) {
			String str = scan.next();
			char[] ch = str.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (j % 2 == 0) {
					str1 = str1 + ch[j];
				} else {
					str2 = str2 + ch[j];

				}
			}
			System.out.println(str1 + " " + str2);
			str1 = str2 = "";
		}
		scan.close();
    }
}