/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
       this.length = length>0?length:0;
       this.width = width>0?width:0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "[" + length + "," + width + "]";
    }
    public int are(){
        return this.length*this.width;
    }
}
