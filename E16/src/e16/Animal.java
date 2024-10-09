/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e16;

/**
 *
 * @author tungi
 */
public interface Animal {
    public int y = 10;
    
    // Khai bao ra hang so
    public final int x = 100;
    
    // Phuong thuc static
    public static String getClassName(){
        return "Animal";
    }
    // default method
    public void sound();
    
    // default method
    public void eat();
    
    // default method
    public void sleep();
    
    // default method
    public void m1();
}
