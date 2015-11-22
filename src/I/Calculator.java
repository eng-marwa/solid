
package I;



public class Calculator {

    public void calcShapeArea(Object shape) {
        double area = 0.0;

        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            c.calcArea();
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            t.calcArea();
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            r.calcArea();
        }else if (shape instanceof Cube) {
            Cube b = (Cube) shape;
            b.calcArea();
            b.calcVolume();
        }else{
            System.out.println("Unknown Shape");
        }

    }

}
