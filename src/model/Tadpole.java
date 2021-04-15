package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Tadpole {

	private PApplet app;
	private PImage imgTadpole;
	private PImage imgScaredTadpole;
	private PImage imgRunningTadpole;

	private int posX;
	private int posY;
	private int sizeX;
	private int sizeY;
	private boolean show;

	public Tadpole(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		sizeX = 246;
		sizeY = 380;
		loadImg();
	}

	private void loadImg() {
		imgTadpole = app.loadImage("images/Tadpole_Original.png");
		imgScaredTadpole = app.loadImage("images/Tadpole_Scared.png");
		imgRunningTadpole = app.loadImage("images/Tadpole_Running.png");

	}

	public void tadpoleOriginal(int posX, int posY) {

		app.image(imgTadpole, 226, 209);

	}

	public void tadpoleScared(int posX, int posY) {

		app.image(imgScaredTadpole, posX, posY);

	}

	public void tadpoleRunning(int posX, int posY) {
		
		//posX = 900;
		//posY = 350;
		
		if (show) {
			app.image(imgRunningTadpole, posX, posY, (float) (sizeX * 1.2), (float) (sizeY * 1.2));
		} else {
			app.image(imgRunningTadpole, posX, posY, sizeX, sizeY);

		}
		show = false;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	

}
