package Cartes;

import Game.Plateau;
import Joueur.Tortue;

public class Cartes {
	
	public Type type;
	private String nomCarte;
	
	public enum Type {
		
		Avancer("Bleu"), RotationGauche("Jaune"), RotationDroite("Violette"), Laser("Laser"), Mur("MurPierre"), MurGlace("MurGlace"), Null("Null");
		
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
			System.out.println("Je tourne � gauche");
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
			System.out.println("Je tourne � droite");
		}
	}
} 
