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
		screenOrder = 1;
	}
	
	
	public void draw() {
		controllerMain.draw();
		
		switch (screenOrder) {
		case 1:
			background(homeScreen.getImgHomeScreen());
			//System.out.println(mouseY);
			break;
		case 2:
			background(storyScreen.getImgStoryScreen());		
			break;
		case 3:
			background(storyScreen.getImgCasa());
			break;
		case 4:
			background(storyScreen.getImgPuerta());
			break;
		case 5:
			background(storyScreen.getImgBosque());
			break;
		case 6:
			background(finalScreen.getImgFinalScreen());
			break;

		default:
			break;
		}
	}
	
	@Override
	public void mousePressed() {
		if (homeScreen.clickStart()) {
			screenOrder = 2;
		}
	}





	
}
