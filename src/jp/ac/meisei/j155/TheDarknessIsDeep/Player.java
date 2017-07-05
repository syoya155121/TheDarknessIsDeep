package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.io.File;

public class Player{
	private int bulletType;
	private int fra;
	Human player;
	public void Jiki() {
		player = new Human(".pic/player.png",100,300);
	}
}