package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TheDarknessIsDeep {
	static MainGui f;
	public static void main(String[] args) {
		f = new MainGui();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}
}
