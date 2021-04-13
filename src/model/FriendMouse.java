package model;

import processing.core.PApplet;
import processing.core.PImage;

public class FriendMouse extends Mouse{
	
	private PImage imgFriend;
	private PImage imgFriendDancing;
	private PImage imgFriendGlow;

	public FriendMouse(PApplet app) {
		super(app);
	}


	protected void loadImg() {
		imgFriend = app.loadImage("images/FriendMouse_Original.png");
		app.image(imgFriend, 300, 0);
		imgFriendDancing = app.loadImage("images/FriendMouse_Dancing.png");
		app.image(imgFriendDancing, 500, 100);
		imgFriendGlow = app.loadImage("images/FriendMouse_Glow.png");
		app.image(imgFriendGlow, 200, 0);
		
	}


	protected void draw() {
		loadImg();
		
	}

}
