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
	public static int compteur = 1;
	public static boolean victoire = false;
	
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
					tortues.get(0).setLigne(1);
					tortues.get(0).setColonne(2);
					tortues.get(0).setDirection(1);			
					tortues.get(0).setNumeroCase(1);
					tortues.get(0).setId("B1");
					tortues.get(0).setCouleurTortue("Bleue");
				}
				if(i == 1) {
					tortues.get(1).setDirection(1);
					tortues.get(1).setLigne(1);
					tortues.get(1).setColonne(6);
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

		

	public void start() {


		int nombreJoueur = joueurs.size();
		
		String carte1 = "";
		String carte2 = "";
		String carte3 = "";
		String carte4 = "";
		String carte5 = "";

		while(victoire == false) {
			System.out.println("C'est au tour du Joueur " + compteur);
			System.out.println("Voici votre main : ");
			for(Cartes carte : joueurs.get(compteur-1).getMain()) {
				System.out.print(carte.getType().toString() + " ");
			
		}
			System.out.println("\nQue souhaitez-vous faire pendant ce tour ?");
			System.out.println("(1) Completer le programme \n(2) Construire un mur \n(3) Executer le programme");
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
					System.out.println("\nQuelle carte souhaitez-vous ajouter au votre programme ? Tapez 0 si vous ne voulez plus ajouter de cartes.");
					if(carte1 != "Null") {
						System.out.println("(1) Premiere carte \n");
					}
					if(carte2 != "Null") {
						System.out.println("(2) Deuxieme carte \n");
					}
					if(carte3 != "Null") {
						System.out.println("(3) Troisieme carte \n");
					}
					if(carte4 != "Null") {
						System.out.println("(4) Quatrieme carte \n");
					}
					if(carte5 != "Null") {
						System.out.println("(5) Cinquieme carte \n");
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
							joueurs.get(compteur-1).getMain().set(0,new Cartes(Type.NULL));
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
							joueurs.get(compteur-1).getMain().set(1,new Cartes(Type.NULL));
							carte2 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte a cet emplacement !");
							break;
						}
					case 3:
						if(carte3 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(2));
							joueurs.get(compteur-1).getMain().set(2,new Cartes(Type.NULL));
							carte3 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte acet emplacement !");
							break;
						}
					case 4:
						if(carte4 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(3));
							joueurs.get(compteur-1).getMain().set(3,new Cartes(Type.NULL));
							carte4 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte a cet emplacement !");
							break;
						}
						
					case 5:
						if(carte5 != "Null") {
							joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(4));
							joueurs.get(compteur-1).getMain().set(4,new Cartes(Type.NULL));
							carte5 = "Null";
							System.out.println("Voici votre programme : ");
							for(Cartes carte : joueurs.get(compteur-1).getProgramme()) {
								System.out.print(carte.getType().toString() + " ");
								
						}
							break;
						}else {
							System.out.println("Vous n'avez plus de carte a cet emplacement !");
							break;	
						}
					default:
						System.out.println("Veuillez taper 1, 2, 3, 4, 5 pour le choix des cartes ou 0 si vous voulez quitter.");
					}
					
					
				}
				break;	
			case 2:
				System.out.println("\n Il vous reste " + joueurs.get(compteur-1).getMursPierre().size() + " murs de pierre et " + joueurs.get(compteur-1).getMursGlace().size() + " de glace. \n"
									+ "Quel type de mur voulez vous constuire ? \n"
									+ "(1) Mur normal \n"
									+"(2) Mur de glace \n");
				int choixMur = scanner.nextInt();
				
				switch(choixMur) {
				
				case 1:					
						Obstacle murPierre = new Obstacle(TypeDeMur.MUR);
						murPierre.placerMur(TypeDeMur.MUR);	
						if(compteur % nombreJoueur == 0) {
							compteur = 0;
						}
						compteur++;
						updatePlateau2J();
						//Plateau.plateau2Joueurs();
					break;
				case 2:
					Obstacle murGlace = new Obstacle(TypeDeMur.MURGLACE);
					murGlace.placerMur(TypeDeMur.MURGLACE);
					if(compteur % nombreJoueur == 0) {
						compteur = 0;
					}
					compteur++;
					updatePlateau2J();
					break;
				}
				//construireMur();
				break;
			case 3:
				executerProgramme();
				if(victoire == true) {
					break;
				}
				if(compteur % nombreJoueur == 0) {
					compteur = 0;
				}
				compteur++;
				
				updatePlateau2J();
				break;
			default:
				System.out.println("Veuillez taper 1, 2 ou 3.");
				start();
				}
			if(victoire == false) {
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
	}
	public void updatePlateau2J() {
		
		
		joueurs.get(compteur-1).getMursPierre();
		int nbrCase = 0;
		int nbrCaseMur = -1;
		int nbrCaseMurGlace = -1;
		int compteurMur = 0;
		int compteurMurGlace = 0;
		for(int y=0; y<8; y++){
		
			for(int x=0; x<8; x++){	
				if(x < Obstacle.getMurPlaces().size()) {
					 if(compteurMur < Obstacle.getMurPlaces().size() ) {
						 int murCol = Obstacle.getMurPlaces().get(compteurMur).x;
						 int murLigne = Obstacle.getMurPlaces().get(compteurMur).y+1;
						 nbrCaseMur = (murLigne - 1) * 8 + murCol;			
					 }
				}
				if(x < Obstacle.getMurGlacePlaces().size()) {
					if(compteurMurGlace < Obstacle.getMurGlacePlaces().size() ) {
						System.out.println(Obstacle.getMurGlacePlaces().get(x).x); // colonne
						System.out.println(Obstacle.getMurGlacePlaces().get(x).y); // ligne
						int murCol2 = Obstacle.getMurGlacePlaces().get(compteurMurGlace).x;
						int murLigne2 = Obstacle.getMurGlacePlaces().get(compteurMurGlace).y+1;
						nbrCaseMurGlace = (murLigne2 - 1) * 8 + murCol2;			
						 }
				}
				if(x%7 == 0 && x!=0)
				{					
					Plateau.plateauConsole[x][y] = "M";					
				}
				else if(nbrCase == nbrCaseMur)
				{
					Plateau.plateauConsole[x][y] = "M";
					compteurMur++;
				}
				else if(nbrCase == nbrCaseMurGlace)
				{
					Plateau.plateauConsole[x][y] = "G";
					compteurMurGlace++;
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
			System.out.println("Tortue " + tortues.get(compteur-1).getId()+ " sur la case " + tortues.get(compteur-1).getNumeroCase() + " aux coordonn�es : " + tortues.get(compteur-1).getColonne() + ";" + tortues.get(compteur-1).getLigne());
			//System.out.println("Tortue " + tortues.get(compteur).getId()+ " sur la case " + tortues.get(compteur).getNumeroCase() +  " aux coordonn�es : " + tortues.get(compteur).getColonne() + ";" + tortues.get(compteur).getLigne());
			carte.execute(carte, tortues.get(compteur-1));
			if(nbrJoueur == 2) {
				if(tortues.get(compteur-1).getNumeroCase() == 59) {
					System.out.println("Victoire de la tortue " + tortues.get(compteur-1).getCouleurTortue());
					victoire = true;
					break;
				}
			}
			if(nbrJoueur == 3) {
				if(tortues.get(compteur-1).getNumeroCase() == 56 || tortues.get(compteur-1).getNumeroCase() == 59 || tortues.get(compteur-1).getNumeroCase() == 62) {
					System.out.println("Victoire de la tortue " + tortues.get(compteur-1).getCouleurTortue());
					victoire = true;
					break;
				}
			}
			if(nbrJoueur == 4) {
				if(tortues.get(compteur-1).getNumeroCase() == 57 || tortues.get(compteur-1).getNumeroCase() == 62) {
					System.out.println("Victoire de la tortue " + tortues.get(compteur-1).getCouleurTortue());
					victoire = true;
					break;
				}
			}
		}
		joueurs.get(compteur-1).getProgramme().clear();
	}

}


