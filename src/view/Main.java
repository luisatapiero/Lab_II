package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet{
	
	private HomeScreen homeScreen;
	private StoryScreen storyScreen;
	private FinalScreen finalScreen;
	
	private ControllerMain controllerMain;
	

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	
	public void settings() {
		size (1280, 720);
	}
	
	
	public void setup() {
		controllerMain = new ControllerMain(this);
		homeScreen = new HomeScreen();
		storyScreen = new StoryScreen();
		finalScreen = new FinalScreen();
	}
	
	
	public void draw() {
		
	}

}
