package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Tadpole {
	
	private PApplet app;
	private PImage imgTadpole;
	private PImage imgScaredTadpole;
	private PImage imgRunningTadpole;
	
	private Hat hat;
	private Guitar guitar;

	public Tadpole(PApplet app) {
		this.app = app;
		
		hat = new Hat(app);
		guitar = new Guitar(app);
	}
	
	private void loadImg() {
		imgTadpole = app.loadImage("images/Tadpole_Original.png");
		app.image(imgTadpole, 0, 0);
		imgScaredTadpole = app.loadImage("images/Tadpole_Scared.png");
		app.image(imgScaredTadpole, 100, 100);
		imgRunningTadpole = app.loadImage("images/Tadpole_Running.png");
		app.image(imgRunningTadpole, 0, 0);
	}


	public void draw() {
		loadImg();
		hat.draw();
		guitar.draw();
		
	}

}
