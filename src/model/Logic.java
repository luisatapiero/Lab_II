package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	private Tadpole tadpole;
	private Duck duck;
	private MomCat momCat;
	private MrsMouse mrsMouse;
	private FriendMouse friendMouse;
	private Hat hat;
	private Guitar guitar;

	private PApplet app;
	private String[] story;
	private ArrayList<String> storyList;

	public Logic(PApplet app) {
		this.app = app;
		storyList = new ArrayList<String>();
		loadTxt();
		duck = new Duck(app);
		momCat = new MomCat(app);
		tadpole = new Tadpole(app);
		mrsMouse = new MrsMouse(app);
		friendMouse = new FriendMouse(app);
		hat = new Hat(app);
		guitar = new Guitar(236, 419, app);
	}

	private void loadTxt() {
		story = app.loadStrings("./TXT/story.txt");
		storyToWords();

	}

	private void storyToWords() {
		for (int i = 0; i < story.length; i++) {
			String[] arrayInfo = story[i].split(" ");
			for (int j = 0; j < arrayInfo.length; j++) {
				storyList.add(arrayInfo[j]);
			}

		}

	}

	public void draw() {

		// duck.draw();
		// momCat.draw();
		// tadpole.draw();
		// mrsMouse.draw();
		// friendMouse.draw();
	}

	public void firstScreen() {
		int numInteraction = 0;
		switch (numInteraction) {

		case 0:
			tadpole.tadpoleOriginal();
			guitar.glowGuitar(236, 440);
			
			if (app.mouseX < guitar.getPosX() + guitar.getSizeX() && app.mouseX > guitar.getPosX() - guitar.getSizeX() 
			&& app.mouseY < guitar.getPosY() + guitar.getSizeY() && app.mouseY > guitar.getPosY() - guitar.getSizeY()) {
				guitar.setShow(true);
			
				}
			
			
				break;

		case 1:

			break;

		case 2:

			break;

		default:
			break;
		}
	}

}
