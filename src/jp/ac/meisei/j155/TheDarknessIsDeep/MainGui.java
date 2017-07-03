package jp.ac.meisei.j155.TheDarknessIsDeep;
import javax.swing.JFrame;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class MainGui extends JFrame {
	GameState state = new GameState();
	GuiTitle title = new GuiTitle(state);
	GuiGame game = new GuiGame(state);

	public MainGui() {
		setResizable(false);
		getContentPane().add(title);
		title.setVisible(true);
		game.setVisible(false);
        this.setBounds(0,0,1000,750);
	}
	public void changePanel(States state){
		switch(state){
		case Title:
			title.setVisible(true);
			break;
		case Option:
			title.setVisible(false);
			break;
		case Game:
			title.setVisible(false);
			break;
		case TheEnd:
			title.setVisible(false);
			break;
		case Result:
			title.setVisible(false);
			break;
		}

	}
}
