
package Task_of;


public class MAin {
    public static void main(String[] args) {
        
        
        Shap s= new Circle();
        
        System.out.println("Color : "+s.getColor());
        System.out.println("Filler : "+s.isFilled());
        System.out.println("Area : "+s.getArea());
        System.out.println(" Para "+s.getPerimeter());
        
        Shap a = new Rectangle();
        System.out.println("color : "+a.getColor()); 
        System.out.println("Filler :"+a.isFilled());
        System.out.println("Area : "+a.getArea());
        System.out.println("\n\n");
        
        
        
        
    }
}
