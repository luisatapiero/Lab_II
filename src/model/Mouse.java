package model;

import processing.core.PApplet;

public abstract class Mouse {

	protected PApplet app;
	protected int posX;
	protected int posY;
	protected int sizeX;
	protected int sizeY;
	
	public Mouse(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		
	}

	protected abstract void loadImg();
	protected abstract void mouseOriginal(int posX, int posY);
	protected abstract void mouseGlowing(int posX, int posY);
	protected abstract void mouseDancing(int posX, int posY);

}
