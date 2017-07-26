package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

import javax.swing.JPanel;

public class GuiGameGra extends JPanel implements Runnable{
	Graphics g;
	static Player player;
	static Boss boss;
	//Enemy[] enemy = new Enemy[5];
	Thread t;
	Enemy et;
	static int time=0;
	int cnt=0;
	int cnt2=0;
	static int flag=0;

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
//		requestFocus();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000,700);
		g.setColor(Color.white);
		g.drawString(String.valueOf(time), 50, 35);
		g.drawString("time : "+String.valueOf(time/60), 50, 50);
		player.movePlayer(time,g);
		boss.moveBoss(time,g);

		TheDarknessIsDeep.f.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e){
				cnt++;
				if(cnt%(1+cnt2+cnt2%10)==0){
//					debug.println("cnt: "+cnt+" x: " + player.x+" y: "+player.y);
					cnt=0;
					switch(e.getKeyChar()){
					case 'w': player.y-=4; break;
					case 's': player.y+=4; break;
					case 'd': player.x+=4; break;
					case 'a': player.x-=4; break;
					case ' ':
						debug.println("Space!!");
						break;
					case 'e':
						player.x=400;
						player.y=400;
					default: break;
					}
					if(player.x<0) player.x=0;
					if(player.x>900) player.x=900;
					if(player.y<0) player.y=0;
					if(player.y>600) player.y=600;
					cnt2++;
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {

			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
		debug.println("cnt:"+cnt2+" Boss: "+boss.x+":"+boss.y+" Player: "+player.x+":"+player.y+"  B-P: "+(boss.x-player.x)+":"+(boss.y-player.y)+
				"  Flag: "+(boss.x-player.x<100 && boss.x-player.x>-70 && boss.y-player.y<60 && boss.y-player.y>-30));
		time++;
		if(boss.x-player.x<100 && boss.x-player.x>-70 && boss.y-player.y<60 && boss.y-player.y>-30){
			flag=1;
			GuiResult.vUpdate();
			GameState.setState(States.Result);
			MainGui.changePanel(GameState.getState());
		}else{
			repaint();
		}
		try {
			Thread.sleep(16);
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
