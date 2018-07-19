import java.util.Scanner;
public class MyClass {
    static int a[]= new int[100009];
    public static void main(String args[]) {
        Scanner scan =  new Scanner(System.in);
    	int n=scan.nextInt();
    	int cmp = 1000000009;
    	int ans=0;
    	for(int i=0; i<n; i++){
    		a[i]=scan.nextInt();
    		a[i] = i+(a[i]-i+n-1)/n*n;
    		if(cmp>a[i]){
    			ans = i;
    			cmp = a[i];
    		}
    	}
        System.out.println(ans+1);
    }
}