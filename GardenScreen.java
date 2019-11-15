import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GardenScreen {
	Plot[] plotColumnOne = new Plot[32];
	Plot[] plotColumnTwo = new Plot[32];
	Plot[] plotColumnThree = new Plot[32];
	int rowSize = 4;
	int rowsInColumn = 8;
	public GardenScreen(int width, int height) {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		int plotSize = (int) Math.ceil((height * 0.8) / (8 * 1.5));
		
		for (int i = 0; i < 32; i++) {
			plotColumnOne[i] = new Plot();
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				plotColumnOne[c1].rect = new Rectangle((int) (width * 0.1) + (p * plotSize), (int) (height * 0.1) + (int) (r * plotSize * 1.5), plotSize, plotSize);
				c1++;
			}
		}
		for (int i = 0; i < 32; i++) {
			plotColumnTwo[i] = new Plot();	
				}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				plotColumnTwo[c2].rect = new Rectangle((int) (width * 0.1) + (p * plotSize) + (plotSize * 8), (int) (height * 0.1) + (int) (r * plotSize * 1.5), plotSize, plotSize);
				c2++;
			}
		}
		for (int i = 0; i < 32; i++) {
			plotColumnThree[i] = new Plot();
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				plotColumnThree[c3].rect = new Rectangle((int) (width * 0.1) + (p * plotSize) + (plotSize * 16), (int) (height * 0.1) + (int) (r * plotSize * 1.5), plotSize, plotSize);
				c3++;
			}
		}
		for (int i = 0; i < 4; i++) {
			plotColumnOne[i].isUnlocked = true;
		}
		
	}
	
	public void draw(Graphics g, int width, int height) {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				if (plotColumnOne[c1].isUnlocked == false) {
					g.setColor(Color.GRAY);
				}else {
					g.setColor(Color.ORANGE);
				}
				g.fillRect(plotColumnOne[c1].rect.x, plotColumnOne[c1].rect.y, plotColumnOne[c1].rect.width, plotColumnOne[c1].rect.height);
				g.setColor(Color.BLACK);
				g.drawRect(plotColumnOne[c1].rect.x, plotColumnOne[c1].rect.y, plotColumnOne[c1].rect.width, plotColumnOne[c1].rect.height);
				c1++;
			}
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				if (plotColumnTwo[c2].isUnlocked == false) {
					g.setColor(Color.GRAY);
				}else {
					g.setColor(Color.ORANGE);
				}
				g.fillRect(plotColumnTwo[c2].rect.x, plotColumnTwo[c2].rect.y, plotColumnTwo[c2].rect.width, plotColumnTwo[c2].rect.height);
				g.setColor(Color.BLACK);
				g.drawRect(plotColumnTwo[c2].rect.x, plotColumnTwo[c2].rect.y, plotColumnTwo[c2].rect.width, plotColumnTwo[c2].rect.height);
				c2++;
			}
		}
		for (int r = 0; r < rowsInColumn; r++) {
			for (int p = 0; p < rowSize; p++) {
				if (plotColumnThree[c3].isUnlocked == false) {
					g.setColor(Color.GRAY);
				}else {
					g.setColor(Color.ORANGE);
				}
				g.fillRect(plotColumnThree[c3].rect.x, plotColumnThree[c3].rect.y, plotColumnThree[c3].rect.width, plotColumnThree[c3].rect.height);
				g.setColor(Color.BLACK);
				g.drawRect(plotColumnThree[c3].rect.x, plotColumnThree[c3].rect.y, plotColumnThree[c3].rect.width, plotColumnThree[c3].rect.height);
				c3++;
			}
		}
	}
}
