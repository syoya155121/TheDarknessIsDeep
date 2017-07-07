package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.event.KeyEvent;

public class KeyInput {
	int vx,  vy;

	//キー入力処理　移動:矢印キー　撃つ:スペース　
	public void processKeyEvent(KeyEvent e){
		if(e.getID() == KeyEvent.KEY_PRESSED){

			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				vy -= 5;
				break;
			case KeyEvent.VK_DOWN:
				vy += 5;
				break;
			case KeyEvent.VK_RIGHT:
				vx += 5;
				break;
			case KeyEvent.VK_LEFT:
				vx -= 5;
				break;
			case KeyEvent.VK_SPACE:
				break;
			default:
				break;
			}
		}
	}
}