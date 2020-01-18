package Game;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Plateau {

	int nbrJoueur = menu.getChoixMenu();
	private char[][] plateauConsole = new char[8][8];
	
	public void Plateau()
	{
		switch (nbrJoueur) {
		case 1:
			plateau2Joueurs();
		case 2:
			plateau3Joueurs();
		case 3:
			plateau4Joueurs();
;			
		}
	}
	private void plateau2Joueurs(){
		
		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){
				JButton btn = new JButton();
				btn.setOpaque(false);
				btn.setContentAreaFilled(false);
				
				if(x%7 == 0 && x!=0)
				{					
					plateauConsole[x][y] = 'M';					
				}				
				else if(nbrCase == 59)
				{					
					plateauConsole[x][y] = 'O';
				}
				else if(nbrCase == 1)
				{
					
					plateauConsole[x][y] = '1';
				}
				else if(nbrCase == 5)
				{
					
					plateauConsole[x][y] = '2';
				}
				else
				{
					plateauConsole[x][y] = '.';
				}
								
				nbrCase+=1;
				
			}
			
		}
		for(int y = 0 ; y < 8 ; y++){
			System.out.print('|');
			for(int x = 0 ; x < 8 ; x++){
				System.out.print(" " + plateauConsole[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();}
		
	
		
	}
	private void plateau3Joueurs(){
		
	}
	private void plateau4Joueurs(){
	
}
}
