import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class StoreScreen extends Screen {
	int page; // keeps track of what page the user is currently viewing
	LeftRightButton leftArrow; // Button for changing the viewed page to the previous page
	LeftRightButton rightArrow; // Button for changing the viewed page to the next page
	int[] inventoryType; //TO DO: hard code what items should be in the shop
	int[] inventoryPlantType; //TO DO: hard code the plant types for items in the shop 
							  //(all none seed items should have this value set to -1)
	StoreItem[] inventory = new StoreItem[inventoryType.length];
	
	//Might be advisable to create a page class and create and array of pages to handle keeping track of the page
	
	public StoreScreen(int width, int height) {
		//TO DO: Set up button size and location based on screen width and height
		//and initial the StoreItem array using the inventoryType[i] and inventoryPlantType[i]
		//for the itemType and plantType inputs and using width and height to determine where
		//on the screen it will be drawn when it is on the current store page
	}

	@Override
	public void draw(Graphics g, int width, int height) {
		//TO DO: add code to draw items from inventory that are on the current page
		//add code to draw the LeftRightButtons

	}

	@Override
	public void update() {
		//Not sure what to do with this yet. Possibly where Button.isClicked() calls will be handled

	}

}
