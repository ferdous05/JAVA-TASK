
package Object_Referance;


public class Main {
    
    public static void main(String[] args) {
        
     MyPoint p = new MyPoint(2,2);
    MyPoint q = new MyPoint(2,2);
    MyPoint r = new MyPoint(2,2);
    
   MyTriangel a = new MyTriangel(p,q,r);
        System.out.println(a.getParamiter());
        
        
    }
    
}
