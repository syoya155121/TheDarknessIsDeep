package jp.ac.meisei.j155.TheDarknessIsDeep;
public class GameState {
	//ゲームの状態
	enum States{
		Title,
		Game,
		Option,
		Result,
		TheEnd;
	}
	//スコア
	int score;

	//生存時間の予定(消すかも)
	int time;

	//推移を格納するやつ
	States state;

	//クリアフラグのやつ
	boolean clear;

	//プレイヤー(一人のみ。対戦する場合配列にする(完成したら)。newしてないから気をつけて)
	Human player;

	//敵(たくさん呼ぶように配列にした。newしてないから気をつけて)
	Human[] enemy;
	GameState(){
		States state = States.Title;
		score=0;

	}
}
