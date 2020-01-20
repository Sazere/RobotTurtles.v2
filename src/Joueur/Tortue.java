package Joueur;

import java.awt.Point;

public class Tortue {
	
	Point position;
	int colonne;
	int ligne;
	int numeroCase;
	int direction;
	String id;
	String couleurTortue;
	
	public Tortue() {
		
	}
	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}


	public int getNumeroCase() {
		return numeroCase;
	}

	public void setNumeroCase(int numeroCase) {
		this.numeroCase = numeroCase;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCouleurTortue() {
		return couleurTortue;
	}

	public void setCouleurTortue(String couleurTortue) {
		this.couleurTortue = couleurTortue;
	}

}
