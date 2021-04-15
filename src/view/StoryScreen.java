package view;

import processing.core.PApplet;
import processing.core.PImage;

public class StoryScreen {

	private PApplet app;
	PImage imgStoryScreen;
	PImage imgCasa;
	PImage imgPuerta;
	PImage imgBosque;

	public StoryScreen(PApplet app) {
		this.app = app;
		loadBackground();
	}
	
	public void loadBackground() {
		
			imgStoryScreen = app.loadImage("images/StoryScreen.png");

			imgCasa = app.loadImage("images/casa.png");

			imgPuerta = app.loadImage("images/puerta.png");

			imgBosque = app.loadImage("images/bosque.png");
		
	}
	
	public boolean clickContinue() {
		if (app.mouseX > 950 && app.mouseX < 1165 && app.mouseY > 519 && app.mouseY < 588) {
			return true;
		}
		return false;
	}
	
	public void doorBackground() {
		
	}

	public void forestBackground() {
		
	}
	
	public PImage getImgStoryScreen() {
		return imgStoryScreen;
	}

	public PImage getImgCasa() {
		return imgCasa;
	}

	public PImage getImgPuerta() {
		return imgPuerta;
	}

	public PImage getImgBosque() {
		return imgBosque;
	}



	
	

}
