import java.util.Scanner;

public class ReversingEncryption{
	public static void main (String[] args){
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	 String s=scan.next();
	 
	 String reverse=s; String t;
	 
	 for(int i=n/2;i>=1;i--){
    	     int pos=0;t="";
    	  if(n%i==0){
    	       pos=n/i;   
        	   for(int j=pos-1;j>=0;j--)
        	   t+=reverse.charAt(j);
        	   t+=reverse.substring(pos,n);
        	   reverse=t;
    	  }
	 }
	 System.out.println(reverse);
	}
}