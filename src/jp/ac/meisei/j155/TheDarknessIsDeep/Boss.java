package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

public class Boss extends Human{
	Boss(String file, int x, int y) {
		super("./pic/boss.png",x,y);
	}

	public void moveBoss(int time,Graphics g){
		//FIXME
		if(time<1000){

		}
		System.out.println("BOSS");



		this.paintImg(g);
	}

	private void movepettern1(){
		int ptnx = 3;
		int ptny = 3;

		x+=ptnx;
		if(x==600){

		}

	}
}

