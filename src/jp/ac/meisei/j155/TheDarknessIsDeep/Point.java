package jp.ac.meisei.j155.TheDarknessIsDeep;
public class Point {
	//xは横 yは縦
	private int x,y;

	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	//x y をもらう系
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	//x y をセットする系
	public void setPont(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
}
