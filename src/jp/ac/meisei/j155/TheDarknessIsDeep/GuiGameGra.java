package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

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
	int cnt3=0;
	int tmp=0;

	static Vector<Bullet> playerBullets = new Vector<Bullet>();
	static Vector<EBullet> enemyBullets = new Vector<EBullet>();
	static Vector<BBullet> bossBullets = new Vector<BBullet>();

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
		int i=0;

		int j=0;
		int tmp=0;

		if(time%300==149){
			for(int k=0;k<5;k++){
				enemyBullets.add(new EBullet(".pic/bullet2.png",1000,tmp));
				tmp+=150;
			}
			tmp=0;
		}
		if(time%300==299){
			tmp=75;
			for(int k=0;k<5;k++){
				enemyBullets.add(new EBullet(".pic/bullet2.png",1000,tmp));
				tmp+=150;
			}
			tmp=0;
		}
		if(time%60==0){
			bossBullets.add(new BBullet(".pic/bullet3.png",boss.x,boss.y));
		}
		while( tmp<bossBullets.size()){
			BBullet b3 = bossBullets.get(tmp);
			int hit3=0;
			b3.moveBullet3(time,g);
			if(b3.x-player.x<100 && b3.x-player.x>-70 && b3.y-player.y<60 && b3.y-player.y>-30){
				flag=1;
				playerBullets.clear();
				enemyBullets.clear();
				bossBullets.clear();
				GuiResult.vUpdate();
				GameState.setState(States.Result);
				MainGui.changePanel(GameState.getState());
				break;
			}
			if(hit3>0 || b3.x<0){
				bossBullets.remove(i);
			}else{
				tmp++;
			}
		}

		while( j<enemyBullets.size()){
			EBullet b2 = enemyBullets.get(j);
			int hit2=0;
			b2.moveBullet2(time,g);
			if(b2.x-player.x<100 && b2.x-player.x>-70 && b2.y-player.y<60 && b2.y-player.y>-30){
				flag=1;
				playerBullets.clear();
				enemyBullets.clear();
				bossBullets.clear();
				GuiResult.vUpdate();
				GameState.setState(States.Result);
				MainGui.changePanel(GameState.getState());
				break;
			}
			if(hit2>0 || b2.x<0){
				enemyBullets.remove(i);
			}else{
				j++;
			}
		}
		while( i<playerBullets.size()){		//弾描画 当たり判定てきとう
			Bullet b = playerBullets.get(i);
			int hit =0;
			b.moveBullet(time,g);
			if(boss.x-b.x<20 && boss.x-b.x>-60 && boss.y-b.y<20 && boss.y-b.y>-35){
				hit++;
				boss.subLife();
			}

			if(boss.getLife()<=0){
				flag=2;
				playerBullets.clear();
				enemyBullets.clear();
				bossBullets.clear();
				GuiResult.vUpdate();
				GameState.setState(States.Result);
				MainGui.changePanel(GameState.getState());
				break;
			}
			if(hit>0 || b.x>1000){
				playerBullets.remove(i);
			}else{
				i++;
			}
		}

		TheDarknessIsDeep.f.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e){
				cnt++;
				if(cnt%(1+cnt2+cnt2%10)==0){
					cnt=0;
					switch(e.getKeyChar()){
					case 'w': player.y-=2; break;
					case 's': player.y+=2; break;
					case 'd': player.x+=2; break;
					case 'a': player.x-=2; break;
					case 'q': player.x-=2; player.y-=2; break;
					case 'e': player.x+=2; player.y-=2; break;
					case 'c': player.x+=2; player.y+=2; break;
					case 'z': player.x-=2; player.y+=2; break;
					case ' ':
						if(cnt3==0){
							playerBullets.add(new Bullet(".pic/bullet1.png",player.x+90,player.y+20));
							cnt3++;
						}
						break;

					case 'l':
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
			playerBullets.clear();
			enemyBullets.clear();
			bossBullets.clear();
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

		//発射間隔用 動くからここに置いた
		if(0<cnt3&&cnt3<6)cnt3++;
		if(cnt3==6)cnt3=0;
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