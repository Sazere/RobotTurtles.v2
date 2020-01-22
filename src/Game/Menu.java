package Game;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
public class Menu extends JFrame{
	
	private static int nombreJoueur;
	Scanner scanner = new Scanner(System.in);
	private Plateau plateau = new Plateau();
	public int startMenu() {
		System.out.println("Debut d'une nouvelle partie de Robot Turtles ! \n"
						+"Creer une partie de: \n"
						+ "(2) 2 Joueurs \n"
						+ "(3) 3 Joueurs \n"
						+ "(4) 4 Joueurs \n");
		
		nombreJoueur = scanner.nextInt();
		return nombreJoueur;
	}

	
	public static int getNbrJoueur() {
		return nombreJoueur;
	}

private JPanel pan = new JPanel();
	
	//static JFrame pan = new JFrame();
	private JButton twoplayers = new JButton("Deux joueurs");
	private JButton threeplayers = new JButton("Trois joueurs");
	private JButton fourplayers = new JButton("Quatre joueurs");
	//private JLabel label = new JLabel();
	private JLabel image = new JLabel(new ImageIcon("images/robotturtlesmenu.jpeg"));
	//static ImageIcon backgrd = new ImageIcon(new ImageIcon("images/background.jpeg").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	public void startMenuInterface(){
		this.setTitle("Menu");
		this.setSize(600,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout()); 
		this.add(image, BorderLayout.CENTER);
		//String imgURL = "./images/background.png";
		//ImageIcon icone = new ImageIcon(imgURL);
		//JLabel jlabel = new JLabel(icone, JLabel.CENTER);
		//this.getContentPane().add(jlabel);
		//this.validate();
		pan.add(twoplayers);
		pan.add(threeplayers);
		pan.add(fourplayers);
		this.setContentPane(pan);
		this.setVisible(true);
		
		
		
		twoplayers.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComponent pan = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(pan);
				win.dispose();
				Plateau plateau = new Plateau();
				Plateau.plateau2Joueurs();
				Game game = new Game(2);
				
				}
			
			
		});
	
		threeplayers.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComponent pan = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(pan);
				win.dispose();
				//plateau.plateau3Joueurs();
				Game game = new Game(3);
				
			}
		});
		
		fourplayers.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComponent pan = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(pan);
				win.dispose();
				Game game = new Game(4);
				
				
			}
		});
	}
	
	public Plateau getPlateau() {
		return plateau;
	}
}
