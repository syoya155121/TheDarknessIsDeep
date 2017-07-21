package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

import javax.swing.JPanel;

public class GuiGameGra extends JPanel implements Runnable{
	Graphics g;
	Player player;
	Boss boss;
	//Enemy[] enemy = new Enemy[5];
	Thread t;
	Enemy et;
	int time=0;

	GuiGameGra(){
		setBounds(0,0,1000,700);
		setLayout(null);
		setBackground(new Color(0, 0, 153));
		setVisible(true);
		player=new Player(".pic/player.png", 50, 300);
		boss=new Boss(".pic/boss.png", 700, 300);
		enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
		debug.println("0 Player x: "+player.getX()+" y: "+player.getY());
		et = new Enemy();
		t = new Thread(et);
		t.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000,700);
		g.setColor(Color.white);
		g.drawString(String.valueOf(time), 50, 50);
		player.movePlayer(time,g);
		boss.moveBoss(time,g);

		TheDarknessIsDeep.f.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e){
				debug.println("x: " + player.x+" y: "+player.y);
				switch(e.getKeyChar()){
				case 'w': player.y-=1; break;
				case 's': player.y+=1; break;
				case 'd': player.x+=1; break;
				case 'a': player.x-=1; break;
				case ' ':
					debug.println("Space!!");
					break;
				case 'e':
					player.x=400;
					player.y=400;
				default: break;
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {

			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});


		time++;
		repaint();
		try {
			Thread.sleep(33);

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
