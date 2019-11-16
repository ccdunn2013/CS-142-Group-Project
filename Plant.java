import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Plant {
	Random r = new Random();
	String name = null;
	static int type = -1;
	int turnsToGrow = -1;
	int sucessfulTurns = 0;
	int waterPerTurn = -1;
	int value = -1;
	
	public Plant(int t) {
		type = t;
		if (t == 0) {
			name = "Rose";
			turnsToGrow = r.nextInt(2) + 3;
			waterPerTurn = 1;
			value = r.nextInt(5) + 7;
			
		}//else if () {}
//		TO DO: write else if statements to create other types of plants
		
	}
	
	public void draw(Graphics g, int plotSize, int plotX, int plotY) {
		if (type == 0) {
			g.setColor(Color.GREEN);
			g.drawLine((int ) (plotX + (plotSize / 2)), plotY + plotSize, (int ) (plotX + (plotSize / 2)), (int) (plotY + (plotSize * 0.15)));
			g.setColor(Color.RED);
			g.fillOval((int)((plotSize * 0.7) / 2) + plotX, plotY, (int) (plotSize * 0.3), (int) (plotSize * 0.35));
		}//else if () {}
//		TO DO: write corresponding else if draw calls for other types of plants
	}

}
