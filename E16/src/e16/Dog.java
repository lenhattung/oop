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
public class Dog extends Pet implements Animal, Swimmer{

    public Dog() {
    }
   

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog can sleep");
    }

    @Override
    public void swim() {
         System.out.println("Dog can swim");
    }

    @Override
    public void m1() {
       
    }
    
     
    public static void main(String[] args){
       Animal a = new Dog();
    }
}
