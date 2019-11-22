import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Screen {
	
	public abstract void draw(Graphics g, int width, int height);
	
	public abstract void update();

}
