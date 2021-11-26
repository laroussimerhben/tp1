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
public class Principale {

	public static void main( String [] args) {
        TestDé td = new TestDé();
        int x=10;
        String xyz="orsys";
        x++;x=x+1;
        System.out.println(xyz + ";" + x);
        td.testCtor();
        td.testRouler();
    }
}
