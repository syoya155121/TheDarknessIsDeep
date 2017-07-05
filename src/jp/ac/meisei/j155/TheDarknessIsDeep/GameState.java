package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.sql.Time;
import java.time.LocalDateTime;

public class GameState {
	//ゲームの状態
	static enum States{
		Title,
		Game,
		Option,
		Result,
		TheEnd;
	}
	//推移を格納するやつ
	private static States state;

	static States getState(){
		return state;
	}
	static void setState(States s){
		state = s;
	}

	//スコア
	private static int score;
	public static int getScore(){
		return score;
	}
	public static void setState(int num){
		score = num;
	}
	public static void sumState(int num){
		score += num;
	}
	public static void subState(int num){
		score -= num;
	}

	//生存時間の予定(消すかも)
	//FIXME

	//クリアフラグのやつ
	private static boolean clearFlag = false;
	public static boolean getClearFlag(){
		return clearFlag;
	}
	public static void setClearFlag(){
		clearFlag = true;
	}
	public static void resetClearFlag(){
		clearFlag = false;
	}

	//プレイヤー(一人のみ。対戦する場合配列にする(完成したら)。newしてないから気をつけて)
	private static Human player;

	//敵(たくさん呼ぶように配列にした。newしてないから気をつけて)
	private static Human[] enemy;

	//オプションのやつ キーボード<->マウス の予定 (初期はキーボード)
	private static boolean kbdTOMus = false;

	GameState(){
		debug.println("aaa");
		States state = States.Title;
		score=0;
	}
}
