package model;

import processing.core.PApplet;

public abstract class Mouse {

	protected PApplet app;
	protected int posX;
	protected int posY;
	protected int sizeX;
	protected int sizeY;
	protected boolean show;
	
	public Mouse(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		
	}

	protected abstract void loadImg();
	protected abstract void mouseOriginal(int posX, int posY);
	protected abstract void mouseGlowing(int posX, int posY);
	protected abstract void mouseDancing(int posX, int posY);

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
