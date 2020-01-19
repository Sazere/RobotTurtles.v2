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

	public void Menu() {
		System.out.println("D�but d'une nouvelle partie de Robot Turtles ! \n"
						+"Cr�er une parti de: "
						+ "(1) 2 Joueurs"
						+ "(2) 3 Joueurs"
						+ "(3) 4 Joeurs")
		;
	}
		

	public void start() {

		int nombreJoueur = joueurs.size();
		int compteur = 1;
		while(true) {
			System.out.println("C'est au tour du Joueur " + compteur);
			System.out.println("Que souhaitez-vous faire pendant ce tour ?");
			System.out.println("(1) Compléter le programme \n(2) Construire un mur \n(3) Exécuter le programme");
			int choixMenu = scanner.nextInt();	
			switch (choixMenu) {
			case 1:
				System.out.println("test");
				//completerProgramme();
				break;
			case 2:
				//construireMur();
				break;
			case 3:
				//executerProgramme();
				//verificationVictoire();
				break;
				}
			//Joueur.defausser();
		
		if(compteur % nombreJoueur == 0) {
			compteur = 0;
		}
		compteur++;
		

		}
		


	}
	
	
}
