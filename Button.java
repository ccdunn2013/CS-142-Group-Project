import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Button {
	boolean isClickable = false;
	Rectangle rect = new Rectangle();
	
	public abstract void isClicked();
	
	public abstract void draw(Graphics g, int width, int height);

}
