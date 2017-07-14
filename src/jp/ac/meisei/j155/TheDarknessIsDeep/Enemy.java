package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Graphics;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class Enemy implements Runnable{
	private static final States Game = null;
	Human[] enemy = new Human[5];
	Graphics g;

	public Enemy(){
		enemy[0] = new Human(".pic/enemy1.png",800,100);
		enemy[1] = new Human(".pic/enemy1.png",800,200);
		enemy[2] = new Human(".pic/enemy1.png",800,300);
		enemy[3] = new Human(".pic/enemy1.png",800,400);
		enemy[4] = new Human(".pic/enemy1.png",800,500);
	}
	public void paint(Graphics g){
		for(int i=0;i<5;i++){
			enemy[i].paintImg(g);
		}
	}

	public void run(){
		while(GameState.getState() == Game){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("エマージェンシー！！");
		}
	}
}