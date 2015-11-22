/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S;


public class Calculator {
    
    
    public void calcShapeArea(String shape , double radius , double width ,double height){
       double area = 0.0;
        switch(shape){
            case "Circle" :
               area = Math.pow(radius, 2)*Math.PI;
               break;
                
            case "Triangle" :
               area = 0.5 * width * height;
               break;
                
                
            case "Rectangle" :
                area = width * height;
                break;
                
                
                default:
                    area = 0.0;
                    System.out.print("Unknown Shape -> ");
        }
        
        System.out.println("The Area of "+shape+" = "+area);
    }
    
}
