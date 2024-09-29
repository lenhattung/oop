/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12;

/**
 *
 * @author tungi
 */
public class E12_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int x = 5;
//        int y = 0;
//        System.out.println(x / y);
//        System.out.println("Hello");
        
        int x = 5;
        int y = 0;
        try {
            // Doan code du doan co Exception
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            // Chi thuc hien khi co Exception
            System.out.println("Error: ArithmeticException");
        }finally{
            // Luon luon thuc hien
            System.out.println("123");
        }
        System.out.println("Hello");
    }

}
