
package O;
/*
    Marwa Talaat
    Opened Closed Principle. (Open for extension, Closed for modification)
*/

public class Main{
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calcShapeArea(new Circle(5.0));
        calc.calcShapeArea(new Rectangle(1.0, 2.0));
        calc.calcShapeArea(new Triangle(1.0, 2.0));
        calc.calcShapeArea(null);
    }
    
}

