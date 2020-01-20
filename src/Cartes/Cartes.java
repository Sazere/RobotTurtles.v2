package Cartes;

import java.awt.Point;

import Game.Plateau;
import Joueur.Tortue;

public class Cartes {
	
	public static Type type;
	
	public enum Type {
		
		Avancer, RotationGauche, RotationDroite, Laser, Mur, MurGlace
	}
	
	public Cartes(Type type) {
		
		Cartes.type = type;
	}
	
	public static Type getType() {
		return type;
	}

	public static void setType(Type type) {
		Cartes.type = type;
	}

	public void execute(Cartes carte, Tortue tortue) {
		Type type = Cartes.getType();
		int direction = tortue.getDirection();
		int colonne = tortue.getColonne();
		int ligne = tortue.getLigne();
		int numeroCase = tortue.getNumeroCase();
		String id = tortue.getId();
		if(type == Type.Avancer) {
					
			if(direction == 1 && ligne < 7 ) 
			{				
				tortue.setLigne(ligne + 1);
				tortue.setNumeroCase(numeroCase + 8);				
			}
			else if(direction == 2 && colonne > 0)
			{
				tortue.setColonne(colonne - 1);
				tortue.setNumeroCase(numeroCase -1);
			}
			else if(direction == 3 && ligne > 0)
			{
				tortue.setLigne(ligne -1);
				tortue.setNumeroCase(numeroCase - 8);
			}
			else if(direction == 4 && colonne < 7)
			{
				tortue.setColonne(colonne + 1 );
				tortue.setNumeroCase(numeroCase + 1);
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
			System.out.println("Je tourne à gauche");
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
			System.out.println("Je tourne à droite");
		}
		//Plateau.actualiser2Joueurs(tortue);
		Plateau.plateau2Joueurs();
	}
} 
