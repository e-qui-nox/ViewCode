import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
    	HashMap<String, String> map = new HashMap<String, String>();
        map.put("purple","Power");
        map.put("green","Time");
        map.put("blue","Space");
        map.put("orange","Soul");
        map.put("red","Reality");
        map.put("yellow","Mind");
    	Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
             map.remove(scan.next());
        System.out.println(6-n);
        for ( String key : map.keySet() )
            System.out.println(map.get( key ));
        scan.close();
    }
}