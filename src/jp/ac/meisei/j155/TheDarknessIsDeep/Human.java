package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Human {
	int x,y;
	int vx,vy;
	int hitX,hitY;
	private int life;
	private int bomb;
	private Image img;
	private boolean show;
	private int shoot;
	private final int shootMax=30;
	private final int v = 1;

	Human(String file,int x,int y){
		try {
			img = ImageIO.read(new File(file));
		} catch (Exception e) {
			System.out.println("error Picture");
		}
		this.x=x;
		this.y=y;
		this.hitX=x/2;
		this.hitY=y/2;
		life=3;
		bomb=3;
		show=false;

	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	//移動系
	public void Left(){
		x-=v;
	}
	public void Right(){
		x+=v;
	}
	public void Up(){
		y-=v;
	}
	public void Down(){
		y+=v;
	}

	//img系
	public Image getImg(){
		return img;
	}

	//Life系
	public int getLife(){
		return life;
	}
	public void addLife(){
		life++;
	}
	public void subLife(){
		life--;
	}

	//ボム系
	public int getBomb(){
		return bomb;
	}
	public void addBomb(){
		bomb++;
	}
	public void subBomb(){
		bomb--;
	}

	//表示系  falseならゲーム上から消える予定
	public boolean getShow(){
		return show;
	}
	public void setShow(){
		show=true;
	}
	public void HiddenShow(){
		show=false;
	}

	public void paintImg(Graphics g){
		g.drawImage(img, x, y,null);
	}


}

//test