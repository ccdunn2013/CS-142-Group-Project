import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start {
	static int gameState = 0; // keep track of the screen user is on
	static int playerMoney = 10;
	static GardenScreen garden;

	public static void main(String[] args) {		
//		Setting up graphics window.
		JFrame window = new JFrame("Garden Simulator");
		window.setLocationByPlatform(true);
		@SuppressWarnings("serial")
		final JPanel panel = new JPanel() {

			protected void paintComponent(Graphics gx) {
				Graphics2D g = (Graphics2D) gx;
				int width = getWidth();
				int height = getHeight();
				g.clearRect(0, 0, width, height);
				g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g.setBackground(Color.WHITE);
				g.setColor(Color.BLACK);
				g.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

				draw(g, width, height);
			}
		};

		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int wWidth = (int) (d.width * 0.8);
		int wHeight = (int) (d.height * 0.8);
		window.setSize(wWidth, wHeight);
		garden = new GardenScreen(wWidth, wHeight);
		window.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		window.setContentPane(panel);
		window.setVisible(true);
		window.setResizable(false);


//		placeholder line to test plant object
		garden.plotColumnOne[0].plantPlant(0);
//		build new screen with JComboFrame
		screenSelect Travel = new screenSelect();
		Travel.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void draw(Graphics g, int width, int height) {
		g.drawString("$" + playerMoney, width / 2, 20);
//		TO DO: write code to determine when to draw garden screen vs other screens
		garden.draw(g, width, height);


	}

}
