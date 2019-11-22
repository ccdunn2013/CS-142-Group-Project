import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("unused")
public abstract class Screen {
	
	public abstract void draw(Graphics g, int width, int height);
	
	public abstract void update();

}
