package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Hat {
	
	private PApplet app;
	private PImage imgHat;
	private PImage imgHatOpacity;
	private int posX;
	private int posY;

	public Hat(int posX, int posY, PApplet app) {
		this.app = app;
		loadImg();
	}

	private void loadImg() {
		imgHat = app.loadImage("images/Hat.png");
		imgHatOpacity = app.loadImage("images/Hat_Opacity.png");
	
	}


	public void hatOriginal(int posX, int posY) {
		app.image(imgHat, posX, posY);
	}
	
	public void hatOpacity() {
		app.image(imgHatOpacity, 35, 130);
	}
	
	
		
	}

