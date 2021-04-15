package model;

import processing.core.PApplet;
import processing.core.PImage;

public class MomCat {

	private PApplet app;
	private PImage imgMomCat;
	private PImage imgCatOpacity;
	private int posX;
	private int posY;
	private boolean catDrag;
	
	
	
	public MomCat(PApplet app) {
		this.app = app;
		loadImg();
		catDrag = false;
		posX = 790;
		posY = 0;
	}

	private void loadImg() {
		
		imgMomCat = app.loadImage("images/Cat_Original.png");
		imgCatOpacity = app.loadImage("images/Cat_Opacity.png");
	}


	public void catOriginal(int posX, int posY) {
		app.image(imgMomCat, posX, posY);

		
	}
	
	public void catOpacity() {
		app.image(imgCatOpacity, 790, 0);
		
	}
	
	public void catDrag() {

		if (catDrag) {
			posX = app.mouseX;
			posY = app.mouseY;
			//app.image(imgMomCat, posX, posY);
		}
		
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

	public boolean isCatDrag() {
		return catDrag;
	}

	public void setCatDrag(boolean catDrag) {
		this.catDrag = catDrag;
	}
	
	
	
}
