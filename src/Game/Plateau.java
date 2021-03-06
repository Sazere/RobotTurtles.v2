package Game;


import Joueur.Tortue;
import Cartes.Cartes;
import Cartes.Cartes.Type;
import Joueur.Tortue;

public class Plateau {

	public static Game game = new Game(Menu.getNbrJoueur());
	int nbrJoueur = Menu.getNbrJoueur();
	public static String[][] plateauConsole = new String[8][8];
	
	public void InitPlateau()
	{
		switch (nbrJoueur) {
		case 2:
			plateau2Joueurs();
			break;
		case 3:
			plateau3Joueurs();
			break;
		case 4:
			plateau4Joueurs();
			break;			
		}
	}
	public static void plateau2Joueurs(){
		
		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){				
				if(x%7 == 0 && x!=0)
				{					
					plateauConsole[x][y] = "M";					
				}				
				else if(nbrCase == 59)
				{					
					plateauConsole[x][y] = "O";
				}
				else if(nbrCase == game.tortues.get(0).getNumeroCase())
				{						
					plateauConsole[x][y] = game.tortues.get(0).getId();				
				}
				else if(nbrCase == game.tortues.get(1).getNumeroCase())
				{				
					plateauConsole[x][y] = game.tortues.get(1).getId();
				}
				else
				{
					plateauConsole[x][y] = ".";
				}							
				nbrCase+=1;				
			}			
		}
		System.out.print("-------------------------- \n");
		for(int y = 0 ; y < 8 ; y++){
			System.out.print('|');
			for(int x = 0 ; x < 8 ; x++){
				System.out.print(" " + plateauConsole[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();
			}

		game.start();	
	
	}

	private void plateau3Joueurs(){

		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){				
				if(x%7 == 0 && x!=0)
				{					
					plateauConsole[x][y] = "M";					
				}				
				else if(nbrCase == 59)
				{					
					plateauConsole[x][y] = "O";
				}
				else if(nbrCase == game.tortues.get(0).getNumeroCase())
				{		
					plateauConsole[x][y] = game.tortues.get(0).getId();				
				}
				else if(nbrCase == 56)
				{		
					plateauConsole[x][y] = "O";
				}
				else if(nbrCase == game.tortues.get(1).getNumeroCase())
				{					
					plateauConsole[x][y] = game.tortues.get(1).getId();
				}				
				else if(nbrCase == 62)
				{					
					plateauConsole[x][y] = "O";
				}
				else if(nbrCase == game.tortues.get(2).getNumeroCase())
				{			
					plateauConsole[x][y] = game.tortues.get(2).getId();
				}				
				else
				{
					plateauConsole[x][y] = ".";
				}								
				nbrCase+=1;				
			}
			
		}
		System.out.print("-------------------------- \n");
		for(int y = 0 ; y < 8 ; y++){
			System.out.print('|');
			for(int x = 0 ; x < 8 ; x++){
				System.out.print(" " + plateauConsole[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();
			}

		game.start();
	}
	private void plateau4Joueurs(){

		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){		
				
				if(nbrCase == 57)
				{					
					plateauConsole[x][y] = "O";
				}
				else if(nbrCase == game.tortues.get(0).getNumeroCase())
				{		
					plateauConsole[x][y] = game.tortues.get(0).getId();
				}
				else if(nbrCase == game.tortues.get(1).getNumeroCase())
				{					
					plateauConsole[x][y] = game.tortues.get(1).getId();
				}
				else if(nbrCase == game.tortues.get(2).getNumeroCase())
				{			
					plateauConsole[x][y] = game.tortues.get(2).getId();
				}
				else if(nbrCase == game.tortues.get(3).getNumeroCase())
				{			
					plateauConsole[x][y] = game.tortues.get(3).getId();
				}				
				else if(nbrCase == 62)
				{					
					plateauConsole[x][y] = "O";
				}			
				else if(nbrCase == 5)
				{				
					plateauConsole[x][y] = "2";
				}
				else
				{
					plateauConsole[x][y] = ".";
				}							
				nbrCase+=1;		
			}			
		}
		System.out.print("-------------------------- \n");
		for(int y = 0 ; y < 8 ; y++){
			System.out.print('|');
			for(int x = 0 ; x < 8 ; x++){
				System.out.print(" " + plateauConsole[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();
			}

		game.start();
	}

}
