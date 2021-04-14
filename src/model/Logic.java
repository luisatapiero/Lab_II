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
	PrintWriter newText;

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
			changeSizeMouse();

			break;

		case 2:
			tadpole.tadpoleOriginal();
			guitar.originalGuitar(236, 440);
			guitar.drawMusic();
			friendMouse.mouseDancing(550, 247);
			mrsMouse.mouseDancing(775, 247);

			break;

		case 3:
			System.out.println("por fin sirve");
			friendMouse.mouseDancing(550, 247);
			mrsMouse.mouseDancing(775, 247);
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

		if (app.mouseX < 1030 && app.mouseX > 660 && app.mouseY < 682 && app.mouseY > 294) {
			mrsMouse.setShow(true);
			friendMouse.setShow(true);
			System.out.println(app.mouseX);

		}

	}

	public void clickMouses() {
		if (numInteraction == 2) {
			if (app.mouseX < 1030 && app.mouseX > 294 && app.mouseY < 682 && app.mouseY > 294) {
				// numInteraction = 2;
				System.out.println(numInteraction);
				numInteraction = 2;
			}

		}

	}

	public void saveText() {
		newText = app.createWriter("./TXT/newStory.txt");

		for (int i = 0; i < storyList.size(); i++) {
			if (storyList.get(i).equals("music") || storyList.get(i).equals("dancing") || storyList.get(i).equals("Cat")
					|| storyList.get(i).equals("Rinrin") || storyList.get(i).equals("hat")) {
				newText.println(storyList.get(i).toUpperCase());
			} else {
				newText.println(storyList.get(i));

				break;
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

}
