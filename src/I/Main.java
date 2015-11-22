package I;


import java.util.List;
/*

*/
public class Main {

    public static void main(String[] args) {
       
        ShapeList list = new ShapeList();
        List<IShape> listOfShapes = list.listOfShapes();
//        for (IShape shape : listOfShapes) {
//            if (shape != null) {
//                shape.calcArea();
//                
//            }
//        }
        
        Calculator calc = new Calculator();
          for (IShape shape : listOfShapes) {
            calc.calcShapeArea(shape);
        }
    }

}
