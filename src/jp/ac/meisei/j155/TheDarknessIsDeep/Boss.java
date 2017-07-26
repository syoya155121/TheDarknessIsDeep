package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

public class Boss extends Human{
	static int sx,sy;
	Boss(String file, int x, int y) {
		super("./pic/boss.png",x,y);
		sx=x;
		sy=y;
	}

	public void moveBoss(int time,Graphics g){
		//FIXME
		//System.out.println("BOSS");



		this.paintImg(g);
	}
	public void init(){
		this.x=sx;
		this.y=sy;
	}
}
