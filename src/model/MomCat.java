package model;

import processing.core.PApplet;
import processing.core.PImage;

public class MomCat {

	private PApplet app;
	private PImage imgMomCat;
	private PImage imgCatOpacity;
	
	public MomCat(PApplet app) {
		this.app = app;
	}

	private void loadImg() {
		imgMomCat = app.loadImage("images/Cat_Original.png");
		app.image(imgMomCat, 200, 200);
		imgMomCat = app.loadImage("images/Cat_Opacity.png");
		app.image(imgMomCat, 100, 100);
	}


	public void draw() {
		loadImg();
		
	}
	
}
