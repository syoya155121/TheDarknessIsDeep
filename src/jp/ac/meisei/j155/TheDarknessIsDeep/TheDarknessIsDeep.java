package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TheDarknessIsDeep {
	static Player p;
	static MainGui f;
	public static void main(String[] args) {
		p=new Player(".pic/player.png", 50, 300);
		f = new MainGui();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}
}
