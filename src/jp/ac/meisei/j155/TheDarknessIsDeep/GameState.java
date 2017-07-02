package jp.ac.meisei.j155.TheDarknessIsDeep;
public class GameState {
	enum States{
		Title,
		Game,
		TheEnd,
		Gameover,
		Result;
	}
	int score;
	int time;
	States state;
	Human player;
	Human[] enemy;
	GameState(){
		States state = States.Title;
		score=0;
		
	}
}
