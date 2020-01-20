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
		System.out.println("Debut d'une nouvelle partie de Robot Turtles ! \n"
						+"Creer une partie de: "
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
			System.out.println("Voici votre main : " + joueurs.get(compteur-1).getMain());
			System.out.println("Que souhaitez-vous faire pendant ce tour ?");
			System.out.println("(1) Compléter le programme \n(2) Construire un mur \n(3) Exécuter le programme");
			int choixMenu = scanner.nextInt();	
			switch (choixMenu) {
			case 1:
				
				boolean arretChoixCarte = false;
				while(arretChoixCarte == false) {
					System.out.println("Voici votre main : " + joueurs.get(compteur-1).getMain());
					System.out.println("Quelle carte souhaitez-vous ajouter à votre programme ? Tapez 0 si vous ne voulez plus ajouter de cartes.");
					System.out.println("(1) Première carte \n(2) Deuxième carte \n(3) Troisième carte \n(4) Quatrième carte \n(5) Cinquième carte");
					//Les cartes que l'on ajoute aux programmes sont remplacées par des 'O' dans la main, il faut éviter de mettre un 'O' dans le programme.
					int choixCarte = scanner.nextInt();
					switch(choixCarte) {
					case 0:
						arretChoixCarte = true;
						break;
					case 1:
						joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(0));
						joueurs.get(compteur-1).getMain().set(0,'O');
						System.out.println(joueurs.get(compteur-1).getMain());
						System.out.println(joueurs.get(compteur-1).getProgramme());
						break;
					case 2:
						joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(1));
						joueurs.get(compteur-1).getMain().set(1,'O');
						System.out.println(joueurs.get(compteur-1).getMain());
						System.out.println(joueurs.get(compteur-1).getProgramme());
						break;
					case 3:
						joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(2));
						joueurs.get(compteur-1).getMain().set(2,'O');
						System.out.println(joueurs.get(compteur-1).getMain());
						System.out.println(joueurs.get(compteur-1).getProgramme());
						break;
					case 4:
						joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(3));
						joueurs.get(compteur-1).getMain().set(3,'O');
						System.out.println(joueurs.get(compteur-1).getMain());
						System.out.println(joueurs.get(compteur-1).getProgramme());
						break;
					case 5:
						joueurs.get(compteur-1).getProgramme().add(joueurs.get(compteur-1).getMain().get(4));
						joueurs.get(compteur-1).getMain().set(4,'O');
						System.out.println(joueurs.get(compteur-1).getMain());
						System.out.println(joueurs.get(compteur-1).getProgramme());
						break;
					}
				}
				
				break;
			case 2:
				//construireMur();
				break;
			case 3:
				//executerProgramme();
				//verificationVictoire();
				break;
			default:
				System.out.println("Veuillez taper 1, 2 ou 3.");
				start();
				}
			System.out.println("Votre main :" + joueurs.get(compteur-1).getMain());
			joueurs.get(compteur-1).defausser();
			joueurs.get(compteur-1).verificationPioche();
		
		if(compteur % nombreJoueur == 0) {
			compteur = 0;
		}
		compteur++;
		

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
