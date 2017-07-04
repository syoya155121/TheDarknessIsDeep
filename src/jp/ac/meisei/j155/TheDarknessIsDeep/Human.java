package jp.ac.meisei.j155.TheDarknessIsDeep;
public class Human {
	private Point p;
	private int life;
	private int bomb;
	private int shoot;
	private boolean show;

	Human(){
		p=new Point(-1,-1);
		life=3;
		bomb=3;
		show=false;
	}
	//Life系
	public int getLife(){
		return life;
	}
	public void addLife(){
		life++;
	}
	public void subLife(){
		life--;
	}

	//ボム系
	public int getBomb(){
		return bomb;
	}
	public void addBomb(){
		bomb++;
	}
	public void subBomb(){
		bomb--;
	}

	//表示系  falseならゲーム上から消える予定
	public boolean getShow(){
		return show;
	}
	public void setShow(){
		show=true;
	}
	public void HiddenShow(){
		show=false;
	}
}

//test