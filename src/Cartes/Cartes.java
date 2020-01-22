package Cartes;

import Game.Menu;
import Game.Plateau;
import Joueur.Tortue;

public class Cartes {
	
	public Type type;
	private String nomCarte;
	
	public enum Type {
		
		AVANCER("Bleu"), ROTATIONGAUCHE("Jaune"), ROTATIONDROITE("Violette"), LASER("Laser"), NULL("VIDE");
		
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
		
		if(type == Type.AVANCER) {
					
			if(direction == 1 && ligne < 8 ) 
			{					
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
					else if(Plateau.plateauConsole[colonne-1][ligne] != "." ) {
						resetPosition(tortue);						
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
					else if(Plateau.plateauConsole[colonne-2][ligne-1] != "." ) {
						resetPosition(tortue);
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
					else if(Plateau.plateauConsole[colonne+1][ligne] != "." ) {
						resetPosition(tortue);
						
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
				}else if(Plateau.plateauConsole[colonne][ligne-1] != "." ) {
					resetPosition(tortue);	
				}else {
					tortue.setColonne(colonne + 1 );
					tortue.setNumeroCase(numeroCase + 1);		
				}
			}			
			System.out.println("J'avance");
					}
				}
			}
		}
		if(type == Type.ROTATIONGAUCHE) {
			
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
		if(type == Type.ROTATIONDROITE) {
	
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
		if(type == Type.LASER) {
		/*	String nextCase = "";
			if(direction == 1)
			{
				for(int i = tortue.getLigne(); i < 8; i++ ) {
					nextCase = Plateau.plateauConsole[colonne-i][ligne];
				}
			}
			else if(direction == 2)
			{
				
			}
			else if(direction == 3)
			{
				
			}
			else if(direction == 4)
			{
				
			}
			*/
				
		}
	}
	private void resetPosition(Tortue tortue) {

		int colonne = tortue.getColonne();
		int ligne = tortue.getLigne();

		
		if(Plateau.plateauConsole[colonne][ligne-1] != "." ) {

			System.out.println("Il y a une tortue en face, vous revenez a votre position de depart !");
			if(tortue.getCouleurTortue() == "Bleue") {
				if(Menu.getNbrJoueur() == 2) {
					tortue.setNumeroCase(1);
					tortue.setDirection(1);		
					tortue.setId("B1");
				}else if(Menu.getNbrJoueur() == 3) {
					tortue.setNumeroCase(0);
					tortue.setDirection(1);		
					tortue.setId("B1");
				}else if(Menu.getNbrJoueur() == 4) {
					tortue.setNumeroCase(0);
					tortue.setDirection(1);	
					tortue.setId("B1");
				}
				
			}else if(tortue.getCouleurTortue() == "Rouge") {
				if(Menu.getNbrJoueur() == 2) {
					tortue.setNumeroCase(5);
					tortue.setDirection(1);		
					tortue.setId("R1");
				}else if(Menu.getNbrJoueur() == 3) {
					tortue.setNumeroCase(3);
					tortue.setDirection(1);		
					tortue.setId("R1");
				}else if(Menu.getNbrJoueur() == 4) {
					tortue.setNumeroCase(2);
					tortue.setDirection(1);		
					tortue.setId("R1");
				}
			}
			else if(tortue.getCouleurTortue() == "Violette") {
				if(Menu.getNbrJoueur() == 3) {
					tortue.setNumeroCase(6);
					tortue.setDirection(1);	
					tortue.setId("V1");
				}else if(Menu.getNbrJoueur() == 4) {
					tortue.setNumeroCase(5);
					tortue.setDirection(1);	
					tortue.setId("V1");
				}
			}
			else if(tortue.getCouleurTortue() == "Marron") {
				if(Menu.getNbrJoueur() == 4) {
					tortue.setNumeroCase(7);
					tortue.setDirection(1);	
					tortue.setId("M1");
				}
			}			
		}
	}
} 
