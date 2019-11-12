import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start {

	public static void main(String[] args) {
		int gameState = 0; // keep track of the screen user is on
		
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

// 		Draw call goes here after draw method has been made
			}
		};
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int wWidth = (int) (d.width * 0.8);
		int wHeight = (int) (d.height * 0.8);
		window.setSize(wWidth, wHeight);
		window.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		window.setContentPane(panel);
		window.setVisible(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
