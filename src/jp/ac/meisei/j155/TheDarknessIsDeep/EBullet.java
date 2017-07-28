package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

public class EBullet extends Human{
	static int sx,sy;
	EBullet(String file, int x, int y) {
		super("./pic/bullet2.png", x, y);
		sx=x;
		sy=y;
	}
	public void moveBullet2(int time,Graphics g){
		this.paintImg(g);
		x-=5;
	}
	public void init(){
		this.x=sx;
		this.y=sy;
	}
}

