package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet{
	
	private HomeScreen homeScreen;
	private StoryScreen storyScreen;
	private FinalScreen finalScreen;
	private ControllerMain controllerMain;
	
	private int screenOrder;
	

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	
	public void settings() {
		size (1280, 720);
	}
	
	
	public void setup() {
		controllerMain = new ControllerMain(this);
		homeScreen = new HomeScreen(this);
		storyScreen = new StoryScreen(this);
		finalScreen = new FinalScreen(this);
	}
	
	
	public void draw() {
		//background(storyScreen.getImgStoryScreen());
		//background(homeScreen.getImgHomeScreen());
		//background(finalScreen.getImgFinalScreen());
		controllerMain.draw();
	}

}
