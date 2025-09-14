/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sep9;

/**
 *
 * @author imadw
 */
// Circle = subclass Shape + implement Drawable
class Circle extends Shape implements Drawable {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println(" Menggambar lingkaran dengan jari-jari " + radius);
    }
}
/// Rectangle = subclass Shape + implement Drawable

class Rectangle extends Shape implements Drawable {

    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    public void draw() {
        System.out.println(" Menggambar persegi panjang dengan lebar " + width + " dan tinggi " + height);
    }
}

public class ShapeMain {

    public static void main(String[] args) {
        //Membuat objek   Circle dan Rectangle
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 10);

        // Karena kita ingin pakai method draw(), kita perlu cast ke Drawable
        Drawable d1 = (Drawable) circle;
        Drawable d2 = (Drawable) rectangle;

        //Circle
        System.out.println(" Luas lingkaran: " + circle.getArea());
        d1.draw();

        System.out.println();

        // Rectangle
        System.out.println(" Luas persegi panjang: " + rectangle.getArea());
        d2.draw();

        System.out.println(" \n== Polymorphism Loop ==");

        // Bisa juga pakai array agar lebih singkat
        Shape[] shapes = {new Circle(3), new Rectangle(4, 6)};
        for (Shape s : shapes) {
            System.out.println(" Luas: " + s.getArea());
            ((Drawable) s).draw();
        }
    }

}
