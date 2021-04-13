package view;

import processing.core.PApplet;
import processing.core.PImage;

public class FinalScreen {
		
		private PApplet app;
		PImage imgFinalScreen;
	
		public FinalScreen(PApplet app) {
			this.app = app;
			loadBackground();
		}
		
		public void loadBackground() {
			imgFinalScreen = app.loadImage("images/FinalScreen.png");
		}

		public PImage getImgFinalScreen() {
			return imgFinalScreen;
		}
}
	