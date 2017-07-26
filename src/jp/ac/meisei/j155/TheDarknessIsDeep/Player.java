package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

public class Player extends Human{
	static int sx,sy;
	Player(String file, int x, int y) {
		super("./pic/player.png",x,y);
		sx=x;
		sy=y;
	}
	public void movePlayer(int time,Graphics g){
		this.paintImg(g);
	}
	public void init(){
		this.x=sx;
		this.y=sy;
	}
}
