package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

import javax.swing.JPanel;

public class GuiGameGra extends JPanel implements KeyListener,Runnable{
	Graphics g;
	Player player;
	Enemy[] enemy = new Enemy[5];
	Thread t;
	int vx=4,vy=4;
	Enemy et;
	

	GuiGameGra(){
		setBounds(0,0,1000,700);
		setLayout(null);
		setBackground(new Color(0, 0, 153));
		setVisible(true);
		player=new Player(".pic/player.png", 50, 300);
		enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
		debug.println("0 Player x: "+player.getX()+" y: "+player.getY());
		addKeyListener(this);
		et = new Enemy();
		t = new Thread(et);
		t.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000,700);
		player.paintImg(g);
		//変更箇所
		repaint();
		int x = player.getX();
		int y = player.getY();
		x+=vx;
		y+=vy;
		player.x=x;
		player.y=y;
		debug.println("1 Player x: "+player.getX()+" y: "+player.getY());
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//描画するための変更
	}

	public void update(Graphics g){
		debug.println("2 Player x: "+player.getX()+" y: "+player.getY());
		paint(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		debug.println("5 Player x: "+player.getX()+" y: "+player.getY());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		debug.println("3 Player x: "+player.getX()+" y: "+player.getY());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		debug.println("4 Player x: "+player.getX()+" y: "+player.getY());
	}

	@Override
	public void run() {
		while(true){
			debug.println("9 Player x: "+player.getX()+" y: "+player.getY());
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
