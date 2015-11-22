package L;


public class Triangle extends Shape{
    
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
     public void calcArea(){
         double area = 0.0 ; 
         if(height > 0 && base > 0){
             area = height * base * 0.5;
             System.out.println("The Area of Triangle = "+area);
         }
     }
    
    
    
}
