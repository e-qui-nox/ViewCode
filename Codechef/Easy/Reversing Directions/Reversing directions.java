import java.util.*;
import java.lang.*;
import java.io.*;
 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            int n = scan.nextInt();
            scan.nextLine();
            String[] s= new String[n];
            for(int i=0;i<n;i++){
		        s[i]=scan.nextLine();
                
            }
            System.out.println("Begin"+ (s[n-1].substring(s[n-1].indexOf(" "))));
            for(int j=n-1;j>0;j--){
                if(s[j].startsWith("Right")){
                    System.out.println("Left"+ (s[j-1].substring(s[j-1].indexOf(" "))));}
                else{
                    System.out.println("Right"+ (s[j-1].substring(s[j-1].indexOf(" "))));}
            }
            System.out.println();
            t--;
        }
        scan.close();
	}
}