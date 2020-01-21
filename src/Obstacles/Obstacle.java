package Obstacles;

import java.util.Scanner;

import Cartes.Cartes.Type;
import Game.Game;
import Game.Plateau;

public class Obstacle {

	public TypeDeMur type;
	public int ligne;
	public int colonne;
	
	public enum TypeDeMur {
		
		Mur("MurPierre"), MurGlace("MurGlace");
		
		
				
		private String nom;

		TypeDeMur(String nom){
			this.nom = nom;
		}
	}
		
		public Obstacle(TypeDeMur mur) {
		
		this.type = mur;
	}
	
		public TypeDeMur getType() {
			return type;
		}

		public void setType(TypeDeMur type) {
			this.type = type;
		}
		
		public void placerMur(TypeDeMur type) {
			System.out.println("Donnez la ligne du mur à construire: ");
			Scanner scanner = new Scanner(System.in);
			ligne = scanner.nextInt();
			System.out.println("Donnez la colonne du mur à construire: ");
			 colonne = scanner.nextInt();
			
			if(type == TypeDeMur.Mur) {
				if(Plateau.plateauConsole[ligne][colonne] == ".")
				{
					Plateau.plateauConsole[ligne][colonne] = "M";
					System.out.println("Vous construisez un mur en ["+ ligne + "][" + colonne + "]");
				}
			}
			else if(type == TypeDeMur.MurGlace) {
				if(Plateau.plateauConsole[ligne][colonne] == ".")
				{
					Plateau.plateauConsole[ligne][colonne] = "G";
					System.out.println("Vous construisez un mur de glace en ["+ ligne + "][" + colonne + "]");
				}
			}
			else {
				System.out.println("Cette case est déjà prise !");
			}
			//Plateau.game.updatePlateau2J();
			Plateau.plateau2Joueurs();
		}

		public int getLigne() {
			return ligne;
		}

		public void setLigne(int ligne) {
			this.ligne = ligne;
		}

		public int getColonne() {
			return colonne;
		}

		public void setColonne(int colonne) {
			this.colonne = colonne;
		}

}

