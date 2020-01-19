package Cartes;

import java.awt.Point;

import Joueur.Tortue;

public class BlueCard extends Cartes{

	public BlueCard(Tortue tortue) {
		
		int direction = tortue.getDirection();
		Point position = tortue.getPosition();
		int numeroCase = tortue.getNumeroCase();
		char id = tortue.getId();
		
		if(direction == 1 && position.x < 7)
		{
			tortue.setPosition(position.x + 1, position.y);
			tortue.setNumeroCase(numeroCase + 8);
		}
		else if(direction == 2 && position.y > 0)
		{
			tortue.setPosition(position.x, position.y - 1);
			tortue.setNumeroCase(numeroCase -1);
		}
		else if(direction == 3 && position.x > 0)
		{
			tortue.setPosition(position.x - 1, position.y);
			tortue.setNumeroCase(numeroCase - 8);
		}
		else if(direction == 4 && position.y < 7)
		{
			tortue.setPosition(position.x, position.y + 1);
			tortue.setNumeroCase(numeroCase + 1);
		}			
	}	
}

