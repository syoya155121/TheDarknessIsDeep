package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

public class Boss extends Human{
	Boss(String file, int x, int y) {
		super("./pic/boss.png",x,y);
	}

	public void moveBoss(int time,Graphics g){
		this.paintImg(g);
	}
}
