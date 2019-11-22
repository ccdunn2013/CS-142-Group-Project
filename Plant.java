import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Plant {
	Random r = new Random();
	String name = null; //name of the plant
	static int type = -1; // int used to identify the plant type
	int turnsToGrow = -1; // the number of successful turns a plant takes to become harvestable
	int sucessfulTurns = 0; // the number of successful turns the plant has had so far
	int waterPerTurn = -1; // the number of times a plant must be watered each turn for the turn to be successful
	int value = -1; // how much money the player gets when they harvest the plant
	
	public Plant(int t) {
		type = t;
		if (t == 0) {
			name = "Rose"; //setting name of type of plant
			turnsToGrow = r.nextInt(2) + 3; // creates a random number of turns needed before harvest this particular range is 3-5
			waterPerTurn = 1;
			value = r.nextInt(5) + 7; // setting random sell value for the plant this particular range is $7-$12
			
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
