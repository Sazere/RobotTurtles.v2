package Cartes;

import Game.Plateau;
import Joueur.Tortue;

public class Cartes {
	
	public Type type;
	private String nomCarte;
	
	public enum Type {

		Avancer("Bleu"), RotationGauche("Jaune"), RotationDroite("Violette"), Laser("Laser"), Null("VIDE");

		
		private String nom;
		
				
		Type(String nom){
			this.nom = nom;
		}
		
		public String toString() {
			return nom;
		}
	}
	
	public Cartes(Type type) {
		
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void execute(Cartes carte, Tortue tortue) {

		int direction = tortue.getDirection();
		int colonne = tortue.getColonne();
		int ligne = tortue.getLigne();
		int numeroCase = tortue.getNumeroCase();
		
		if(type == Type.Avancer) {
					
			if(direction == 1 && ligne < 8 ) 
			{	
				if(Plateau.plateauConsole[colonne-1][ligne] == "O") {
					System.out.println("----------------------VICTOIRE---------------------------");
					Plateau.game.start();
				}
				if(Plateau.plateauConsole[colonne-1][ligne] == "M" || Plateau.plateauConsole[colonne-1][ligne] == "G" ) {
					tortue.setDirection(3);
					System.out.println("Il y a un mur en face, vous faites demi tour !");
					if(Game.Game.compteur == 1) {
						tortue.setId("B3");
					}else if(Game.Game.compteur == 2) {
						tortue.setId("R3");
					}else if(Game.Game.compteur == 3) {
						tortue.setId("V3");
					}else if(Game.Game.compteur == 4) {
						tortue.setId("M3");
					}
					
				}else {
					tortue.setLigne(ligne + 1);
					tortue.setNumeroCase(numeroCase + 8);		
				}
						
			}
			else if(direction == 2 && colonne > 0)
			{
				System.out.println("Direction 2");
				if(Plateau.plateauConsole[colonne-2][ligne-1] == "M" ||Plateau.plateauConsole[colonne-2][ligne-1]== "G" ) {
					tortue.setDirection(4);
					System.out.println("Il y a un mur en face, vous faites demi tour !");
					if(Game.Game.compteur == 1) {
						tortue.setId("B4");
					}else if(Game.Game.compteur == 2) {
						tortue.setId("R4");
					}else if(Game.Game.compteur == 3) {
						tortue.setId("V4");
					}else if(Game.Game.compteur == 4) {
						tortue.setId("M4");
					}
				}else {
					tortue.setColonne(colonne - 1);
					tortue.setNumeroCase(numeroCase -1);		
				}
			}
			else if(direction == 3 && ligne > 0)
			{
				if(Plateau.plateauConsole[colonne+1][ligne] == "M" || Plateau.plateauConsole[colonne+1][ligne] == "G" ) {
					tortue.setDirection(1);
					System.out.println("Il y a un mur en face, vous faites demi tour !");
					if(Game.Game.compteur == 1) {
						tortue.setId("B1");
					}else if(Game.Game.compteur == 2) {
						tortue.setId("R1");
					}else if(Game.Game.compteur == 3) {
						tortue.setId("V1");
					}else if(Game.Game.compteur == 4) {
						tortue.setId("M1");
					}
				}else {
					tortue.setLigne(ligne -1);
					tortue.setNumeroCase(numeroCase - 8);		
				}
				
			}
			else if(direction == 4 && colonne < 8)
			{
				if(Plateau.plateauConsole[colonne][ligne-1] == "M" || Plateau.plateauConsole[colonne][ligne-1] == "G" ) {
					tortue.setDirection(2);			
					System.out.println("Il y a un mur en face, vous faites demi tour !");
					if(Game.Game.compteur == 1) {
						tortue.setId("B2");
					}else if(Game.Game.compteur == 2) {
						tortue.setId("R2");
					}else if(Game.Game.compteur == 3) {
						tortue.setId("V2");
					}else if(Game.Game.compteur == 4) {
						tortue.setId("M2");
					}
				}else {
					tortue.setColonne(colonne + 1 );
					tortue.setNumeroCase(numeroCase + 1);		
				}
			}			
			System.out.println("J'avance");
		}
		if(type == Type.RotationGauche) {
			
			if(direction == 1 )
			{
				tortue.setDirection(2);
				tortue.setId("B2");
			}
			else if(direction == 2)
			{
				tortue.setDirection(3);
				tortue.setId("B3");
			}
			else if(direction == 3)
			{
				tortue.setDirection(4);	
				tortue.setId("B4");}
			else if(direction == 4)
			{
				tortue.setDirection(1);
				tortue.setId("B1");
			}			
			System.out.println("Je tourne a gauche");
		}
		if(type == Type.RotationDroite) {
	
			if(direction == 1)
			{
				tortue.setDirection(4);
				tortue.setId("B4");
			}
			else if(direction == 2)
			{
				tortue.setDirection(1);
				tortue.setId("B1");
			}
			else if(direction == 3)
			{
				tortue.setDirection(2);
				tortue.setId("B2");
			}
			else if(direction == 4)
			{
				tortue.setDirection(3);
				tortue.setId("B3");
			}	
			System.out.println("Je tourne a droite");
		}
	}
} 
