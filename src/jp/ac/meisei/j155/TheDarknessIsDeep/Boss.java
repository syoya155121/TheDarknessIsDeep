package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;
import java.util.Random;

public class Boss extends Human{
	static int sx,sy;
	static Player player;
	private int count = 0,cn = 0;
	private int ptnx = 0;
	private int ptny = 3;
	private int sbx, sby,memx,memy,mbx,mby;
	private boolean flag=false;
	Random rnd = new Random();
	int ran = rnd.nextInt(50);
	Boss(String file, int x, int y) {
		super("./pic/boss.png",x,y);
		sx=x;
		sy=y;
		setLife(10);
	}

	public void moveBoss(int time,Graphics g){
		//FIXME
		System.out.println("BOSS");
		if(time < 300){
			movepettern1();
			System.out.println(count);
		}
		if(300 <= time && time <= 500){
			ReturnInitPos();
			System.out.println(sbx);
			System.out.println(sbx);
		}
		if(500<time){
			movepettern2();
			System.out.println(mbx);
			System.out.println(mby);
		}
		this.paintImg(g);
	}

	public void ReturnInitPos(){
		sbx = 700 - x;
		sby = 300 - y;
		if(sbx < 0){
			x -= 2;
		}else if(sbx > 0){
			x += 2;
		}
		if(sby < 0){
			y -= 2;
		}else if(sby > 0){
			y += 2;
		}
	}

	public void movepettern1(){
		if(count ==0){
			ptnx = 5;
			cn = 1;
		}else if(count == 30){
			ptnx = -5;
			cn = -1;
		}
		x += ptnx;
		if(y==600){
			ptny = -3;
		}else if(y==100){
			ptny = 3;
		}
		y += ptny;
		count += cn;
	}

	public void movepettern2(){
		if(!flag){
			mbx = GuiGameGra.player.x;
			mby = GuiGameGra.player.y;
			flag=true;
		}
		sbx = mbx - x ;
		sby = mby - y ;
		if(sbx < 0){
			x -= 5;
		}else if(sbx > 0){
			x += 5;
		}
		if(sby < 0){
			y -= 5;
		}else if(sby > 0){
			y += 5;
		}
	}
	public void init(){
		this.x=sx;
		this.y=sy;
		count =0;
		ptnx = 0;
		ptny = 3;
		setLife(10);
	}
}

