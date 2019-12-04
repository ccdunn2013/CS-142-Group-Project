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
			name = "Grapes"; //setting name of type of plant
			turnsToGrow = r.nextInt(2) + 2; // creates a random number of turns needed before harvest this particular range is 2-4
			waterPerTurn = 1;
			value = r.nextInt(5) + 6; // setting random sell value for the plant this particular range is $6-$11
	}
		
		else if (t == 6) {
			name = "Broccoli"; //setting name of type of plant
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
			g.drawLine(plotX + (plotSize / 2), plotY + (plotSize / 3), plotX + (plotSize /2), plotY + plotSize); // center
			g.drawLine((int)(plotX + (plotSize / 4.5)), plotY + (plotSize / 3), plotX + (plotSize /2), plotY + plotSize); //left			
			g.drawLine((int)(plotX + (plotSize / 1.3)), plotY + (plotSize / 3), plotX + (plotSize /2), plotY + plotSize); //right
			
			g.setColor(Color.MAGENTA);
			g.fillOval((int)(plotX + (plotSize / 2.2)), (int)(plotY + (plotSize / 14)), (int)(plotSize / 7.5), (int)(plotSize / 7.5)); // center
			g.fillOval((int)(plotX + (plotSize / 2.4)), (int)(plotY + (plotSize / 6)), (int)(plotSize / 5.5), (int)(plotSize / 5.5));
			g.fillOval((int)(plotX + (plotSize / 2.6)), (int)(plotY + (plotSize / 3.5)), (int)(plotSize / 4), (int)(plotSize / 4));
			
			g.fillOval((int)(plotX + (plotSize / 7.5)), (int)(plotY + (plotSize / 13)), (int)(plotSize / 7.5), (int)(plotSize / 7.5)); //left
			g.fillOval((int)(plotX + (plotSize / 7)), (int)(plotY + (plotSize / 5)), (int)(plotSize / 5.5), (int)(plotSize / 5.5));
			g.fillOval((int)(plotX + (plotSize / 6.7)), (int)(plotY + (plotSize / 3)), (int)(plotSize / 4), (int)(plotSize / 4));
			
			g.fillOval((int)(plotX + (plotSize / 1.2)), (int)(plotY + (plotSize / 13)), (int)(plotSize / 7.5), (int)(plotSize / 7.5)); //right
			g.fillOval((int)(plotX + (plotSize / 1.32)), (int)(plotY + (plotSize / 5)), (int)(plotSize / 5.5), (int)(plotSize / 5.5));
			g.fillOval((int)(plotX + (plotSize / 1.5)), (int)(plotY + (plotSize / 3)), (int)(plotSize / 4), (int)(plotSize / 4));
		}
		else if(type == 2) {
			g.setColor(Color.GREEN);
			g.fillOval((int)(plotX + (plotSize / 4.5)), (int)(plotY + (plotSize / 3.5)), (int)(plotSize / 6), (int)(plotSize / 6)); // left
			g.fillRect((int)(plotX + (plotSize / 4.5)), (int)(plotY + (plotSize / 2.5)), (int)(plotSize / 6), (int)(plotSize / 6.5)); //right
			g.fillOval((int)(plotX + (plotSize / 4.5)), (int)(plotY + (plotSize / 2)), (int)(plotSize / 6), (int)(plotSize / 6)); //center
			
			g.fillOval((int)(plotX + (plotSize / 2.1)), (int)(plotY + (plotSize / 13)), (int)(plotSize / 5), (int)(plotSize / 5)); //center
			g.fillRect((int)(plotX + (plotSize / 2.1)), (int)(plotY + (plotSize / 6)), (int)(plotSize / 5), (int)(plotSize / 1.2));
			g.fillRect((int)(plotX + (plotSize / 3.5)), (int)(plotY + (plotSize / 2)), (int)(plotSize / 1.9), (int)(plotSize / 6));
			
			g.fillOval((int)(plotX + (plotSize / 1.33)), (int)(plotY + (plotSize / 4.5)), (int)(plotSize / 6), (int)(plotSize / 6)); //right			
			g.fillRect((int)(plotX + (plotSize / 1.33)), (int)(plotY + (plotSize / 3.5)), (int)(plotSize / 6), (int)(plotSize / 3.8));			
			g.fillOval((int)(plotX + (plotSize / 1.33)), (int)(plotY + (plotSize / 2)), (int)(plotSize / 6), (int)(plotSize / 6));
		}
		else if (type == 3) {
			g.setColor(Color.GREEN);
			g.drawLine((int ) (plotX + (plotSize / 2)), plotY + plotSize, (int ) (plotX + (plotSize / 2)), (int) (plotY + (plotSize * 0.15)));
			g.fillOval((int)(plotX + (plotSize / 2)), (int)(plotY + (plotSize / 1.7)), (int)(plotSize / 3), (int)(plotSize / 6));
						
			g.setColor(Color.ORANGE);
			g.fillOval((int)((plotSize * 0.7) / 2) + plotX, plotY + (plotSize / 8), (int) (plotSize * 0.3), (int) ((plotSize) * 0.35));
			g.drawLine((int)(plotX + (plotSize / 3)), plotY, (int)(plotX + (plotSize / 3)), (int) (plotY + (plotSize / 6)));	
			g.drawLine((int)(plotX + (plotSize / 3)), plotY, (int)(plotX + (plotSize / 2.3)), (int) (plotY + (plotSize / 6)));
			g.drawLine((int)(plotX + (plotSize / 1.65)), plotY, (int)(plotX + (plotSize / 1.65)), (int) (plotY + (plotSize / 5)));
			g.drawLine((int)(plotX + (plotSize / 1.65)), plotY, (int)(plotX + (plotSize / 2)), (int) (plotY + (plotSize / 6)));
			
			g.setColor(Color.BLACK);
			g.fillOval((int)(plotX + (plotSize / 2.4)), (int)(plotY + (plotSize / 3.2)), (int)(plotSize / 13), (int)(plotSize / 15));
			g.drawLine((int)(plotX + (plotSize / 2.2)), (int)(plotY + (plotSize / 3.2)), (int)(plotX + (plotSize / 2.2)), (int)(plotY + (plotSize / 2.5)));
			g.drawOval((int)(plotX + (plotSize / 2.7)), (int)(plotY + (plotSize / 4.8)), (int)(plotSize / 13), (int)(plotSize / 15));
			g.drawOval((int)(plotX + (plotSize / 2)), (int)(plotY + (plotSize / 4.8)), (int)(plotSize / 13), (int)(plotSize / 15));
		}
		else if (type == 4) {//strawberry
			g.setColor(new Color(65, 199, 38)); //stem
			g.fillRect((int)(plotX + plotSize /2.3), (int)(plotY + (plotSize*.15)), (int)(plotSize/5.5), (int)(plotSize/5.5));
			
			g.setColor(Color.red);
			g.fillOval((int)(plotX + plotSize/8.), (int)(plotY + plotSize/4.), (int) (plotSize/2.0), (int)(plotSize/2.0));
			g.fillOval((int)(plotX + plotSize/2.5), (int)(plotY + plotSize/4.), (int) (plotSize/2.0), (int)(plotSize/2.0));
			g.fillOval((int)(plotX + plotSize/4.), (int)(plotY + plotSize/2.3), (int) (plotSize/2.0), (int)(plotSize/2.0));
				
		}
		else if (type == 5) {//grapes
			g.setColor(new Color(115, 232, 90));// leaf
			g.fillRect((int)(plotX + plotSize /2.5), (int)(plotY + (plotSize*.15)), (int)(plotSize/5.5), (int)(plotSize/5.5));
			
			g.setColor(new Color(139, 58, 201));//Grapes
			g.fillOval((int)(plotX + plotSize/10.), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/5.), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/2.), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/1.5), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
			g.setColor(new Color(93, 38, 135));
			g.drawOval((int)(plotX + plotSize/10.), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/5.), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/2.), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/1.5), (int)(plotY + plotSize/4.), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
			g.setColor(new Color(139, 58, 201));
			g.fillOval((int)(plotX + plotSize/6.), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/4.), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/1.8), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
			g.setColor(new Color(93, 38, 135));
			g.drawOval((int)(plotX + plotSize/6.), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/4.), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/1.8), (int)(plotY + plotSize/2.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
			g.setColor(new Color(139, 58, 201));
			g.fillOval((int)(plotX + plotSize/4.), (int)(plotY + plotSize/1.7), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/1.7), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.fillOval((int)(plotX + plotSize/2.), (int)(plotY + plotSize/1.7), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
			g.setColor(new Color(93, 38, 135));
			g.drawOval((int)(plotX + plotSize/4.), (int)(plotY + plotSize/1.7), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/1.7), (int) (plotSize/4.0), (int)(plotSize/4.0));
			g.drawOval((int)(plotX + plotSize/2.), (int)(plotY + plotSize/1.7), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
			g.setColor(new Color(139, 58, 201));
			g.fillOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/1.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
			g.setColor(new Color(93, 38, 135));
			g.drawOval((int)(plotX + plotSize/2.7), (int)(plotY + plotSize/1.3), (int) (plotSize/4.0), (int)(plotSize/4.0));
			
		}
		else if (type== 6) {//Broccoli
			g.setColor(new Color(115, 232, 90));// stem
			g.fillRoundRect((int)(plotX + plotSize/2.6), (int)(plotY + plotSize/3.), (int) (plotSize/4.), (int)(plotSize/1.5), 5, 5);
			
			g.setColor(new Color(60, 143, 43)); //top
			g.fillOval((int)(plotX + (plotSize/10.)), (int)(plotY + plotSize/3.), (int) (plotSize/3.0), (int)(plotSize/3.0));
			g.fillOval((int)(plotX + (plotSize/4.5)), (int)(plotY + plotSize/5.), (int) (plotSize/2.5), (int)(plotSize/2.5));
			g.fillOval((int)(plotX + (plotSize/2.5)), (int)(plotY + plotSize/5.), (int) (plotSize/2.5), (int)(plotSize/2.5));
			g.fillOval((int)(plotX + (plotSize/1.7)), (int)(plotY + plotSize/3.), (int) (plotSize/3.0), (int)(plotSize/3.0));
			
			g.setColor(new Color(8, 102, 8)); //top outline
			g.drawOval((int)(plotX + (plotSize/10.)), (int)(plotY + plotSize/3.), (int) (plotSize/3.0), (int)(plotSize/3.0));
			g.drawOval((int)(plotX + (plotSize/4.5)), (int)(plotY + plotSize/5.), (int) (plotSize/2.5), (int)(plotSize/2.5));
			g.drawOval((int)(plotX + (plotSize/2.5)), (int)(plotY + plotSize/5.), (int) (plotSize/2.5), (int)(plotSize/2.5));
			g.drawOval((int)(plotX + (plotSize/1.7)), (int)(plotY + plotSize/3.), (int) (plotSize/3.0), (int)(plotSize/3.0));

		}
		else if(type == 7) { //pumpkin
			g.setColor(new Color(242, 120, 27)); //main pumpkin
			g.fillOval((int)(plotX + plotSize/10), (int)(plotY + (plotSize*.2)), (int)(plotSize *.9) , (int)(plotSize *.8));
			
			g.setColor(new Color(65, 199, 38)); //stem
			g.fillRect((int)(plotX + plotSize /2.2), (int)(plotY + (plotSize*.15)), (int)(plotSize/5.5), (int)(plotSize/5.5));
			
			g.setColor(Color.yellow); //face
			g.fillRoundRect((int)(plotX + plotSize/5.), (int)(plotY + plotSize/3.), (int) (plotSize/5.0), (int)(plotSize/5.0), 5, 5);
			g.fillRoundRect((int)(plotX + plotSize/1.5), (int)(plotY + plotSize/3.), (int) (plotSize/5.0), (int)(plotSize/5.0), 5, 5);
			g.fillOval((int)(plotX + plotSize/3.), (int)(plotY + (plotSize/1.5)), (int)(plotSize /3.) , (int)(plotSize /7.));
		}
		//else if () {}
//		TO DO: write corresponding else if draw calls for other types of plants
	}
}