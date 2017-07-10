package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class GuiGameGra extends JPanel{
	Graphics g;
	Player player;
	Enemy[] enemy = new Enemy[5];
	GameThread t;

	GuiGameGra(){
		setBounds(0,0,1000,700);
		setLayout(null);
		setBackground(new Color(0, 0, 153));
		setVisible(true);
		player=new Player(".pic/player.png", 50, 300);
		t = new GameThread();
		t.start();
	}
	
	public void Run(){
		while(true){
			player.Up();
			repaint();

			try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}

	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000,700);
		player.paintImg(g);

	}

	public void update(Graphics g){
		paint(g);
	}

	public void processKeyEvent(KeyEvent e){
		if(e.getID() == KeyEvent.KEY_PRESSED){
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				player.Up();
				break;
			case KeyEvent.VK_DOWN:
				player.Down();
				break;
			case KeyEvent.VK_RIGHT:
				player.Right();
				break;
			case KeyEvent.VK_LEFT:
				player.Left();
				break;
			case KeyEvent.VK_SPACE:
				break;
			default:
				break;
			}
		}
	}


}
