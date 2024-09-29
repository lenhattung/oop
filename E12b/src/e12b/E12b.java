/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12b;

/**
 *
 * @author tungi
 */
public class E12b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int x = 5;
//        int y = 0;
//        System.out.println(x/y);
//        System.out.println("--END--");

        int x = 5;
        int y = 0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Error: " +e.getMessage());
        }
        System.out.println("--END--");
    }

}
