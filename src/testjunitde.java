/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

import jeudedes.D�;

import static org.junit.Assert.*;

/**
 *
 * @author amine
 */
public class testjunitde {
    
    public testjunitde() {
    }
    
    //@Test n�cessaire pour identifier une m�thode de test avec junit //
    @Test
    public void testCtor() {
        D� d = new D�();  
        // il faut que le d� (d) soit non nul //
        assertNotNull(d); // le d� est bien cr�� : diff�rent de null
    }
    
    @Test
    public void testRouler() {
        D� d =new D�();
        int valeur = d.rouler();
        System.out.println(valeur);
        //test r�ussi si la condition de l'assertTrue est v�rifi� //
        assertTrue(valeur >0 && valeur <7);
    }
}
