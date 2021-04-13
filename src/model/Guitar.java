package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Guitar {
	
	private PApplet app;
	private PImage imgGuitar;
	private PImage imgGuitarGlow;

	public Guitar(PApplet app) {
		this.app = app;
	}
	
	private void loadImg() {
		imgGuitar = app.loadImage("images/Guitar.png");
		app.image(imgGuitar, 200, 200);
		imgGuitarGlow = app.loadImage("images/Guitar_Glow.png");
		app.image(imgGuitarGlow, 100, 100);
	}


	public void draw() {
		loadImg();
		
	}

}
