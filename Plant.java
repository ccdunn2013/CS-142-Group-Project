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
			
		}
		else if(t == 1) {
			name = "Lavender";
			turnsToGrow = r.nextInt(3) + 5;
			waterPerTurn = 2;
			value = r.nextInt(8) + 6;
		}
		else if( t == 2) {
			name = "Cactus";
			turnsToGrow = r.nextInt(5) + 9;
			waterPerTurn = 1;
			value = r.nextInt(10) + 10;
		}
		else if(t == 3) {
			name = "Meow-er";
			turnsToGrow = r.nextInt(10) + 8;
			waterPerTurn = 3;
			value = r.nextInt(15) + 12;
		}
		else if (t == 4) {
			name = "Strawberry"; //setting name of type of plant
			turnsToGrow = r.nextInt(2) + 1; // creates a random number of turns needed before harvest this particular range is 1-3
			waterPerTurn = 1;
			value = r.nextInt(5) + 5; // setting random sell value for the plant this particular range is $5-$10
		}
		
		else if (t == 5) {
			name = "Eggplant"; //setting name of type of plant
			turnsToGrow = r.nextInt(2) + 2; // creates a random number of turns needed before harvest this particular range is 2-4
			waterPerTurn = 1;
			value = r.nextInt(5) + 6; // setting random sell value for the plant this particular range is $6-$11
	}
		
		else if (t == 6) {
			name = "Cabbage"; //setting name of type of plant
			turnsToGrow = r.nextInt(2) + 3; // creates a random number of turns needed before harvest this particular range is 3-5
			waterPerTurn = 1;
			value = r.nextInt(5) + 8; // setting random sell value for the plant this particular range is $8- $13
	}
		
		else if (t == 7) {
			name = "Pumpkin"; //setting name of type of plant
			turnsToGrow = r.nextInt(2) + 5; // creates a random number of turns needed before harvest this particular range is 5-7
			waterPerTurn = 1;
			value = r.nextInt(5) + 15; // setting random sell value for the plant this particular range is $15 - 20
	}
		//else if () {}
//		TO DO: write else if statements to create other types of plants
		
	}
	
	public void draw(Graphics g, int plotSize, int plotX, int plotY) {
		if (type == 0) {
			g.setColor(Color.GREEN);
			g.drawLine((int ) (plotX + (plotSize / 2)), plotY + plotSize, (int ) (plotX + (plotSize / 2)), (int) (plotY + (plotSize * 0.15)));
			g.setColor(Color.RED);
			g.fillOval((int)((plotSize * 0.7) / 2) + plotX, plotY, (int) (plotSize * 0.3), (int) (plotSize * 0.35));
		}
		else if(type == 1) {
			g.setColor(Color.GREEN);
			g.drawLine(plotX + 18, plotY + 10, plotX + 18, plotY + 38); // center
			g.drawLine(plotX + 30, plotY + 12, plotX + 18, plotY + 38); //right			
			g.drawLine(plotX + 6, plotY + 12, plotX + 18, plotY + 38); //left
			
			g.setColor(Color.MAGENTA);
			g.fillOval(plotX + 17, plotY + 2, 4, 4); // center
			g.fillOval(plotX + 16, plotY + 6, 6, 6);
			g.fillOval(plotX + 15, plotY + 12, 8, 8);
			
			g.fillOval(plotX + 2, plotY + 4, 4, 4); //left
			g.fillOval(plotX + 3, plotY + 7, 6, 6);
			g.fillOval(plotX + 4, plotY + 12, 8, 8);
			
			g.fillOval(plotX + 32, plotY + 4, 4, 4); //right
			g.fillOval(plotX + 29, plotY + 7, 6, 6);
			g.fillOval(plotX + 26, plotY + 12, 8, 8);
		}
		else if(type == 2) {
			g.setColor(Color.GREEN);
			g.fillOval(plotX + 8, plotY + 13, 6, 6); // left
			g.fillRect(plotX + 8, plotY + 15, 6, 6);
			g.fillOval(plotX + 8, plotY + 19, 6, 6);
			
			g.fillOval(plotX + 18, plotY + 4, 7, 7); //center
			g.fillRect(plotX + 18, plotY + 6, 7, 33);
			g.fillRect(plotX + 10, plotY + 19, 23, 6);
			
			g.fillOval(plotX + 29, plotY + 10, 6, 6); //right			
			g.fillRect(plotX + 29, plotY + 12, 6, 9);			
			g.fillOval(plotX + 29, plotY + 19, 6, 6);
			
		}
		else if (type == 3) {
			g.setColor(Color.GREEN);
			g.drawLine((int ) (plotX + (plotSize / 2)), plotY + plotSize, (int ) (plotX + (plotSize / 2)), (int) (plotY + (plotSize * 0.15)));
			g.fillOval(plotX + 20, plotY + 23, 8, 8);
			g.drawLine(plotX + 29, plotY + 20, plotX + 23, plotY + 23);
			g.drawLine(plotX + 29, plotY + 20, plotX + 27, plotY + 28);
			
			g.setColor(Color.ORANGE);
			g.fillOval((int)((plotSize * 0.7) / 2) + plotX, plotY + 5, (int) (plotSize * 0.3), (int) ((plotSize) * 0.35));
			g.drawLine(plotX + 13, plotY, plotX + 13, plotY + 10);	
			g.drawLine(plotX  + 13, plotY, plotX + 18, plotY + 10);
			g.drawLine(plotX + 23, plotY, plotX + 23, plotY + 10);
			g.drawLine(plotX + 23, plotY, plotX + 18, plotY + 10);
			
			g.setColor(Color.CYAN);
			g.fillOval(plotX + 14, plotY + 8, 2, 2);
			g.fillOval(plotX + 19, plotY + 8, 2, 2);
			
			g.setColor(Color.BLACK);
			g.fillOval(plotX + 16, plotY + 12, (int) (plotSize * 0.1), (int)(plotSize * 0.06));
			g.drawLine(plotX + 17, plotY + 13, plotX + 17, plotY + 14);
			g.drawOval(plotX + 14, plotY + 8, 2, 2);
			g.drawOval(plotX + 19, plotY + 8, 2, 2);
			g.drawLine(plotX + 27, plotY + 22, plotX + 23, plotY + 27);
		}
		//else if () {}
//		TO DO: write corresponding else if draw calls for other types of plants
	}

}
