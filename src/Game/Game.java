package Game;

import java.util.Scanner;

public class Game {

	public static int nbrJoueur;
	public int input;
	Scanner scanner = new Scanner(System.in); 
	
	public void menu() {
		System.out.println("Début d'une nouvelle partie de Robot Turtles ! \n"
						+"Créer une parti de: "
						+ "(1) 2 Joueurs"
						+ "(2) 3 Joueurs"
						+ "(3) 4 Joeurs");
		
	
		input = scanner.nextInt();	
		switch (input) {
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
