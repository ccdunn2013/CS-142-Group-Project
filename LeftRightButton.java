import java.awt.Graphics;
import java.awt.Rectangle;

public class LeftRightButton extends Button {
	boolean isLeft;
	
	public LeftRightButton(int x, int y, int width, int height, boolean isLeft) {
		this.rect = new Rectangle(x, y, width, height);
		this.isLeft = isLeft;
	}

	@Override
	public void isClicked() {
		//TO DO: add logic to changed the viewed store page

	}

	@Override
	public void draw(Graphics g, int width, int height) {
		//TO DO: add code to determine which way the arrow is pointing and draw the button

	}

}
