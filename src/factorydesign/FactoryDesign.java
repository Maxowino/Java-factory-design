/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorydesign;


import java.util.Scanner;

/**
 *
 * @author 147119 Maxwell James Owino
 */


public class FactoryDesign{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the shape type ('circle' or 'rectangle'):");
        String shapeType = scanner.nextLine().toLowerCase();

        ShapeFactory shapeFactory;
        Shape shape;

        switch (shapeType) {
            case "circle":
                System.out.println("Enter the radius:");
                double circleRadius = scanner.nextDouble();
                shapeFactory = new CircleFactory(circleRadius);
                shape = shapeFactory.createShape();
                shape.draw();
                break;
            case "rectangle":
                System.out.println("Enter the width:");
                double rectWidth = scanner.nextDouble();
                System.out.println("Enter the height:");
                double rectHeight = scanner.nextDouble();
                shapeFactory = new RectangleFactory(rectWidth, rectHeight);
                shape = shapeFactory.createShape();
                shape.draw();
                break;
            default:
                System.out.println("Invalid shape type entered. Please enter a 'circle' or a 'rectangle'.");
        }

        scanner.close();
    }
}
