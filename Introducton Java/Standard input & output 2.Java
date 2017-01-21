import java.util.*;

class Solution {
    public static void main(String args[] ) {
         // Getting a list of the objects from standard input
         List<Object> ans = getInput();
        // Print out the input properly formatted output to stdout
        System.out.println("String: " + (String)ans.get(2));
        System.out.println("Double: " + (double)ans.get(1));
        System.out.println("Int: "    + (int)ans.get(1));
 }
 public static List<Object> getInput() {
    List<Object> list = new ArrayList<Object>();
    Scanner scan = null;
    try {
        scan = new Scanner(System.in);
        list.add( scan.nextInt() );
        list.add( scan.nextDouble() );
        scan.nextLine();
        list.add( scan.nextLine() );
    } catch( Exception e ) {
        e.printStackTrace();
    } finally {
        if( scan != null ) {
            try { scan.close(); } catch( Exception e ) { e.printStackTrace(); }
        }
    }
    
    return list;
  }
}
