package view;

import processing.core.PApplet;
import processing.core.PImage;

public class StoryScreen {

	private PApplet app;
	PImage imgStoryScreen;
	PImage imgCasa;
	PImage imgPuerta;
	PImage imgBosque;
	private int order;

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
