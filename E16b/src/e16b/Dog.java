/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e16b;

/**
 *
 * @author tungi
 */
public class Dog extends Animal implements Swimmer, Pet{

    public Dog() {
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim.");
    }

    @Override
    public void play() {
        System.out.println("Dog can play.");
    }
    
}
