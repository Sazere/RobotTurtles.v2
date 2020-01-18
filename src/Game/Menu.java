package Game;
import java.util.*;

public class Menu {

	int nombreJoueur;
	Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		
	}

	public int startMenu() {
		System.out.println("Début d'une nouvelle partie de Robot Turtles ! \n"
						+"Créer une partie de: "
						+ "(2) 2 Joueurs"
						+ "(3) 3 Joueurs"
						+ "(4) 4 Joueurs");
		int choixMenu = scanner.nextInt();
		return choixMenu;
	}
	
	public int getNombreJoueur() {
		return startMenu();
	}
}
