/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e14;

/**
 *
 * @author tungi
 */
public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point(50, 50);
        // static type
        Rectangle r1 = new Rectangle(p1, 100, 200);
        
        // Dynamic type
        Shape s1 = new Rectangle(p1, 50, 90);
        System.out.println(s1.are());
        
        s1 = new Circle(p1, 100);
        System.out.println(s1.are());
    }
}
