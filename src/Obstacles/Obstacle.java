package Obstacles;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import Cartes.Cartes.Type;
import Game.Game;
import Game.Plateau;
import Joueur.Joueur;

public class Obstacle {

	public TypeDeMur type;
	public int ligne;
	public Point numeroCaseMur;
	public Point numeroCaseGlace;
	public int colonne;
	public static ArrayList<Point> murPlaces = new ArrayList<Point>();
	public static ArrayList<Point> murGlacePlaces = new ArrayList<Point>();
	public enum TypeDeMur {
		
		MUR("MurPierre"), MURGLACE("MurGlace");
		
		
				
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
			System.out.println("Donnez la colonne du mur a construire: ");
			Scanner scanner = new Scanner(System.in);
			colonne = scanner.nextInt();
			System.out.println("Donnez la ligne du mur a construire: ");
			ligne = scanner.nextInt();
			
			if(type == TypeDeMur.MUR && Joueur.mursPierre.size() > 0) {
				if(Game.joueurs.get(Game.compteur-1).getMursPierre().size() > 0) {
					if(Plateau.plateauConsole[colonne-1][ligne -1] == ".")
					{
					//Plateau.plateauConsole[colonne-1][ligne -1] = "M";
						numeroCaseMur = new Point(colonne-1, ligne -1);
						murPlaces.add(numeroCaseMur);
						Joueur.mursPierre.remove(0);
						System.out.println("Vous construisez un mur en ["+ colonne + "][" + ligne + "]");
					}else {
						System.out.println("Vous n'avez plus de mur de pierre !");
					}
				}
				else {
						System.out.println("Cette case est deja prise !");
				}
			}
			else if(type == TypeDeMur.MURGLACE) {
				if(Game.joueurs.get(Game.compteur-1).getMursGlace().size() > 0) {
								
					if(Plateau.plateauConsole[colonne-1][ligne-1] == ".")
					{
						numeroCaseGlace = new Point(colonne-1, ligne-1);
						murGlacePlaces.add(numeroCaseGlace);
						Joueur.mursGlace.remove(0);
						System.out.println("Vous construisez un mur de glace en ["+ colonne + "][" + ligne + "]");
					}
				}else {
					System.out.println("Vous n'avez plus de mur de glace !");
				}
			}
			else {
				System.out.println("Cette case est deja prise !");
			}
			//Plateau.game.updatePlateau2J();
			//Plateau.plateau2Joueurs();
			
		}

		public static ArrayList<Point> getMurGlacePlaces() {
			return murGlacePlaces;
		}

		public static void setMurGlacePlaces(ArrayList<Point> murGlacePlaces) {
			Obstacle.murGlacePlaces = murGlacePlaces;
		}

		public Point getNumeroCaseMur() {
			return numeroCaseMur;
		}

		public void setNumeroCaseMur(Point numeroCaseMur) {
			this.numeroCaseMur = numeroCaseMur;
		}

		public Point getNumeroCaseGlace() {
			return numeroCaseGlace;
		}

		public void setNumeroCaseGlace(Point numeroCaseGlace) {
			this.numeroCaseGlace = numeroCaseGlace;
		}

		public static ArrayList<Point> getMurPlaces() {
			return murPlaces;
		}

		public void setMurPlaces(ArrayList<Point> murPlaces) {
			this.murPlaces = murPlaces;
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

