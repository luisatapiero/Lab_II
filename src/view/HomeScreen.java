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
	
	public void loadBackground() {
		imgHomeScreen = app.loadImage("images/HomeScreen.png");
	}

	public PImage getImgHomeScreen() {
		return imgHomeScreen;
	}

}
