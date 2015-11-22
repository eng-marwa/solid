
package L;

import java.util.ArrayList;
import java.util.List;


/*

    Marwa Talaat
    Liscov Substitution Principle.
     => Subtypes must be substitutable for their base types
*/

public class ShapeList {
    
    public List<Shape> listOfShapes(){
        List<Shape> shapesList = new ArrayList();
        shapesList.add(new Circle(5));
        shapesList.add(new Rectangle(5, 2));
        shapesList.add(new Triangle(2, 4));
        shapesList.add(null);
        
        return shapesList;
    }
    
}
