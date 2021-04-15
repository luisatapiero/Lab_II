package model;

import java.io.PrintWriter;
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
	private int num5 = 1;
	private int num2 = 1;
	PrintWriter newText;

	private boolean guitarClickable;
	private boolean mousesClickable;
	private boolean tadpoleClickable;
	private boolean catDragged;

	public Logic(PApplet app) {
		this.app = app;
		storyList = new ArrayList<String>();
		loadTxt();

		duck = new Duck(app);
		momCat = new MomCat(app);
		tadpole = new Tadpole(226, 209, app);
		mrsMouse = new MrsMouse(0, 682, app);
		friendMouse = new FriendMouse(0, 682, app);
		hat = new Hat(app);
		guitar = new Guitar(236, 419, app);
		guitarClickable = true;
		mousesClickable = false;
		tadpoleClickable = false;

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

	public void firstScreen() {

		switch (numInteraction) {

		case 0:
			tadpole.tadpoleOriginal(226, 209);
			friendMouse.mouseOriginal(550, 247);
			mrsMouse.mouseOriginal(775, 247);
			guitar.glowGuitar(236, 440);
			changeSizeGuitar();

			break;

		case 1:
			guitarClickable = false;
			mousesClickable = true;
			tadpole.tadpoleOriginal(226, 209);
			guitar.originalGuitar(236, 440);
			guitar.drawMusic();
			friendMouse.mouseGlowing(550, 247);
			mrsMouse.mouseGlowing(775, 247);
			changeSizeMouse();

			break;

		case 2:

			if (num2 == 1) {
				guitarClickable = false;
				mousesClickable = false;
				// momCat.setCatDrag(true);
				tadpole.tadpoleOriginal(226, 209);
				guitar.originalGuitar(236, 440);
				guitar.drawMusic();
				friendMouse.mouseDancing(550, 247);
				mrsMouse.mouseDancing(775, 247);
				momCat.catOriginal(920, 0);
				momCat.catOpacity();
				System.out.println(momCat.isCatDrag());
				if (momCat.isCatDrag()) {
					momCat.setPosX(app.mouseX);
					momCat.setPosY(app.mouseY);
				}
			}

			if (num2 == 2) {
				tadpole.tadpoleOriginal(226, 209);
				guitar.originalGuitar(236, 440);
				guitar.drawMusic();
				friendMouse.mouseDancing(550, 247);
				mrsMouse.mouseDancing(775, 247);
				momCat.catOriginal(790, 0);
			}

			break;

		case 3:

			break;

		default:
			break;
		}
	}

	public void fifthScreen() {
		tadpoleClickable = true;
		if (num5 == 1) {
			tadpole.tadpoleRunning(900, 350);
			duck.duckShow();
			changeSizeTadpole();
		} else if (num5 == 2) {
			tadpole.tadpoleRunning(500, 200);
			duck.duckShow();
			num5 = 3;
		} else if (num5 == 3) {
			tadpole.tadpoleRunning(350, 300);
			duck.duckShow();
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
			if (guitarClickable) {
				numInteraction = 1;
			}

		}

	}

	private void changeSizeMouse() {

		if (app.mouseX < 1030 && app.mouseX > 660 && app.mouseY < 682 && app.mouseY > 294) {
			mrsMouse.setShow(true);
			friendMouse.setShow(true);

		}

	}

	public void clickMouses() {

		if (app.mouseX < 1030 && app.mouseX > 294 && app.mouseY < 682 && app.mouseY > 294) {
			if (mousesClickable && guitarClickable == false) {
				numInteraction = 2;
			}

		}

	}

	public void dragCat() {

		if (app.mouseX < 1200 && app.mouseX > 1000 && app.mouseY < 720 && app.mouseY > 0) {
			if (guitarClickable == false && mousesClickable == false) {
				momCat.setCatDrag(true);
				momCat.catDrag();
				System.out.println("drag");

				num2 = 2;
			}

		} else {
			momCat.setCatDrag(false);
		}

	}

	private void changeSizeTadpole() {

		if (app.mouseX < 1105 && app.mouseX > 927 && app.mouseY < 640 && app.mouseY > 406) {
			tadpole.setShow(true);

		}

	}

	public void clickTadpole() {

		if (app.mouseX < 1105 && app.mouseX > 927 && app.mouseY < 640 && app.mouseY > 406) {
			if (tadpoleClickable) {
				num5 = 2;
			}

		}

	}

	public void saveText() {
		newText = app.createWriter("./TXT/newStory.txt");

		for (int i = 0; i < storyList.size(); i++) {
			if (storyList.get(i).equals("music") || storyList.get(i).equals("dancing,")
					|| storyList.get(i).equals("Cat") || storyList.get(i).equals("Rinrin")
					|| storyList.get(i).equals("hat")) {
				newText.println(storyList.get(i).toUpperCase());
			} else {
				newText.println(storyList.get(i));

			}
		}
		newText.flush();
		newText.close();
	}

	public int getNumInteraction() {
		return numInteraction;
	}

	public void setNumInteraction(int numInteraction) {
		this.numInteraction = numInteraction;
	}

	public boolean isCatDragged() {
		return catDragged;
	}

	public void setCatDragged(boolean catDragged) {
		this.catDragged = catDragged;
	}

}
