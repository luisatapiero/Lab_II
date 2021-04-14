package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Tadpole {
	
	private PApplet app;
	private PImage imgTadpole;
	private PImage imgScaredTadpole;
	private PImage imgRunningTadpole;
	


	public Tadpole(PApplet app) {
		this.app = app;
		
		
	}
	


	public void tadpoleOriginal() {
		imgTadpole = app.loadImage("images/Tadpole_Original.png");
		app.image(imgTadpole, 226, 209);
		
	}
	
	public void tadpoleScared() {
		imgScaredTadpole = app.loadImage("images/Tadpole_Scared.png");
		app.image(imgScaredTadpole, 226, 209);
		
	}
	
	public void tadpoleRunning() {
		imgRunningTadpole = app.loadImage("images/Tadpole_Running.png");
		app.image(imgRunningTadpole, 226, 209);
		
	}

}
