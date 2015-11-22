package L;



public class Rectangle extends Shape{

    private double width;
    private double height;
    
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
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
