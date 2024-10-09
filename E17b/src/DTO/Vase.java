/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void output(){
        super.output();
        System.out.println("height:"+this.getHeight());
        System.out.println("material:"+this.getMaterial());
    }
    public void input(){
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a height:");
        int h = sc.nextInt();
        this.setHeight(h);
        System.out.println("Input a haterial:");
        sc = new Scanner(System.in);
        String m = sc.nextLine();
        this.setMaterial(m);
    }

    @Override
    public String toString() {
        return "Vase{"+ "value=" + value + ", creator=" + creator  + ",height=" + height + ", material=" + material + '}';
    }
    
    
}
