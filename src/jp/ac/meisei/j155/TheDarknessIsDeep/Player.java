package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.io.File;

public class Player extends Human{

	private int bulletType;
	private int fra;
	int x,y;
	Image img;
	public void Jiki() {
		try {
			img = ImageIO.read(new File("player.png"));
		} catch (Exception e) {
		}
		x=30;
		y=300;
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	//キー設定　移動:矢印キー　撃つ:スペース
	public void processKeyEvent(KeyEvent e){
		if(e.getID() == KeyEvent.KEY_PRESSED){
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_UP:
				y -= 5;
				break;
			case KeyEvent.VK_DOWN:
				y += 5;
				break;
			case KeyEvent.VK_RIGHT:
				x += 5;
				break;
			case KeyEvent.VK_LEFT:
				x -= 5;
				break;
			case KeyEvent.VK_SPACE:
				fra++;
				break;
			default:
				break;
			}
		}
	}

}

