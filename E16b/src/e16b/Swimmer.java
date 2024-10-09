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
public interface Swimmer {
    public final int x = 100;
    public static int y = 200;
    public static void getClassName(){
        System.out.println("Swimmer");
    }
    public void swim();
}
