/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e15;

/**
 *
 * @author tungi
 */
public class Study_2 {
    public static int N = 5;
    int x = 100;
    final int y = 100;
    static {
       N = 100;
       x = 50;
    }
    
    public void output(){
        x = 200;
    }
    
    
    public static void main(String[] args){
        System.out.println("N=" + Study_2.N);
        
        Study_2 st2 = new Study_2();
        System.out.println("x=" + st2.x);
        st2.y = 200;
    }
}
