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
	//Enemy[] enemy = new Enemy[5];
	Thread t;
	Enemy et;
	int time=0;

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
		g.setColor(Color.white);
		g.drawString(String.valueOf(time), 50, 50);
		TheDarknessIsDeep.p.paintImg(g);
		time++;
		repaint();

		TheDarknessIsDeep.f.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				//debug.println("Pressed " + e.getKeyChar());
				if(e.getID() == KeyEvent.KEY_PRESSED){
					switch(e.getKeyChar()){
					case 'w':
						TheDarknessIsDeep.p.Up();
						break;
					case 's':
						TheDarknessIsDeep.p.Down();
						break;
					case 'd':
						TheDarknessIsDeep.p.Right();
						break;
					case 'a':
						TheDarknessIsDeep.p.Left();
						break;
					case ' ':
						debug.println("Space!!");
						break;
					case 'e':
						TheDarknessIsDeep.p.x=400;
						TheDarknessIsDeep.p.y=400;
					default:
						break;
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO 自動生成されたメソッド・スタブ

			}
		});

		try {
			Thread.sleep(33);
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
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
