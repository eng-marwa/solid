package I;



public class Cube implements I3DShape{

    private double width;
    private double height;
    private double depth;
    
    public Cube() {
    }

    public Cube(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

  

    @Override
    public void calcArea(){
         double area = 0.0 ; 
         if(height > 0 && width > 0){
             area = height * width;
             System.out.println("The Area of Cube = "+area);
         }
     }

    @Override
    public void calcVolume() {
       double volume = 0.0 ; 
         if(height > 0 && width > 0 && depth >0){
             volume = height * width * depth;
             System.out.println("The Volume of Cube = "+volume);
         }  
        
    }
    
     
}
