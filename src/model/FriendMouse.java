package model;

import processing.core.PApplet;
import processing.core.PImage;

public class FriendMouse extends Mouse {

	private PImage imgFriend;
	private PImage imgFriendDancing;
	private PImage imgFriendGlow;

	public FriendMouse(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		sizeX = 296;
		sizeY = 454;
		loadImg();
	}

	protected void loadImg() {

		imgFriend = app.loadImage("images/FriendMouse_Original.png");

		imgFriendDancing = app.loadImage("images/FriendMouse_Dancing.png");

		imgFriendGlow = app.loadImage("images/FriendMouse_Glow.png");

	}

	@Override
	protected void mouseOriginal(int posX, int posY) {
		app.image(imgFriend, posX, posY);

	}

	@Override
	protected void mouseGlowing(int posX, int posY) {
			if (show) {
				app.image(imgFriendGlow, posX, posY,(float) (sizeX*1.3), (float) (sizeY*1.2));
			}else {
				app.image(imgFriendGlow, posX, posY);
			}
			
			show = false;
		}
		

	@Override
	protected void mouseDancing(int posX, int posY) {
		app.image(imgFriendDancing, posX, posY);

	}

}
