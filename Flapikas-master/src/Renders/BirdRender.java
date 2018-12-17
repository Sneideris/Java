package Renders;

import Pagrindas.Bird;
import Pagrindas.Room;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class BirdRender {
	private Room room;
	private int x;
	private int y;
	private Graphics g;

	public BirdRender(Room room, int x, int y) {
	this.room = room;
	this.x= x;
	this.y= y;
	}

	void render(Graphics g) {
		this.g = g;
		int width = 20;
		int height = room.getHeight1();
		g.setColor(Color.green);
		g.fillOval(x, y, width, height);
	}
}
