package jp.ac.meisei.j155.TheDarknessIsDeep;

public class Enemy implements Runnable{
	Human[] enemy = new Human[5];

	Enemy(){
		enemy[0] = new Human(".pic/enemy1.png",800,800);
		enemy[1] = new Human(".pic/enemy1.png",800,800);
		enemy[2] = new Human(".pic/enemy1.png",800,800);
		enemy[3] = new Human(".pic/enemy1.png",800,800);
		enemy[4] = new Human(".pic/enemy1.png",800,800);
	}

	public void run(){
		/*while(){
			enemy[0];
			Thread.sleep(1000);
			enemy[1];
			Thread.sleep(1000);
			enemy[2];
			Thread.sleep(1000);
			enemy[3];
			Thread.sleep(1000);
			enemy[4];
			Thread.sleep(1000);
		}*/
	}
}