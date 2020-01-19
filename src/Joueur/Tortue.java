package Joueur;

import java.awt.Point;

public class Tortue {

	
	Point position;
	int numeroCase;
	int direction;
	char id;
	String couleurTortue;
	
	public Tortue() {
		
	}
	
	public Point getPosition() {
		return position;
	}

	public int getNumeroCase() {
		return numeroCase;
	}

	public void setNumeroCase(int numeroCase) {
		this.numeroCase = numeroCase;
	}

	public void setPosition(int x, int y) {
		this.position.x = x;
		this.position.y = y;

	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public String getCouleurTortue() {
		return couleurTortue;
	}

	public void setCouleurTortue(String couleurTortue) {
		this.couleurTortue = couleurTortue;
	}

}
