package Game;


import java.util.*;

import Joueur.Joueur;



public class Game {

	public int nbrJoueur;
	public int input;
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	
	public Game(int nombreJoueur) {
		for(int i=0;i<nombreJoueur;i++) {
			this.joueurs.add(new Joueur(i+1));
			//System.out.println("Joueur " +joueurs.get(i).getJoueur());
			}
		}


	public void start() {
		System.out.println("Début d'une nouvelle partie de Robot Turtles !");
		System.out.println("Cette partie est à " + joueurs.size() + " joueurs.");
		System.out.println("C'est au tour du Joueur 1.");
		System.out.println("Que souhaitez-vous faire pendant ce tour ?");
		System.out.println("(1) Compléter le programme \n(2) Construire un mur \n(3) Exécuter le programme");
		int choixMenu = scanner.nextInt();	
		switch (choixMenu) {
		case 1:
			//completerProgramme();
		case 2:
			//construireMur();
		case 3:
			//executerProgramme();
;			
		}
		


	}
}
