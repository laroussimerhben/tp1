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
public class Dé
{
//variable globale : défini pour tout le programme et accessible ainsi par toutes les méthodes de la classe//
	private int valeurDe;
	
	//constructeur de notre objet: le même nom que la classe; il sert à initier notre objet
	public Dé()
	{
		valeurDe = (int)(Math.random() * 6) +1;
	}

	// méthode définie par une visibilité (public); type de retour (int) et le nom de la méthode.
	public int rouler() {
		// fournir une valeur aléatoire
		valeurDe=(int)(Math.random() * 6) +1;
		//si on a un type de retour différent du (void); il faut indiquer la valeur retournée avec "return"
		return valeurDe;
	}
}
