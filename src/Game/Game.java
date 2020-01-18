package Game;

import java.util.*;

public class Game {
	
	Scanner scanner = new Scanner(System.in);
	
	public Game() {
		
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
			completerProgramme();
		case 2:
			//construireMur();
		case 3:
			//executerProgramme();
;			
		}
	}
}
