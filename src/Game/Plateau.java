package Game;

import Joueur.Tortue;

public class Plateau {


	int nbrJoueur = Menu.getNbrJoueur();
	private char[][] plateauConsole = new char[8][8];
	
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
	private void plateau2Joueurs(){
		
		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){				
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
		System.out.print("-------------------------- \n");
		for(int y = 0 ; y < 8 ; y++){
			System.out.print('|');
			for(int x = 0 ; x < 8 ; x++){
				System.out.print(" " + plateauConsole[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();
			}
		Game game = new Game(Menu.getNbrJoueur());
		Tortue tortueBleue = new Tortue("Bleue");
		Tortue tortueRouge = new Tortue("Rouge");
		System.out.println("Cette partie est à " +Menu.getNbrJoueur()+ "joueurs.");
		game.start();


	}
	private void plateau3Joueurs(){
		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){				
				if(x%7 == 0 && x!=0)
				{					
					plateauConsole[x][y] = 'M';					
				}				
				else if(nbrCase == 59)
				{					
					plateauConsole[x][y] = 'O';
				}
				else if(nbrCase == 0)
				{		
					plateauConsole[x][y] = '1';
				}
				else if(nbrCase == 56)
				{		
					plateauConsole[x][y] = 'O';
				}
				else if(nbrCase == 3)
				{					
					plateauConsole[x][y] = '2';
				}				
				else if(nbrCase == 62)
				{					
					plateauConsole[x][y] = 'O';
				}
				else if(nbrCase == 6)
				{			
					plateauConsole[x][y] = '3';
				}				
				else
				{
					plateauConsole[x][y] = '.';
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
		Game game = new Game(Menu.getNbrJoueur());
		Tortue tortueBleue = new Tortue("Bleue");
		Tortue tortueRouge = new Tortue("Rouge");
		Tortue tortueViolette = new Tortue("Violette");

		System.out.println("Cette partie est à " +Menu.getNbrJoueur()+ "joueurs.");
		game.start();
	}
	private void plateau4Joueurs(){
	
		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){		
				
				if(nbrCase == 57)
				{					
					plateauConsole[x][y] = 'O';
				}
				else if(nbrCase == 0)
				{		
					plateauConsole[x][y] = '1';
				}
				else if(nbrCase == 2)
				{					
					plateauConsole[x][y] = '2';
				}
				else if(nbrCase == 5)
				{			
					plateauConsole[x][y] = '3';
				}
				else if(nbrCase == 7)
				{			
					plateauConsole[x][y] = '4';
				}				
				else if(nbrCase == 62)
				{					
					plateauConsole[x][y] = 'O';
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
		System.out.print("-------------------------- \n");
		for(int y = 0 ; y < 8 ; y++){
			System.out.print('|');
			for(int x = 0 ; x < 8 ; x++){
				System.out.print(" " + plateauConsole[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();
			}


		Game game = new Game(Menu.getNbrJoueur());
		Tortue tortueBleue = new Tortue("Bleue");
		Tortue tortueRouge = new Tortue("Rouge");
		Tortue tortueViolette = new Tortue("Violette");
		Tortue tortueMarron= new Tortue("Marron");
		System.out.println("Cette partie est à " +Menu.getNbrJoueur()+ "joueurs.");
		game.start();
	}

}
