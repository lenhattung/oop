/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e14b_2;

import java.util.Date;

/**
 *
 * @author tungi
 */
public class E14b_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = new String("Hello");
        Date d1 = new Date(2024, 9, 28);
        
        System.out.println("s1 is a String: "+ (s1 instanceof String));
        System.out.println("d1 is a Date: "+ (d1 instanceof Date));
        
        Object obj1 = new String("Hello");
        Object obj2 = new Date(System.currentTimeMillis());
        System.out.println(obj2);
        System.out.println("obj1 is a String: "+ (obj1 instanceof String));
        System.out.println("obj1 is a Date: "+ (obj1 instanceof Date));
        System.out.println("obj2 is a String: "+ (obj2 instanceof String));
        System.out.println("obj2 is a Date: "+ (obj2 instanceof Date));
    }
    
}
