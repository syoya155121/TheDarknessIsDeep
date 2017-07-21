package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

public class Player extends Human{
	Player(String file, int x, int y) {
		super("./pic/player.png",x,y);
	}
	public void movePlayer(int time,Graphics g){
		this.paintImg(g);
	}
}
