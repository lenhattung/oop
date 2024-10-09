/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author tungi
 */
public abstract class MyAdapter {
    public void M1(){
        System.out.println("M1");
    }
    public void M2(){
        System.out.println("M2");
    }
    public abstract void M3();
}

class Program{
    public static void main(String[] args){
        MyAdapter obj = new MyAdapter() {
            @Override
            public void M3() {
                System.out.println("M3");                
            }
        };
        obj.M2();
        obj.M1();
    }
}
