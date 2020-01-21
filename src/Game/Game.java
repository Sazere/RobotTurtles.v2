package Game;

import java.util.*;

import Cartes.Cartes;
import Cartes.Cartes.Type;
import Joueur.Joueur;
import Joueur.Tortue;
import Obstacles.Obstacle;
import Obstacles.Obstacle.TypeDeMur;

public class Game {

	public int nbrJoueur;
	public int input;
	int compteur = 1;
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	public static ArrayList<Tortue> tortues = new ArrayList<Tortue>();
	
	public Game(int nombreJoueur) {
		for(int i=0;i<nombreJoueur;i++) {
			this.joueurs.add(new Joueur(i+1));
			System.out.println("Joueur " +joueurs.get(i).getJoueur());

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
		System.out.println("Debut d'une nouvelle partie de Robot Turtles ! \n"
						+"Creer une partie de: "
						+ "(1) 2 Joueurs"
						+ "(2) 3 Joueurs"
						+ "(3) 4 Joueurs")
		;
	}
		

	public void start() {


		int nombreJoueur = joueurs.size();
		String carte1 = "";
		String carte2 = "";
		String carte3 = "";
		String carte4 = "";
		String carte5 = "";

		while(true) {
			System.out.println("C'est au tour du Joueur " + compteur);
			System.out.println("Voici votre main : ");
			for(Cartes carte : joueurs.get(compteur-1).getMain()) {
				System.out.print(carte.getType().toString() + " ");
			
		}
			System.out.println("\nQue souhaitez-vous faire pendant ce tour ?");
			System.out.println("(1) Compléter le programme \n(2) Construire un mur \n(3) Exécuter le programme");
			int choixMenu = scanner.nextInt();	
			switch (choixMenu) {
			case 1:
				carte1 = "";
				carte2 = "";
				carte3 = "";
				carte4 = "";
				carte5 = "";
				boolean arretChoixCarte = false;
				while(arretChoixCarte == false) {
					System.out.println("\nVoici votre main : ");
					for(Cartes carte : joueurs.get(compteur-1).getMain()) {
						System.out.print(carte.getType().toString() + " ");				
					}
					System.out.println("\nQuelle carte souhaitez-vous ajouter � votre programme ? Tapez 0 si vous ne voulez plus ajouter de cartes.");
					if(carte1 != "Null") {
						System.out.println("(1) Premi�re carte \n");
					}
					if(carte2 != "Null") {
						System.out.println("(2) Deuxi�me carte \n");
					}
					if(carte3 != "Null") {
						System.out.println("(3) Troisi�me carte \n");
					}
					if(carte4 != "Null") {
						System.out.println("(4) Quatri�me carte \n");
					}
					if(carte5 != "Null") {
						System.out.println("(5) Cinqui�me carte \n");
					}
					
					//Les cartes que l'on ajoute aux programmes sont remplacées par des 'O' dans la main, il faut éviter de mettre un 'O' dans le programme.
					int choixCarte = scanner.nextInt();
					switch(choixCarte) {
					case 0:
						arretChoixCarte = true;
						break;
					case 1:
						if(carte1 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(0));
							joueurs.get(compteur-1).getMain().set(0,new Cartes(Type.Null));
							carte1 = "Null";
						
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
							
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte a cet emplacement !");
							break;
						}
						
					case 2:
						if(carte2 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(1));
							joueurs.get(compteur-1).getMain().set(1,new Cartes(Type.Null));
							carte2 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte � cet emplacement !");
							break;
						}
					case 3:
						if(carte3 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(2));
							joueurs.get(compteur-1).getMain().set(2,new Cartes(Type.Null));
							carte3 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte � cet emplacement !");
							break;
						}
					case 4:
						if(carte4 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(3));
							joueurs.get(compteur-1).getMain().set(3,new Cartes(Type.Null));
							carte4 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte � cet emplacement !");
							break;
						}
						
					case 5:
						if(carte5 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(4));
							joueurs.get(compteur-1).getMain().set(4,new Cartes(Type.Null));
							carte5 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte � cet emplacement !");
							break;	
						}
					}
				}
			case 2:
				System.out.println("\n Il vous reste " + joueurs.get(compteur-1).getMursPierre().size() + " murs de pierre et " + joueurs.get(compteur-1).getMursGlace().size() + " de glace. \n"
									+ "Quel type de mur voulez vous constuire ? \n"
									+ "(1) Mur normal \n"
									+"(2) Mur de glace \n");
				int choixMur = scanner.nextInt();
				
				switch(choixMur) {
				
				case 1:					
						Obstacle murPierre = new Obstacle(TypeDeMur.Mur);
						murPierre.placerMur(TypeDeMur.Mur);	
						if(compteur % nombreJoueur == 0) {
							compteur = 0;
						}
						compteur++;
						Plateau.plateau2Joueurs();
					break;
				case 2:
					Obstacle murGlace = new Obstacle(TypeDeMur.MurGlace);
					murGlace.placerMur(TypeDeMur.MurGlace);
					if(compteur % nombreJoueur == 0) {
						compteur = 0;
					}
					compteur++;
					Plateau.plateau2Joueurs();
					break;
				}
				//construireMur();
				break;
			case 3:
				executerProgramme();
				if(compteur % nombreJoueur == 0) {
					compteur = 0;
				}
				compteur++;
				Plateau.plateau2Joueurs();
				
				//start();		
				//verificationVictoire();
				break;
			default:
				System.out.println("Veuillez taper 1, 2 ou 3.");
				start();
				}
			System.out.println("Voici votre main : ");
			for(Cartes carte : joueurs.get(compteur-1).getMain()) {
				System.out.print(carte.getType().toString() + " ");
			
		}
			joueurs.get(compteur-1).defausser();
			joueurs.get(compteur-1).verificationPioche();
		
		if(compteur % nombreJoueur == 0) {
			compteur = 0;
		}
		compteur++;
			
		}			
	}
	public void updatePlateau2J() {
		for(int i = 0; i < joueurs.get(1).getMursPierre().size(); i++) {
			
			ArrayList<Obstacle> listeObstaclePierre = new ArrayList<Obstacle>();
			ArrayList<Integer> coordonneesMur = new ArrayList<Integer>();
			//listeObstaclePierre.add(obstacle);
			coordonneesMur.add(listeObstaclePierre.get(0).getLigne());
			coordonneesMur.add(listeObstaclePierre.get(0).getColonne());
			System.out.println("GRAND TEST" + coordonneesMur);
	}
		joueurs.get(compteur-1).getMursPierre();
		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){				
				if(x%7 == 0 && x!=0)
				{					
					Plateau.plateauConsole[x][y] = "M";					
				}				
				else if(nbrCase == 59)
				{					
					Plateau.plateauConsole[x][y] = "O";
				}
				else if(nbrCase == tortues.get(0).getNumeroCase())
				{						
					Plateau.plateauConsole[x][y] = tortues.get(0).getId();				
				}
				else if(nbrCase == tortues.get(1).getNumeroCase())
				{				
					Plateau.plateauConsole[x][y] = tortues.get(1).getId();
				}
				else
				{
					Plateau.plateauConsole[x][y] = ".";
				}							
				nbrCase+=1;				
			}			
		}
		System.out.print("-------------------------- \n");
		for(int y = 0 ; y < 8 ; y++){
			System.out.print('|');
			for(int x = 0 ; x < 8 ; x++){
				System.out.print(" " + Plateau.plateauConsole[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();
			}

		Plateau.game.start();	
	
	}
	public void executerProgramme() {
		
		int tailleProgramme = joueurs.get(compteur-1).getProgramme().size();
		
		for(int i = 0; i < tailleProgramme ; i++)
		{
			Cartes carte = joueurs.get(compteur-1).getProgramme().get(i);
			carte.execute(carte, tortues.get(compteur-1));
		}
		
	}
	

	/*public void defausser() {
		System.out.println("Voulez-vous défausser le reste de vos cartes ?");
		System.out.println("(1) Oui \n(2) Non");
		int reponseDefausse = scanner.nextInt();
		switch(reponseDefausse) {
		case 1:
			setMain(new ArrayList<>());
			for (int n=0;n<5;n++) {
				this.main.add(pioche.get(0));
				this.defausse.add(pioche.get(0));
				this.pioche.remove(pioche.get(0));
			}
			break;
					
		case 2:
			for ( int i = this.main.size();i<5;i++) {
				this.main.add(pioche.get(0));
				this.defausse.add(pioche.get(0));
				this.pioche.remove(pioche.get(0));
				}
			break;
	
		default:
			System.out.println("Veuillez répondre par oui ou par non.");
			defausser();
			}
		}*/
	/*public void completerProgramme() {
		System.out.println(joueurs.get(compteur-1).getMain());
		System.out.println("Quelle carte souhaitez-vous ajouter à votre programme ?");
		System.out.println("(1) Première carte \n(2) Deuxième Carte \n(3) Troisième carte \n(4) Quatrième carte \n(5) Cinquième carte");
		int choixCarte = scanner.nextInt();
		switch(choixCarte) {
		case 1:
			joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(0));
		case 2:
			joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(1));
		case 3:
			joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(2));
		case 4:
			joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(3));
		case 5:
			joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(4));
		}
	} */
}


