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
public class Shape {
    private Point point;

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    
    public int are(){
        return 1;
    }
}
