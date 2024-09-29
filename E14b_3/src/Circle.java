/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public Circle( Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int are() {
        return (int)(Math.PI*this.radius*this.radius);
    }
       
}
