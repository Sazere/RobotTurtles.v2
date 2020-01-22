package Game;


import Joueur.Tortue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Cartes.Cartes;
import Cartes.Cartes.Type;
import Joueur.Tortue;

public class Plateau {

	public static Game game = new Game(Menu.getNbrJoueur());
	int nbrJoueur = Menu.getNbrJoueur();
	public static String[][] plateauConsole = new String[8][8];
	private static JFrame frame = new JFrame(); //creates frame
	private static JButton[][] grid; //names the grid of buttons
	private static ImageIcon tortue1 = new ImageIcon(new ImageIcon("images/turtle1.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	private static ImageIcon tortue2 = new ImageIcon(new ImageIcon("images/turtle2.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	private ImageIcon tortue3 = new ImageIcon(new ImageIcon("images/turtle3.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	private ImageIcon tortue4 = new ImageIcon(new ImageIcon("images/turtle3.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	private static ImageIcon ruby = new ImageIcon(new ImageIcon("images/RUBY.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	private static ImageIcon wall = new ImageIcon(new ImageIcon("images/WALL.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	private static int width = 8;
	private static int length = 8;
	private int nbrCase = 0;
	private JPanel plateau = new JPanel(new GridLayout(8,8));
	private JPanel deck = new JPanel(new GridLayout(4, 4));
	private JPanel execution = new JPanel();
	private JPanel left = new JPanel();
	private JPanel top = new JPanel();

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
		frame.setLayout(new BorderLayout()); //set layout
		JPanel plateau = new JPanel(new GridLayout(8,8));
		JPanel deck = new JPanel(new GridLayout(4, 4));
		JPanel execution = new JPanel();
		JPanel left = new JPanel();
		JPanel top = new JPanel();
		deck.setPreferredSize(new Dimension(100, 0));
		execution.setPreferredSize(new Dimension(0, 100));
		left.setPreferredSize(new Dimension(100, 0));
		top.setPreferredSize(new Dimension(0, 100));
		frame.getContentPane().add(plateau, BorderLayout.CENTER);
		frame.getContentPane().add(deck, BorderLayout.WEST);
		frame.getContentPane().add(execution, BorderLayout.SOUTH);
		frame.getContentPane().add(left, BorderLayout.EAST);
		frame.getContentPane().add(top, BorderLayout.NORTH);
		grid=new JButton[width][length]; //allocate the size of grid
		
		int nbrCase = 0;
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){				
				JButton btn = new JButton();
				btn.setOpaque(false);
				btn.setContentAreaFilled(false);
				
				if(x%7 == 0 && x!=0)
				{	
					btn = new JButton(wall);
					btn.setOpaque(false);
					btn.setContentAreaFilled(false);
					plateauConsole[x][y] = "M";					
				}				
				else if(nbrCase == 59)
				{					

					btn = new JButton(ruby);
					btn.setOpaque(false);
					btn.setContentAreaFilled(false);
					plateauConsole[x][y] = "O";
				}
				else if(nbrCase == game.tortues.get(0).getNumeroCase())
				{						
					btn = new JButton(tortue1);
					btn.setOpaque(false);
					btn.setContentAreaFilled(false);
					plateauConsole[x][y] = game.tortues.get(0).getId();				
				}
				else if(nbrCase == game.tortues.get(1).getNumeroCase())
				{				
					btn = new JButton(tortue2);
					btn.setOpaque(false);
					btn.setContentAreaFilled(false);
					plateauConsole[x][y] = game.tortues.get(1).getId();
				}
				else
				{
					plateauConsole[x][y] = ".";
				}							

				grid[x][y]=btn; //creates new button	  
				plateau.add(btn); //adds button to grid
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
	public static void actualiser2Joueurs(Tortue nomTortue){
		
		int caseActuelle = nomTortue.getNumeroCase();
		String id = nomTortue.getId();
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
				else if(nbrCase == caseActuelle)
				{
					plateauConsole[x][y] = id;
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
		System.out.print("-------------------------- \n");

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
