
package I;

import java.util.ArrayList;
import java.util.List;


/*

    Marwa Talaat
    Interface Segregation Principle.
       => Do not offer the client interfaces that they do not need to use.
*/

public class ShapeList {
    
    public List<IShape> listOfShapes(){
        List<IShape> shapesList = new ArrayList();
        shapesList.add(new Circle(5));
        shapesList.add(new Rectangle(5, 2));
        shapesList.add(new Triangle(2, 4));
        shapesList.add(new Cube(2, 4 , 2));
        shapesList.add(null);
        
        return shapesList;
    }
    
}
