package Game;
import java.util.*;

public class Menu {
	
	private static int nombreJoueur;
	Scanner scanner = new Scanner(System.in);
	
	public int startMenu() {
		System.out.println("Debut d'une nouvelle partie de Robot Turtles ! \n"
						+"Creer une partie de: \n"
						+ "(2) 2 Joueurs \n"
						+ "(3) 3 Joueurs \n"
						+ "(4) 4 Joueurs \n");
		
		nombreJoueur = scanner.nextInt();
		return nombreJoueur;
	}

	
	public static int getNbrJoueur() {
		return nombreJoueur;
	}

}
