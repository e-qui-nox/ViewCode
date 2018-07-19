import java.util.Scanner;

public class DeleteFromTheLeft {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        char[] s = a.toCharArray();
        char[] t = b.toCharArray();
        int i = a.length();
        int j = b.length();
        while(i>0 && j>0 && s[i-1]==t[j-1])
	{
	    i--;
	    j--;
	}
	
	System.out.println(i+j);
    }
}