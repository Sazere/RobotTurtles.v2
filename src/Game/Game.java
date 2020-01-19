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
			System.out.println("Joueur " +joueurs.get(i).getJoueur());
			}
		}

	public void Menu() {
		System.out.println("D�but d'une nouvelle partie de Robot Turtles ! \n"
						+"Cr�er une parti de: "
						+ "(1) 2 Joueurs"
						+ "(2) 3 Joueurs"
						+ "(3) 4 Joueurs")
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
				System.out.println(joueurs.get(compteur-1).getMain());
				System.out.println("Quelle carte souhaitez-vous ajouter à votre programme ?");
				System.out.println("(1) Première carte \n(2) Deuxième Carte \n(3) Troisième carte \n(4) Quatrième carte \n(5) Cinquième carte");
				int choixCarte = scanner.nextInt();
				switch(choixCarte) {
				case 1:
					joueurs.get(compteur-1).programme.add(joueurs.get(compteur-1).getMain().get(0));
				case 2:
					joueurs.get(compteur-1).programme.add(joueurs.get(compteur-1).getMain().get(1));
				case 3:
					joueurs.get(compteur-1).programme.add(joueurs.get(compteur-1).getMain().get(2));
				case 4:
					joueurs.get(compteur-1).programme.add(joueurs.get(compteur-1).getMain().get(3));
				case 5:
					joueurs.get(compteur-1).programme.add(joueurs.get(compteur-1).getMain().get(4));
				}
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
