package Pagrindas;
import Renders.GameRender;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

 public class Room {

	private ArrayList<Rectangle> tubes;
	private int time;
	private int currentTime = 0;
	private int height1 = 0;
	private Random random;
	private GameRender gameRender;

	Room(int time) {
		tubes = new ArrayList<>();
		this.time = time;
		random = new Random();
	}

	public int getHeight1() {
		return height1;
	}

	public void setHeight1(int height1) {
		this.height1 = height1;
	}

	void update() {
		currentTime++;
		if(currentTime == time) {
			currentTime = 0;
			int width = 20;
			height1 = random.nextInt(Flappy.HEIGHT/2);
			int SPACE_TUBES = 96;
			int y2 = height1 + SPACE_TUBES;
			int height2 = Flappy.HEIGHT - y2;
			int WIDTH_TUBES = 32;
			tubes.add(new Rectangle(Flappy.WIDTH,0, WIDTH_TUBES,height1));
			tubes.add(new Rectangle(Flappy.WIDTH,y2, WIDTH_TUBES,height2));
		}
		for(int i = 0 ; i < tubes.size();i++) {
			Rectangle rect = tubes.get(i);
			int speed = 5;
			rect.x -= speed;
			if(rect.x+rect.width <= 0) {
				tubes.remove(i--);
				Flappy.setScore( Flappy.getScore() + 0.5);
			}
		}
	}

	public ArrayList<Rectangle> getTubes() {
		return tubes;
	}

}
