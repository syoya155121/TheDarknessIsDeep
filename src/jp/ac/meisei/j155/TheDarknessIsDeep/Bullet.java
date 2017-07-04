package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.*;

public class Bullet extends Human{
	Bullet(){
		
	}
	private int x,y,vx,vy;
//プレーヤー弾　直線　弾=丸　一時的
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(x, y, 5, 5);
	}
}
