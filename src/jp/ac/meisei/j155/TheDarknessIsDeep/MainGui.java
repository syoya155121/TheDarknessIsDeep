package jp.ac.meisei.j155.TheDarknessIsDeep;
import javax.swing.JFrame;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class MainGui extends JFrame {
	GameState state = new GameState();
	GuiTitle title = new GuiTitle(state);
	GuiGame game = new GuiGame(state);
	GuiOption option = new GuiOption(state);
	GuiResult result = new GuiResult(state);
	GuiTheEnd theEnd = new GuiTheEnd(state);

	public MainGui() {
		setResizable(false);
		getContentPane().add(title);
		title.setVisible(true);
		game.setVisible(false);
		option.setVisible(false);
		result.setVisible(false);
		theEnd.setVisible(false);
        this.setBounds(0,0,1000,750);
	}
	public void changePanel(States state){
		switch(state){
		case Title:
			title.setVisible(true);
			game.setVisible(false);
			option.setVisible(false);
			result.setVisible(false);
			theEnd.setVisible(false);
			break;
		case Option:
			title.setVisible(false);
			game.setVisible(false);
			option.setVisible(true);
			result.setVisible(false);
			theEnd.setVisible(false);
			break;
		case Game:
			title.setVisible(false);
			game.setVisible(true);
			option.setVisible(false);
			result.setVisible(false);
			theEnd.setVisible(false);
			break;
		case TheEnd:
			title.setVisible(false);
			game.setVisible(false);
			option.setVisible(false);
			result.setVisible(false);
			theEnd.setVisible(true);
			break;
		case Result:
			title.setVisible(true);
			game.setVisible(false);
			option.setVisible(false);
			result.setVisible(true);
			theEnd.setVisible(false);
			break;
		}

	}
}
