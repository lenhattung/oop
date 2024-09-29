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
        Rectangle r = new Rectangle(50, 60);
        System.out.println(r.toString());
        System.out.println(r.are());
        
        Box b = new Box(10, 50, 60);
        System.out.println(b.toString());
        System.out.println(b.are());
    }
}
