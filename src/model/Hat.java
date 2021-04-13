package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Hat {
	
	private PApplet app;
	private PImage imgHat;
	private PImage imgHatOpacity;

	public Hat(PApplet app) {
		this.app = app;
	}

	private void loadImg() {
		imgHat = app.loadImage("images/Hat.png");
		app.image(imgHat, 200, 200);
		imgHatOpacity = app.loadImage("images/Hat_Opacity.png");
		app.image(imgHatOpacity, 100, 100);
	}


	public void draw() {
		loadImg();
		
	}
	
}
