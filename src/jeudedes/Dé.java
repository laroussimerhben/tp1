/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeudedes;

/**
 *
 * @author amine
 */
public class D�
{
//variable globale : d�fini pour tout le programme et accessible ainsi par toutes les m�thodes de la classe//
	private int valeurDe;
	
	//constructeur de notre objet: le m�me nom que la classe; il sert � initier notre objet
	public D�()
	{
		valeurDe = (int)(Math.random() * 6) +1;
	}

	// m�thode d�finie par une visibilit� (public); type de retour (int) et le nom de la m�thode.
	public int rouler() {
		// fournir une valeur al�atoire
		valeurDe=(int)(Math.random() * 6) +1;
		//si on a un type de retour diff�rent du (void); il faut indiquer la valeur retourn�e avec "return"
		return valeurDe;
	}
}
