package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Image;
import java.awt.Toolkit;

public class enemy extends Human {
	Image  image;
	int width = 32;   // 敵の幅
	int height = 64;   // 敵の高さ
	int x, y;   // 敵の位置
	
	public enemy(){

		// 敵画像の読み込み
		String filename = "Enemy1.png";
		Image image = Toolkit.getDefaultToolkit().getImage(filename);

		
		// 敵の初期位置
		x = 800;
		y = 400;
	}
	
	public void run(){
		while(){
		
	}
}
