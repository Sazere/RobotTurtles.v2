package Joueur;

import java.util.*;
import Game.Game;
import Game.Plateau;

public class Joueur {
		
	private int numeroJoueur;
	private ArrayList<Character> programme = new ArrayList<Character>();
	private ArrayList<Character> pioche = new ArrayList<Character>();
	private ArrayList<Character> main = new ArrayList<Character>();
	private ArrayList<Character> defausse = new ArrayList<Character>();
		
	public Joueur(int numeroJoueur) {
		
		this.numeroJoueur = numeroJoueur;
		int i = 0;
		while(i < 18) {
			this.pioche.add('b');
			i++;
		}
		int j = 0;
		while(j < 8) {
			this.pioche.add('y');
			this.pioche.add('p');
			j++;
		}
		int k = 0;
		while(k < 3) {
			this.pioche.add('l');
			k++;
		}
		Collections.shuffle(this.pioche);
		System.out.println("Deck :" + this.pioche);
		for (int l=0;l<5;l++) {
			this.main.add(pioche.get(0));
			this.defausse.add(pioche.get(0));
			this.pioche.remove(pioche.get(0)); 
			}
		System.out.println("Deck après ajout de la main :" + this.pioche);
		System.out.println("Défausse :" + this.defausse);
		System.out.println("Main :" + this.main);
		
	}
	
	public ArrayList<Character> getPioche() {
		return pioche;
	}

	public ArrayList<Character> getMain() {
		return main;
	}

	public ArrayList<Character> getDefausse() {
		return defausse;
	}
	
	public int getJoueur() {
		return numeroJoueur;
	}
	
	public ArrayList<Character> getProgramme() {
		return programme;
	}

}
