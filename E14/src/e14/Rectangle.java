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
public class Rectangle extends Shape{
    private int lenght;
    private int width;

    public Rectangle() {
        super();
    }

    public Rectangle(Point point, int lenght, int width) {
        super(point);
        this.lenght = lenght;
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int are() {
        return this.lenght* this.width;
    }
    
}
