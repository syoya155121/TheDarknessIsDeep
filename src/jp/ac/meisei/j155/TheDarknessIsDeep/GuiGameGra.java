package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

import javax.swing.JPanel;

public class GuiGameGra extends JPanel implements Runnable{
	Graphics g;
	//static Player player;
	Enemy[] enemy = new Enemy[5];
	Thread t;
	int vx=4,vy=4;
	Enemy et;

	GuiGameGra(){
		setBounds(0,0,1000,700);
		setLayout(null);
		setBackground(new Color(0, 0, 153));
		setVisible(true);
		//player=new Player(".pic/player.png", 50, 300);
		enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
		debug.println("0 Player x: "+TheDarknessIsDeep.p.getX()+" y: "+TheDarknessIsDeep.p.getY());
		et = new Enemy();
		t = new Thread(et);
		t.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000,700);
		TheDarknessIsDeep.p.paintImg(g);
		//変更箇所
		int x = TheDarknessIsDeep.p.getX();
		int y = TheDarknessIsDeep.p.getY();
//		x+=vx;
//		y+=vy;
//		TheDarknessIsDeep.p.x=x;
//		TheDarknessIsDeep.p.y=y;

		debug.println("1 Player x: "+TheDarknessIsDeep.p.getX()+" y: "+TheDarknessIsDeep.p.getY());
		repaint();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//描画するための変更
	}

	public void update(Graphics g){
		debug.println("2 Player x: "+TheDarknessIsDeep.p.getX()+" y: "+TheDarknessIsDeep.p.getY());
		paint(g);
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
