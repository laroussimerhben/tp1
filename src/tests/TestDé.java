/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

/**
 *
 * @author amine
 */
public class TestD� {
    
    public void testCtor() {
        jeudedes.D� d = new jeudedes.D�();
        if(d != null) {
            System.out.println("Test ctor r�ussi");
        }
        else {
            System.out.println("Test ctor a �chou�");
        }
    }
    
    public void testRouler() {
        jeudedes.D� d = new jeudedes.D�();
        int valeur = d.rouler();
        if(valeur >0 && valeur <7) {
            System.out.println("Test du rouler est ok");
        }
        else {
            System.out.println("Test rouler a �chou�");
        }
        
    }
}
