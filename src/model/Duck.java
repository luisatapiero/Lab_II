package model;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class Duck {
	
	private PApplet app;
	PImage imgDuck;

	public Duck(PApplet app) {
		this.app = app;
		
	}
	
	private void loadImg() {
		imgDuck = app.loadImage("images/Duck.png");
		app.image(imgDuck, 200, 200);
	}


	public void draw() {
		loadImg();
		
	}

	
	
}
