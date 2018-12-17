package Pagrindas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Bird extends Rectangle{
	
	private int speed = 4;
	boolean isPressed = false;
	private int x;
	private int y;
	private ArrayList<Rectangle> tubes;


	public ArrayList<Rectangle> getTubes() {
		return tubes;
	}

	Bird(int x, int y, ArrayList<Rectangle> tubes) {
		setBounds(x,y,32,32);
		this.x= x;
		this.y= y;
		this.tubes = tubes;
	}

	void update() {
		if(isPressed) {
			y -= speed;
		}else {
			y+=speed;
		}
		for(int i = 0;i < tubes.size();i++) {
			if(this.intersects(tubes.get(i))) {
				Flappy.room = new Room(80);
				Flappy.setScore(0);
				tubes = Flappy.room.getTubes();
				y = Flappy.HEIGHT/2;
			}
		}
		if (y >= Flappy.HEIGHT) {
			Flappy.room = new Room(80);
			tubes = Flappy.room.getTubes();
			Flappy.setScore(0);
			y = Flappy.HEIGHT/2;
		}
	}

	public int getBirdX() {
		return x;
	}

	public void setBirdX(int x) {
		this.x = x;
	}

	public int getBirdY() {
		return y;
	}

	public void setBirdY(int y) {
		this.y = y;
	}
}