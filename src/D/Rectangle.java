package D;



public class Rectangle implements IShape{

    private double weight;
    private double height;
    
    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void calcArea(){
         double area = 0.0 ; 
         if(height > 0 && weight > 0){
             area = height * weight;
             System.out.println("The Area of Rectangle = "+area);
         }
     }
    
     
}
