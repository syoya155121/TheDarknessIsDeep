package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TheDarknessIsDeep {
	static Player p;
	public static void main(String[] args) {
		p=new Player(".pic/player.png", 50, 300);
		MainGui f = new MainGui();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
		f.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				//debug.println("Pressed " + e.getKeyChar());
				if(e.getID() == KeyEvent.KEY_PRESSED){
					switch(e.getKeyChar()){
					case 'w':
						p.Up();
						break;
					case 's':
						p.Down();
						break;
					case 'd':
						p.Right();
						break;
					case 'a':
						p.Left();
						break;
					case ' ':
						debug.println("Space!!");
						break;
					default:
						break;
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

		});
	}
}
