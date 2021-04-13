package view;

import processing.core.PApplet;
import processing.core.PImage;

public class HomeScreen {

	private PApplet app;
	PImage imgHomeScreen;

	public HomeScreen(PApplet app) {
		this.app = app;
		loadBackground();
	}

	private void loadBackground() {
		imgHomeScreen = app.loadImage("images/HomeScreen.png");
	}

	public boolean clickStart() {
		if (app.mouseX > 525 && app.mouseX < 752 && app.mouseY > 515 && app.mouseY < 577) {
			return true;
		}
		return false;
	}

	public PImage getImgHomeScreen() {
		return imgHomeScreen;
	}

}
