/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e15;

/**
 *
 * @author tungi
 */
/* What is the output of the following program */
class Study_1A {
    void M1() { System.out.print("A"); }
}

class Study_1B extends Study_1A {
    void M2() { System.out.print("B"); }
}

class Study_1C extends Study_1B {
    void M3() { System.out.print("C"); }
}

public class Study_1 {
    public static void main(String[] args) {
        Study_1A obj = new Study_1A();
        obj.M1(); // Output: A
        
        obj = new Study_1B();
        // obj.M2(); // Output: B
        ((Study_1B)obj).M1();
        
        obj = new Study_1C();
        ((Study_1C)obj).M1();

//        // TH1:
//        Study_1C obj = new Study_1C();
//        obj = new Study_1B();
//        
//        // TH2:
//        Study_1B obj2 = new Study_1B();
//        obj2 = new Study_1C();
    }
}

