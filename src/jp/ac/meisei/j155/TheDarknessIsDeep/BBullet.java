package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

public class BBullet extends Human{
	static int sx,sy;
	private boolean flag=false;
	private int mbx;
	private int mby;
	BBullet(String file, int x, int y) {
		super("./pic/bullet3.png", x, y);
		sx=x;
		sy=y;
	}
	public void moveBullet3(int time,Graphics g){
		this.paintImg(g);
//		if(!flag){
//			mbx = GuiGameGra.player.x;
//			mby = GuiGameGra.player.y;
//			flag=true;
//		}
//		int sbx = mbx - x ;
//		int sby = mby - y ;
//		if(sbx < 0){
//			x -= 5;
//		}else if(sbx > 0){
//			x += 5;
//		}
//		if(sby < 0){
//			y -= 5;
//		}else if(sby > 0){
//			y += 5;
//		}
		x-=8;
	}
	public void init(){
		this.x=sx;
		this.y=sy;
	}
}