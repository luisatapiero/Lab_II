package model;

import processing.core.PApplet;
import processing.core.PImage;

public class MrsMouse extends Mouse{
	
	private PImage imgMrsMouse;
	private PImage imgMrsDancing;
	private PImage imgMrsMouseGlow;

	public MrsMouse(PApplet app) {
		super(app);
	}

	protected void loadImg() {
		imgMrsMouse = app.loadImage("images/MrsMouse_Original.png");
		app.image(imgMrsMouse, 0, 0);
		imgMrsDancing = app.loadImage("images/MrsMouse_Dancing.png");
		app.image(imgMrsDancing, 100, 100);
		imgMrsMouseGlow = app.loadImage("images/MrsMouse_Glow.png");
		app.image(imgMrsMouseGlow, 0, 0);
		
	}


	public void draw() {
		loadImg();
		
	}
	
	

}
