/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p2.*;

/**
 *
 * @author tungi
 */
public class Tester {
    public static void main(String[] args){
        P2 p = new P2();
        // System.out.println(p.x1); // Không thể truy cập được
        System.out.println(p.x2); // public
        //System.out.println(p.x3); // protected => kế thừa hoặc là chung package
        //System.out.println(p.x4); // default => chung package
    }
}
