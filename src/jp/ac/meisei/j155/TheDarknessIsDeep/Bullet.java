package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.*;

public class Bullet extends Human{
	static int sx,sy;
	Bullet(String file, int x, int y) {
		super("./pic/bullet1.png", x, y);
		sx=x;
		sy=y;
	}
	public void moveBullet(int time,Graphics g){
		this.paintImg(g);
		x+=5;
	}
	public void init(){
		this.x=sx;
		this.y=sy;
	}
//	Human[] bullet = new Human[5];
//	void pbullet(){
//		bullet[0] = new Human(".pic/bullet1.png",50,100);//プレーヤー弾
//	}
//	void ebullet1(){
//		bullet[1] = new Human(".pic/bullet2.png",800,200);//敵弾1
//	}
//	void ebullet2(){
//		bullet[2] = new Human(".pic/bullet3.png",800,400);//敵弾2
//	}
}




