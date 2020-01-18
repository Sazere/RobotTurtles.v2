package Joueur;

import java.util.*;


//import projet.Pioche;

public class Joueur {
	
	Scanner scanner = new Scanner(System.in);
	private int numeroJoueur;
	private ArrayList<Character> programme = new ArrayList<Character>();
	private ArrayList<Character> pioche = new ArrayList<Character>();
	private ArrayList<Character> main = new ArrayList<Character>();
	private ArrayList<Character> defausse = new ArrayList<Character>();
	
	public Joueur(int numeroJoueur) {
		
		this.numeroJoueur = numeroJoueur;
		int i = 0;
		while(i < 18) {
			this.pioche.add('b');
			i++;
		}
		int j = 0;
		while(j < 8) {
			this.pioche.add('y');
			this.pioche.add('p');
			j++;
		}
		int k = 0;
		while(k < 3) {
			this.pioche.add('l');
			k++;
		}
		Collections.shuffle(this.pioche);
		System.out.println("Deck :" + this.pioche);
		for (int l=0;l<5;l++) {
			this.main.add(pioche.get(0));
			this.defausse.add(pioche.get(0));
			this.pioche.remove(pioche.get(0)); 
			}
		System.out.println("Deck après ajout de la main :" + this.pioche);
		System.out.println("Défausse :" + this.defausse);
		System.out.println("Main :" + this.main);
		
	}
	
	public void defausser() {
		System.out.println("Voulez-vous défausser le reste de vos cartes ?");
		scanner.nextLine();
		String reponseDefausse = scanner.nextLine();
		if (reponseDefausse == "Oui") {
		
			setMain(new ArrayList<>());
			for (int n=0;n<5;n++) {
				this.main.add(pioche.get(0));
				this.defausse.add(pioche.get(0));
				this.pioche.remove(pioche.get(0)); //créer un getteur pour main puis faire deck.getmain
					}
			
		if (reponseDefausse == "Non") {
			for ( int i = this.main.size();i<5;i++) {
				this.main.add(pioche.get(0));
				this.defausse.add(pioche.get(0));
				this.pioche.remove(pioche.get(0));
				break;
				}
		//afficherMain(ButtonGrid2.Joueur1);
			}
		 
			System.out.println("Veuillez répondre par oui ou par non.");
			defausser();
			}
		
	}
	
	public void setMain(ArrayList<Character> nouvelleMain) {
		this.main = nouvelleMain;
	}
	
	public ArrayList<Character> getPioche() {
		return pioche;
	}

	public ArrayList<Character> getMain() {
		return main;
	}

	public ArrayList<Character> getDefausse() {
		return defausse;
	}
	
	public int getJoueur() {
		return numeroJoueur;
	}
	
	public ArrayList<Character> getProgramme() {
		return programme;
	}

}
