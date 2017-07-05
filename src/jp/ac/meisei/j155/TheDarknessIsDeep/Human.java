package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Human {
	private Point xy;
	private Point Vxy;
	private int life;
	private int bomb;
	private Image img;
	private boolean show;
	private int shoot;
	private final int shootMax=30;

	Human(String file,int x,int y){
		try {
			img = ImageIO.read(new File(file));
		} catch (Exception e) {
			System.out.println("error Picture");
		}
		xy=new Point(x,y);
		life=3;
		bomb=3;
		show=false;

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
}

//test