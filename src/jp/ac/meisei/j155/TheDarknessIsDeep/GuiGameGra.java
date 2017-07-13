package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GuiGameGra extends JPanel implements KeyListener,Runnable{
	Graphics g;
	Player player;
	Enemy[] enemy = new Enemy[5];
	Thread t;

	GuiGameGra(){
		setBounds(0,0,1000,700);
		setLayout(null);
		setBackground(new Color(0, 0, 153));
		setVisible(true);
		player=new Player(".pic/player.png", 50, 300);
		enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
		debug.println("0 Player x: "+player.getX()+" y: "+player.getY());
		addKeyListener(this);
		t = new Thread();
		t.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000,700);
		player.paintImg(g);
		debug.println("1 Player x: "+player.getX()+" y: "+player.getY());
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
			repaint();

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
