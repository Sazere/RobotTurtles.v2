package Joueur;

import java.util.*;

import Cartes.Cartes;
import Cartes.Cartes.Type;
import Game.Game;
import Obstacles.MurGlace;
import Obstacles.MurPierres;




public class Joueur {
		
	Scanner scanner = new Scanner(System.in);
	private int numeroJoueur;
	private ArrayList<Cartes> programme = new ArrayList<Cartes>();
	private ArrayList<Cartes> pioche = new ArrayList<Cartes>();
	private ArrayList<Cartes> main = new ArrayList<Cartes>();
	private ArrayList<Cartes> defausse = new ArrayList<Cartes>();
	/*private ArrayList<MurPierres> mursPierre = new ArrayList<MurPierres>();
	private ArrayList<MurGlace> mursGlace = new ArrayList<MurGlace>();*/
	private ArrayList<Character> mursPierre = new ArrayList<Character>();
	private ArrayList<Character> mursGlace = new ArrayList<Character>();
	
	public Joueur(int numeroJoueur) {
		
		this.numeroJoueur = numeroJoueur;
		int i = 0;
		while(i < 18) {
			this.pioche.add(new Cartes(Type.Avancer));
			i++;
		}
		int j = 0;
		while(j < 8) {
			this.pioche.add(new Cartes(Type.RotationDroite));
			this.pioche.add(new Cartes(Type.RotationGauche));
			j++;
		}
		int k = 0;
		while(k < 3) {
			this.pioche.add(new Cartes(Type.Laser));
			k++;
		}
		Collections.shuffle(this.pioche);
		//System.out.println("Deck :" + this.pioche);
		for (int l=0;l<5;l++) {
			this.main.add(pioche.get(0));
			this.defausse.add(pioche.get(0));
			this.pioche.remove(pioche.get(0)); 
			}
		this.mursPierre.add('M');
		this.mursPierre.add('M');
		this.mursPierre.add('M');
		this.mursGlace.add('G');
		this.mursGlace.add('G');
		/*System.out.println("Deck après ajout de la main :" + this.pioche);
		System.out.println("Défausse :" + this.defausse);
		System.out.println("Main :" + this.main);*/
		
	}
	
	public void defausser() {
		
		System.out.println("Voulez-vous défausser le reste de vos cartes ?");
		System.out.println("(1) Oui \n(2) Non");
		int reponseDefausse = scanner.nextInt();
		switch(reponseDefausse) {
		case 1:
			setMain(new ArrayList<>());
			for (int n=0;n<5;n++) {
				if (this.pioche.isEmpty()==true) {
					Collections.shuffle(this.defausse);
					this.pioche = this.defausse;
					this.defausse.clear();
				}
				this.main.add(pioche.get(0));
				this.defausse.add(pioche.get(0));
				this.pioche.remove(pioche.get(0));
			}
			//System.out.println(this.main);
			break;
					
		case 2:
			for (int i = 0;i<5;i++) {
				if(this.pioche.isEmpty()==true) {
					Collections.shuffle(this.defausse);
					this.pioche = this.defausse;
					this.defausse.clear();
				}
				//Type type = Cartes.getType();
				if(this.main.get(i).type == Type.Null) {
				this.main.set(i,pioche.get(0));
				this.defausse.add(pioche.get(0));
				this.pioche.remove(pioche.get(0));
				}
				
				}
			//System.out.println(this.main);
			break;
	
		default:
			System.out.println("Veuillez répondre par (1) ou par (2).");
			defausser();
			}
		}
		
		public void verificationPioche() {
			if (this.pioche.isEmpty() == true) {
				Collections.shuffle(this.defausse);
				this.pioche = this.defausse;
				this.defausse.clear();
			}
			
		}
		
	/*public void completerProgramme() {
		System.out.println("Quelle carte souhaitez-vous ajouter à votre programme ?");
		System.out.println("Main :" + this.main);
		System.out.println("(1) Première carte \n(2) Deuxième Carte \n(3) Troisième carte \n Quatrième carte");
		
	}*/
	
	public void setMain(ArrayList<Cartes> nouvelleMain) {
		this.main = nouvelleMain;
	}
	
	public ArrayList<Cartes> getPioche() {
		return pioche;
	}

	public ArrayList<Cartes> getMain() {
		return main;
	}

	public ArrayList<Cartes> getDefausse() {
		return defausse;
	}
	
	public int getJoueur() {
		return numeroJoueur;
	}
	
	public ArrayList<Cartes> getProgramme() {
		return programme;
	}

}
