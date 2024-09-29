/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Test {
    public static void main(String[] args){
        // Static type
        Circle c1 = new Circle(new Point(50,50),10);
        System.out.println(c1.are());
        // c1 = new Rectangle(); Không thể được vì khai báo static
        
        
        // Dynamic type
        Shape c2 = new Circle(new Point(50,50),10);
        System.out.println(c2.are());
        c2 = new Rectangle(new Point(50,50), 10, 90);
        System.out.println(c2.are());
        
    }
}
