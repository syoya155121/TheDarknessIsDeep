package jp.ac.meisei.j155.TheDarknessIsDeep;

//^^凸

import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.io.File;

public class Player extends KeyInput{
	private int bulletType;
	private int fra;
	Image img;

	void init() {		
		try {
			img = ImageIO.read(new File(".pic/player.png"));
		} catch (Exception e) {
		}
	}
	public void paintComponent(Graphics g){
		g.drawImage(img, 50+vx, 300+vy,null);
	}
}
