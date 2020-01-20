package Game;

import java.util.*;

import Cartes.Cartes;
import Cartes.Cartes.Type;
import Joueur.Joueur;
import Joueur.Tortue;

public class Game {

	public int nbrJoueur;
	public int input;

	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	public static ArrayList<Tortue> tortues = new ArrayList<Tortue>();
	
	public Game(int nombreJoueur) {
		for(int i=0;i<nombreJoueur;i++) {
			this.joueurs.add(new Joueur(i+1));
			tortues.add(new Tortue());
			if(nombreJoueur == 2)
			{
				if(i == 0) {
					tortues.get(0).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(1);
					tortues.get(0).setDirection(1);			
					tortues.get(0).setNumeroCase(1);
					tortues.get(0).setId("B1");
					tortues.get(0).setCouleurTortue("Bleue");
				}
				if(i == 1) {
					tortues.get(1).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(5);
					tortues.get(1).setNumeroCase(5);
					tortues.get(1).setId("R1");
					tortues.get(1).setCouleurTortue("Rouge");
				}		
			}
			if(nombreJoueur == 3)
			{
				if(i == 0) {
					tortues.get(0).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(0);
					tortues.get(0).setNumeroCase(0);
					tortues.get(0).setId("B1");
					tortues.get(0).setCouleurTortue("Bleue");
				}
				if(i == 1) {
					tortues.get(1).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(3);
					tortues.get(1).setNumeroCase(3);
					tortues.get(1).setId("R1");
					tortues.get(1).setCouleurTortue("Rouge");
				}
				if(i == 2) {
					tortues.get(2).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(6);
					tortues.get(2).setNumeroCase(6);
					tortues.get(2).setId("V1");
					tortues.get(2).setCouleurTortue("Violette");
				}
			}
			if(nombreJoueur == 4)
			{
				if(i == 0) {
					tortues.get(0).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(0);
					tortues.get(0).setNumeroCase(0);
					tortues.get(0).setId("B1");
					tortues.get(0).setCouleurTortue("Bleue");
				}
				if(i == 1) {
					tortues.get(1).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(2);
					tortues.get(1).setNumeroCase(2);
					tortues.get(1).setId("R1");
					tortues.get(1).setCouleurTortue("Rouge");
				}
				if(i == 2) {
					tortues.get(2).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(5);
					tortues.get(2).setNumeroCase(5);
					tortues.get(2).setId("V1");
					tortues.get(2).setCouleurTortue("Violette");
				}
				if(i == 3) {
					tortues.get(3).setDirection(1);
					tortues.get(0).setLigne(0);
					tortues.get(0).setColonne(7);
					tortues.get(3).setNumeroCase(7);
					tortues.get(3).setId("M1");
					tortues.get(3).setCouleurTortue("Marron");
				}
			}
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
			Cartes bleue = new Cartes(Type.Avancer);
			bleue.execute(bleue, Game.tortues.get(1));
			Plateau.plateau2Joueurs();
			//executerProgramme();
;			
		}
		
		
	}
}
