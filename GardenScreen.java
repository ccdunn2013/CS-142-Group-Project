import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GardenScreen extends Screen{
	Plot[] plotColumnOne = new Plot[32];
	Plot[] plotColumnTwo = new Plot[32];
	Plot[] plotColumnThree = new Plot[32];
	static int rowSize = 4;
	static int rowsInColumn = 8;
	static int plotSize = 0;
	Color brown = new Color(0.55f, 0.30f, 0.0f);
	Rectangle water;
	
	
	public GardenScreen(int width, int height) {
		int thirdOfWidth = (int) (width * 0.9) / 3;
		plotSize = (int) Math.ceil((height * 0.8) / (rowsInColumn * 1.5));
		int plotRowOffset = (int) (thirdOfWidth - (plotSize * rowSize)) / 2;
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		
		for (int i = 0; i < 32; i++) {
			plotColumnOne[i] = new Plot();
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				plotColumnOne[c1].rect = new Rectangle((int) plotRowOffset + (p * plotSize), (int) (height * 0.1) + (int) (r * plotSize * 1.5), plotSize, plotSize);
				c1++;
			}
		}
		for (int i = 0; i < 32; i++) {
			plotColumnTwo[i] = new Plot();	
				}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				plotColumnTwo[c2].rect = new Rectangle((int) plotRowOffset + (p * plotSize) + thirdOfWidth, (int) (height * 0.1) + (int) (r * plotSize * 1.5), plotSize, plotSize);
				c2++;
			}
		}
		for (int i = 0; i < 32; i++) {
			plotColumnThree[i] = new Plot();
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				plotColumnThree[c3].rect = new Rectangle((int) plotRowOffset + (p * plotSize) + (thirdOfWidth * 2), (int) (height * 0.1) + (int) (r * plotSize * 1.5), plotSize, plotSize);
				c3++;
			}
		}
		for (int i = 0; i < 4; i++) {
			plotColumnOne[i].isUnlocked = true;
		}
		
		water = new Rectangle((int) (width * 0.89), (int) (height * 0.77), (int) (width * 0.1), (int) (width * 0.1));
		
	}
	
	public void draw(Graphics g, int width, int height) {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				if (plotColumnOne[c1].isUnlocked == false) {
					g.setColor(Color.lightGray);
				}else {
					g.setColor(brown);
				}
				g.fillRect(plotColumnOne[c1].rect.x, plotColumnOne[c1].rect.y, plotColumnOne[c1].rect.width, plotColumnOne[c1].rect.height);
				g.setColor(Color.BLACK);
				g.drawRect(plotColumnOne[c1].rect.x, plotColumnOne[c1].rect.y, plotColumnOne[c1].rect.width, plotColumnOne[c1].rect.height);
				if (plotColumnOne[c1].plantType > -1) {
					plotColumnOne[c1].plantedPlant.draw(g, plotSize, plotColumnOne[c1].rect.x, plotColumnOne[c1].rect.y);
				}
				c1++;
			}
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				if (plotColumnTwo[c2].isUnlocked == false) {
					g.setColor(Color.lightGray);
				}else {
					g.setColor(brown);
				}
				g.fillRect(plotColumnTwo[c2].rect.x, plotColumnTwo[c2].rect.y, plotColumnTwo[c2].rect.width, plotColumnTwo[c2].rect.height);
				g.setColor(Color.BLACK);
				g.drawRect(plotColumnTwo[c2].rect.x, plotColumnTwo[c2].rect.y, plotColumnTwo[c2].rect.width, plotColumnTwo[c2].rect.height);
				if (plotColumnTwo[c2].plantType > -1) {
					plotColumnTwo[c2].plantedPlant.draw(g, plotSize, plotColumnTwo[c2].rect.x, plotColumnTwo[c2].rect.y);
				}
				c2++;
			}
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				if (plotColumnThree[c3].isUnlocked == false) {
					g.setColor(Color.lightGray);
				}else {
					g.setColor(brown);
				}
				g.fillRect(plotColumnThree[c3].rect.x, plotColumnThree[c3].rect.y, plotColumnThree[c3].rect.width, plotColumnThree[c3].rect.height);
				g.setColor(Color.BLACK);
				g.drawRect(plotColumnThree[c3].rect.x, plotColumnThree[c3].rect.y, plotColumnThree[c3].rect.width, plotColumnThree[c3].rect.height);
				if (plotColumnThree[c3].plantType > -1) {
					plotColumnThree[c3].plantedPlant.draw(g, plotSize, plotColumnThree[c3].rect.x, plotColumnThree[c3].rect.y);
				}
				c3++;
			}
		}
		g.setColor(Color.BLUE);
		g.fillOval(water.x, water.y, water.width, water.height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
