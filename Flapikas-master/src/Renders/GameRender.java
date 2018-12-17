package Renders;

import Pagrindas.Flappy;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameRender extends Canvas {


	public void render() {
		
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, Flappy.WIDTH, Flappy.HEIGHT);
		TubesRender.render(g);
		BirdRender.render(g);
		g.setColor(Color.white);
		g.drawString("Score: "+ (int) Flappy.getScore(), 10, 20);
		g.dispose();
		bs.show();
		}

}
