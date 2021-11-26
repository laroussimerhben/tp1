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
public class TestDé {
    
    public void testCtor() {
        jeudedes.Dé d = new jeudedes.Dé();
        if(d != null) {
            System.out.println("Test ctor réussi");
        }
        else {
            System.out.println("Test ctor a échoué");
        }
    }
    
    public void testRouler() {
        jeudedes.Dé d = new jeudedes.Dé();
        int valeur = d.rouler();
        if(valeur >0 && valeur <7) {
            System.out.println("Test du rouler est ok");
        }
        else {
            System.out.println("Test rouler a échoué");
        }
        
    }
}
