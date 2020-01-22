package Joueur;

import java.util.*;

import Cartes.Cartes;
import Cartes.Cartes.Type;

import Game.Game;
import Obstacles.Obstacle;
import Obstacles.Obstacle.TypeDeMur;




public class Joueur {
		
	Scanner scanner = new Scanner(System.in);
	private int numeroJoueur;
	private ArrayList<Cartes> programme = new ArrayList<Cartes>();
	private ArrayList<Cartes> pioche = new ArrayList<Cartes>();
	private ArrayList<Cartes> main = new ArrayList<Cartes>();
	private ArrayList<Cartes> defausse = new ArrayList<Cartes>();
	/*private ArrayList<MurPierres> mursPierre = new ArrayList<MurPierres>();
	private ArrayList<MurGlace> mursGlace = new ArrayList<MurGlace>();*/
	public static ArrayList<Obstacle> mursPierre = new ArrayList<Obstacle>();
	public static ArrayList<Obstacle> mursGlace = new ArrayList<Obstacle>();
	
	public Joueur(int numeroJoueur) {
		
		this.numeroJoueur = numeroJoueur;
		int i = 0;
		while(i < 18) {
			this.pioche.add(new Cartes(Type.AVANCER));
			i++;
		}
		int j = 0;
		while(j < 8) {
			this.pioche.add(new Cartes(Type.ROTATIONDROITE));
			this.pioche.add(new Cartes(Type.ROTATIONGAUCHE));
			j++;
		}
		int k = 0;
		while(k < 3) {
			this.pioche.add(new Cartes(Type.LASER));
			k++;
		}
		int m = 0;
		while(m < 3) {
			this.mursPierre.add(new Obstacle(TypeDeMur.MUR));
			m++;
		}
		int n = 0;
		while(n < 2) {
			this.mursGlace.add(new Obstacle(TypeDeMur.MURGLACE));
			n++;
		}
		Collections.shuffle(this.pioche);
		//System.out.println("Deck :" + this.pioche);
		for (int l=0;l<5;l++) {
			this.main.add(pioche.get(0));
			this.defausse.add(pioche.get(0));
			this.pioche.remove(pioche.get(0)); 
			}
		
		
		
		/*System.out.println("Deck après ajout de la main :" + this.pioche);
		System.out.println("Défausse :" + this.defausse);
		System.out.println("Main :" + this.main);*/
		
	}
	
	public ArrayList<Obstacle> getMursPierre() {
		return mursPierre;
	}

	public void setMursPierre(ArrayList<Obstacle> mursPierre) {
		this.mursPierre = mursPierre;
	}

	public ArrayList<Obstacle> getMursGlace() {
		return mursGlace;
	}

	public void setMursGlace(ArrayList<Obstacle> mursGlace) {
		this.mursGlace = mursGlace;
	}

	public void defausser() {
		

		System.out.println("Voulez-vous defausser le reste de vos cartes ?");

		System.out.println("(1) Oui \n(2) Non");
		int reponseDefausse = scanner.nextInt();
		switch(reponseDefausse) {
		case 1:
			setMain(new ArrayList<>());
			for (int n=0;n<5;n++) {
				if (this.pioche.isEmpty()==true) {
					Collections.shuffle(this.defausse);
					for(int m =0; m<this.defausse.size()-1;m++) {
						this.pioche.add(defausse.get(m));
					}
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
				if (this.pioche.isEmpty()==true) {
					Collections.shuffle(this.defausse);
					for(int m =0; m<this.defausse.size()-1;m++) {
						this.pioche.add(defausse.get(m));
					}
					this.defausse.clear();	
				}
				
				//Type type = Cartes.getType();
				if(this.main.get(i).type == Type.NULL) {
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
			if (this.pioche.isEmpty()==true) {
				Collections.shuffle(this.defausse);
				for(int m =0; m<this.defausse.size()-1;m++) {
					this.pioche.add(defausse.get(m));
				}
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
