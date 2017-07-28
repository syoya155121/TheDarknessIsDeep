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
	private boolean flag=false,flag1=true,flag2=false,flag3=false,flag4=false,flag5=false,flag6=false,flag7=false,flag8=false;
	private int i=1;
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
		//movepettern1();
		if(flag1){
			movepettern1();
			if(y>=600){
				flag1=false;
				flag2=true;
			}
		}
		if(flag2){
			ReturnInitPos();
			if(295<y&&305>y&&x>699){
				flag2 = false;
				flag3 = true;
			}
		}
		if(flag3){	
			movepettern2();
			if(mbx==x||mby==y){
				flag3=false;
				flag4=true;
			}
		}
		if(flag4){
			ReturnInitPos();
			if(295<y&&305>y&&x>699){
				flag4 = false;
				flag5 = true;
			}
		}
		if(flag5){
			movepettern1();
			if(y<100){
				flag5=false;
				flag6=true;
			}
		}
		if(flag6){
			ReturnInitPos();
			if(295<y&&305>y&&x>699){
				flag6 = false;
				flag7 = true;
			}
		}
		if(flag7){
			movepettern2();
			if(mbx==x||mby==y){
				flag7=false;
				flag8=true;
			}
		}
		if(flag8){
			ReturnInitPos();
			if(295<y&&305>y&&x>699){
				flag8 = false;
				flag1 = true;
			}
		}
		this.paintImg(g);
	}

	public void ReturnInitPos(){
		sbx = 700 - x;
		sby = 300 - y;
		if(sbx < 0){
			x -= 7;
		}else if(sbx > 0){
			x += 7;
		}
		if(sby < 0){
			y -= 5;
		}else if(sby > 0){
			y += 5;
		}
		flag=false;
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
		if(y>=600){
			ptny = -3;
		}
		if(y<=100){
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
			x -= 10;
		}else if(sbx > 0){
			x += 10;
		}
		if(sby < 0){
			y -= 10;
		}else if(sby > 0){
			y += 10;
		}
	}
	public void init(){
		this.x=sx;
		this.y=sy;
		count =0;
		ptnx = 0;
		ptny = 3;
		flag=false;
		flag1=true;
		flag2=false;
		flag3=false;
		flag4=false;
		setLife(10);
	}
}

