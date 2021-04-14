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
	private int numInteraction = 0;

	public Logic(PApplet app) {
		this.app = app;
		storyList = new ArrayList<String>();
		loadTxt();
		duck = new Duck(app);
		momCat = new MomCat(app);
		tadpole = new Tadpole(app);
		mrsMouse = new MrsMouse(0, 682, app);
		friendMouse = new FriendMouse(0, 682, app);
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

		switch (numInteraction) {

		case 0:
			tadpole.tadpoleOriginal();
			friendMouse.mouseOriginal(550, 247);
			mrsMouse.mouseOriginal(775, 247);
			guitar.glowGuitar(236, 440);
			changeSizeGuitar();

			break;

		case 1:

			tadpole.tadpoleOriginal();
			guitar.originalGuitar(236, 440);
			guitar.drawMusic();
			friendMouse.mouseGlowing(550, 247);
			mrsMouse.mouseGlowing(775, 247);
			System.out.println("x"+mrsMouse.getPosX());
			System.out.println("y"+mrsMouse.getPosY());
			changeSizeMouse();
			
			break;

		case 2:

			break;

		default:
			break;
		}
	}

	private void changeSizeGuitar() {
		if (app.mouseX < guitar.getPosX() + guitar.getSizeX() && app.mouseX > guitar.getPosX() - guitar.getSizeX()
				&& app.mouseY < guitar.getPosY() + guitar.getSizeY()
				&& app.mouseY > guitar.getPosY() - guitar.getSizeY()) {
			guitar.setShow(true);

		}

	}

	public void clickGuitar() {
		if (app.mouseX < guitar.getPosX() + guitar.getSizeX() && app.mouseX > guitar.getPosX() - guitar.getSizeX()
				&& app.mouseY < guitar.getPosY() + guitar.getSizeY()
				&& app.mouseY > guitar.getPosY() - guitar.getSizeY()) {
			numInteraction = 1;

		}

	}

	private void changeSizeMouse() {

		if (app.mouseX < 1030 && app.mouseX > 294 && app.mouseY < 682 && app.mouseY > 294) {
			mrsMouse.setShow(true);
			friendMouse.setShow(true);

		}

	}

	public void clickMouses() {
		if (app.mouseX < 1030 && app.mouseX > 294 && app.mouseY < 682 && app.mouseY > 294) {
			numInteraction = 2;

		}

	}

}
