package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.event.KeyEvent;

public class Controll {

	public Point processKeyEvent(KeyEvent e){
		if(e.getID() == KeyEvent.KEY_PRESSED){
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_UP:
				return new Point(0,-5);
			case KeyEvent.VK_DOWN:
				return new Point(0,5);
			case KeyEvent.VK_RIGHT:
				return new Point(5,0);
			case KeyEvent.VK_LEFT:
				return new Point(-5,0);
			case KeyEvent.VK_SPACE:
				//FIXME
				return null;
			default:
				break;
			}
		}
		return null;
	}
}
