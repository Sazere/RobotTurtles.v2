package Deck;

import java.util.Collections;

public class Deck {

	
	
	public Deck() {
		
		int i = 0;
		while(i < 18) {
			this.pioche.add('b');
			i++;
		}
		int j = 0;
		while(j < 8) {
			this.pioche.add('y');
			this.pioche.add('p');
			j++;
		}
		int k = 0;
		while(k < 3) {
			this.pioche.add('l');
			k++;
		}
		Collections.shuffle(this.pioche);
		System.out.println("Deck :" + this.pioche);
		for (int l=0;l<5;l++) {
			this.main.add(pioche.get(0));
			this.defausse.add(pioche.get(0));
			this.pioche.remove(pioche.get(0)); //créer un getteur pour main puis faire deck.getmain
			}
		System.out.println("Deck après ajout de la main :" + this.pioche);
		System.out.println("Défausse :" + this.defausse);
		System.out.println("Main :" + this.main);
		
	}

}
