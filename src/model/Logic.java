package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	private Tadpole tadpole;
	private Duck duck;
	private MomCat momCat;
	private MrsMouse mrsMouse;
	private FriendMouse friendMouse;
	
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
				//System.out.println(arrayInfo[j]);

			}

		}
		
		
	}
	
	public void draw() {
		
		//duck.draw();
		//momCat.draw();
		//tadpole.draw();
		mrsMouse.draw();
		friendMouse.draw();
	}

}
