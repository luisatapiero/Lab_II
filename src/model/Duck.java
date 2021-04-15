package model;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class Duck {
	
	private PApplet app;
	PImage imgDuck;

	public Duck(PApplet app) {
		this.app = app;
		loadImg();
		
	}
	
	private void loadImg() {
		imgDuck = app.loadImage("images/Duck.png");
		
	}


	public void duckShow() {
		
		app.image(imgDuck, 0, 260);
	}

	
	
}
