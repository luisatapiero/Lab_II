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
		
		public boolean clickReadAgain() {
			if (app.mouseX > 354 && app.mouseX < 634 && app.mouseY > 464 && app.mouseY < 527) {
				return true;
			}
			return false;
		}
		
		public void clickExit() {
			if (app.mouseX > 723 && app.mouseX < 928 && app.mouseY > 464 && app.mouseY < 527) {
				System.out.println("click");
				app.exit();
			}
			
		}

		public PImage getImgFinalScreen() {
			return imgFinalScreen;
		}
}
	