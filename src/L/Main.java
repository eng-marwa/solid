package L;

import java.util.List;
/*

*/
public class Main {

    public static void main(String[] args) {
       
        ShapeList list = new ShapeList();
        List<Shape> listOfShapes = list.listOfShapes();
//        for (Shape shape : listOfShapes) {
//            if (shape != null) {
//                shape.calcArea();
//            }
//        }
        
        Calculator calc = new Calculator();
          for (Shape shape : listOfShapes) {
            calc.calcShapeArea(shape);
        }
    }

}
