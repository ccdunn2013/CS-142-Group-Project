import java.awt.Graphics;
import java.awt.Rectangle;

public class StoreItem extends Button {
	String name; // name of the item
	int itemType = -1; // keeps track of what the item is
	int plantType = -1; // if the item is seeds keeps track of what type of seeds
	int cost = 0; // keeps track of how much the user much pay to add the item to their inventory
	
	public StoreItem (int x, int y, int width, int height, int itemType, int plantType) {
		this.rect = new Rectangle(x, y, width, height);
		this.itemType = itemType;
		if (itemType == -1) {
			this.name = "";
			this.isClickable = false;
			}else {
				this.isClickable = true;
			}
		if (itemType == 0) {
			this.plantType = plantType;
			if (plantType == 0) {
				this.name = "Rose Seed";
				this.cost = 1;
			}//else if () {} TO DO: add more else if statements for other plant types
		}//else if () {} TO DO: add more else if statements for other item types
	}

	@Override
	public void isClicked() {
		//TO DO: add logic for when the item is clicked on in the shop

	}

	@Override
	public void draw(Graphics g, int width, int height) {
		//TO DO: add code to draw the item in the shop

	}

}
