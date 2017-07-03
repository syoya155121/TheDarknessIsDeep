package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.sql.Time;
import java.time.LocalDateTime;

public class GameState {
	//ゲームの状態
	enum States{
		Title,
		Game,
		Option,
		Result,
		TheEnd;
	}
	//推移を格納するやつ
	private States state;

	public States getState(){
		return state;
	}
	public void setState(States s){
		state = s;
	}

	//スコア
	private int score;
	public int getScore(){
		return score;
	}
	public void setState(int num){
		score = num;
	}
	public void sumState(int num){
		score += num;
	}
	public void subState(int num){
		score -= num;
	}

	//生存時間の予定(消すかも)
	//FIXME

	//クリアフラグのやつ
	private boolean clearFlag = false;
	public boolean getClearFlag(){
		return clearFlag;
	}
	public void setClearFlag(){
		clearFlag = true;
	}
	public void resetClearFlag(){
		clearFlag = false;
	}

	//プレイヤー(一人のみ。対戦する場合配列にする(完成したら)。newしてないから気をつけて)
	private Human player;

	//敵(たくさん呼ぶように配列にした。newしてないから気をつけて)
	private Human[] enemy;

	//オプションのやつ キーボード<->マウス の予定 (初期はキーボード)
	private boolean kbdTOMus = false;

	GameState(){
		States state = States.Title;
		score=0;
	}
}
