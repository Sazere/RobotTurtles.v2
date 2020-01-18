package Joueur;

import java.util.*;

import Deck.Deck;

//import projet.Pioche;

public class Joueur {
	
	
	private int numeroJoueur;
	private Deck deck;
	private ArrayList<Character> programme = new ArrayList<Character>();
	private ArrayList<Character> pioche = new ArrayList<Character>();
	private ArrayList<Character> main = new ArrayList<Character>();
	private ArrayList<Character> defausse = new ArrayList<Character>();
	
	public Joueur(int numeroJoueur) {
		
		this.numeroJoueur = numeroJoueur;
		Deck deck = new Deck();
		
	}
	
	public int getJoueur() {
		return numeroJoueur;
	}
	
	public ArrayList<Character> getProgramme() {
		return programme;
	}

}
