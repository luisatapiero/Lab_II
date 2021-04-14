package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Guitar {

	private PApplet app;
	private PImage imgGuitar;
	private PImage imgGuitarGlow;

	private int posX;
	private int posY;
	private int sizeX;
	private int sizeY;
	private boolean show;

	public Guitar(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;

		sizeX = 329;
		sizeY = 156;
		show = false;
		loadImg();
	}

	private void loadImg() {
		imgGuitarGlow = app.loadImage("images/Guitar_Glow.png");
		imgGuitar = app.loadImage("images/Guitar.png");
	}

	public void glowGuitar(int posX, int posY) {

		if (show) {
			app.image(imgGuitarGlow, posX, posY, (float) (sizeX*1.2), (float) (sizeY*1.2));
		}else {
			app.image(imgGuitarGlow, posX, posY, sizeX, sizeY);
		}
		show = false;
	}

	public void originalGuitar(int posX, int posY) {

		if (show) {
			app.image(imgGuitar, posX, posY);
		}
		
	}
 
	/*public void resizeImg(int posX, int posY) {
		show = false;
		app.image(imgGuitar, posX, posY,sizeX, sizeY);
		app.scale((float) 20);
	}*/

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

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
