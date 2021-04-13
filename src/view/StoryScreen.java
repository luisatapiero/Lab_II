package view;

import processing.core.PApplet;
import processing.core.PImage;

public class StoryScreen {

	private PApplet app;
	PImage imgStoryScreen;

	public StoryScreen(PApplet app) {
		this.app = app;
		loadBackground();
	}
	
	public void loadBackground() {
		imgStoryScreen = app.loadImage("images/StoryScreen.png");
	}

	public PImage getImgStoryScreen() {
		return imgStoryScreen;
	}

	

}
