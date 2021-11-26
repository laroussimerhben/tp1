/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

import jeudedes.Dé;

import static org.junit.Assert.*;

/**
 *
 * @author amine
 */
public class testjunitde {
    
    public testjunitde() {
    }
    
    //@Test nécessaire pour identifier une méthode de test avec junit //
    @Test
    public void testCtor() {
        Dé d = new Dé();  
        // il faut que le dé (d) soit non nul //
        assertNotNull(d); // le dé est bien créé : différent de null
    }
    
    @Test
    public void testRouler() {
        Dé d =new Dé();
        int valeur = d.rouler();
        System.out.println(valeur);
        //test réussi si la condition de l'assertTrue est vérifié //
        assertTrue(valeur >0 && valeur <7);
    }
}
