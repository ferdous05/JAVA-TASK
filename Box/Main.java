
package Box;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(12,85,10);
        System.out.println(b1.volume());
        
        Box b2 = new Box(12,85,10);
        System.out.println(b1.eqalto(b2));
        
   
    }
}
