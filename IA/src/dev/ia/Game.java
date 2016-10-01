package dev.ia;

import dev.ia.display.Display;
import dev.ia.display.Drawmap;

public class Game {
	private Display display;
	Drawmap d = new Drawmap();
	
	public Game(String title, int width, int height){
		display = new Display(title, width, height);
	}
	
	public void printmap(char map[][],double tempo){
		d.draw(map,tempo);
		display.add(d);
	}
	
}
