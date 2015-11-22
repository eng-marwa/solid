
package L;

import O.*;



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
        }else{
            System.out.println("Unknown Shape");
        }

    }

}
