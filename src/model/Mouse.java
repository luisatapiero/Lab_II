package model;

import processing.core.PApplet;

public abstract class Mouse {

	protected PApplet app;
	
	public Mouse(PApplet app) {
		this.app = app;
		
	}
	

	protected abstract void loadImg();
	protected abstract void draw();

}
