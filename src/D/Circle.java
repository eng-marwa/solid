package D;


public class Circle implements IShape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calcArea(){
        double area = 0.0;
        if(radius >0){
            area = Math.pow(radius, 2)*Math.PI;
            System.out.println("The Area of Circle  = "+ area);
        }
    }
    
   
    
}
