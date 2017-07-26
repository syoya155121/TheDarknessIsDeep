package jp.ac.meisei.j155.TheDarknessIsDeep;

public class Enemy extends Human implements Runnable{
	// アニメーション用スレッド
	private Thread thread;
	private int vx=0;
	private int vy=3;
	Enemy(String file, int x, int y) {
		super("./pic/enemy1.png",x,y);
	}

	public void run(){
		// プログラムが終了するまでフレーム処理を繰り返す
		while (true) {
			// 20ミリ秒だけ休止
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}