package Game;

import Joueur.Joueur;

public class Main {

	public static void main(String[] args) {

	
		Menu menu = new Menu();
		menu.startMenu();	
		Plateau plateau = new Plateau();
		plateau.InitPlateau();
	
	}

}
