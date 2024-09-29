/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Box extends Rectangle {

    private int height;

    public Box() {
    }

    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + getLength() 
                + "," + this.getWidth() 
                + "," + this.height + "]";
    }

    @Override
    public int are() {
        return 2 * (this.height * this.length
                + this.height * this.width
                + this.length * this.width);
    }

}
