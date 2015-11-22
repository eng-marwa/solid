
package S;


public class Main2 {
    
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        calc.calcShapeArea(new Circle(5.0));
        calc.calcShapeArea(new Rectangle(1.0, 2.0));
        calc.calcShapeArea(new Triangle(1.0, 2.0));
        calc.calcShapeArea(null);
    }
    
}
