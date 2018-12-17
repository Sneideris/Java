package Renders;

import Pagrindas.Room;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class TubesRender {

	Room room;

	 void render(Graphics g) {
		g.setColor(Color.red);
		for(int i = 0; i < room.getTubes().size(); i++) {
			Rectangle rect = room.getTubes().get(i);
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}
	}

}
