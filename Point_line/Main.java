
package Point_line;


public class Main {
    
    public static void main(String[] args) {
        
        Point p = new Point(2,2);
        Point q = new Point(2,2);
        Line a= new Line (p,q);
        System.out.println("total : "+a.getLength());
        
        
    }
    
}
