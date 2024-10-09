/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.Ex1;

/**
 *
 * @author tungi
 */
public class Tester2 {
    public static void main(String[] args){
        Ex1 e1 = new Ex1();
        //System.out.println(e1.x1); // private
        System.out.println(e1.x2); // public
        //System.out.println(e1.x3); // protected (chung goi, ke thua)
        //System.out.println(e1.x4); // khong co (chung goi)
    }
}
