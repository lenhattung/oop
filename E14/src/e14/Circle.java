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
public class Circle extends Shape{
    private int radius;

    public Circle() {
        super();
    }

    public Circle(Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public int are() {
        return (int)(Math.PI * this.radius* this.radius);
    }
    
    
}
