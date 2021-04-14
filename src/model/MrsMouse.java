package model;

import processing.core.PApplet;
import processing.core.PImage;

public class MrsMouse extends Mouse {

	private PImage imgMrsMouse;
	private PImage imgMrsDancing;
	private PImage imgMrsMouseGlow;

	public MrsMouse(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		sizeX = 296;
		sizeY = 454;
		loadImg();
	}

	protected void loadImg() {
		imgMrsMouse = app.loadImage("images/MrsMouse_Original.png");

		imgMrsDancing = app.loadImage("images/MrsMouse_Dancing.png");

		imgMrsMouseGlow = app.loadImage("images/MrsMouse_Glow.png");
		
	}

	@Override
	protected void mouseOriginal(int posX, int posY) {
		app.image(imgMrsMouse, posX, posY);

	}

	@Override
	protected void mouseGlowing(int posX, int posY) {
		if (show) {
			app.image(imgMrsMouseGlow, posX, posY,(float) (sizeX*1.3), (float) (sizeY*1.2));
		}else {
			app.image(imgMrsMouseGlow, posX, posY);
		}
		
		show = false;
	}
	

	@Override
	protected void mouseDancing(int posX, int posY) {
		app.image(imgMrsDancing, posX, posY);

	}

}
