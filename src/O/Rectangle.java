
package O;



public class Rectangle extends AbstractShape{

    private double width;
    private double height;
    
    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calcArea(){
         double area = 0.0 ; 
         if(height > 0 && width > 0){
             area = height * width;
             System.out.println("The Area of Rectangle = "+area);
         }
     }
    
     
}
