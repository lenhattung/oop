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

    public Vase(int height, String material, int value, String creator) {
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
    
    public void inputVase(){
       super.input();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Input a height: ");
       this.height = sc.nextInt();
       
       System.out.println("Input a material: ");
       sc = new Scanner(System.in);
       this.material = sc.nextLine();
    }
    
    public void outputVase(){
        super.output();
        System.out.println("Height:"+this.getHeight());
        System.out.println("Material:"+this.getMaterial());
    }
    
     public static void main(String[] args){
        Vase v = new Vase();
        v.inputVase();
        v.outputVase();
    }

    @Override
    public String toString() {
        return "Vase{" + "value=" + value + ", creator=" + creator + ", height=" + height + ", material=" + material + '}';
    }

    
     
     
}
