
package S;
/*
    Marwa Talaat
    Single responsibility Principle.
    Just because you can, does not mean you should.
        A class should have one and only one responsibility 
        because:
•	Each responsibility is an axis of change.
•	Code becomes coupled if classes have more than one responsibility.



    
*/

public class Main {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calcShapeArea("Circle", 0.2, 0.0, 0.0);
        calc.calcShapeArea("Triangle", 0.0, 1.0, 2.0);
        calc.calcShapeArea("Rectangle", 0.0, 1.0, 1.0);
        calc.calcShapeArea("Square", 0.2, 2.0, 2.0);
        calc.calcShapeArea("Cube", 0.2, 2.0, 2.0);
    }
    
}
