import java.awt.Rectangle;

public class Plot {
	boolean isUnlocked = false;
	int plantType = -1;
	Rectangle rect = new Rectangle();
	Plant plantedPlant;
	
	public void plantPlant(int type) {
		plantType = type;
		plantedPlant = new Plant(type);
	}

}
