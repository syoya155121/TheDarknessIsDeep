package jp.ac.meisei.j155.TheDarknessIsDeep;
import javax.swing.JFrame;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class MainGui extends JFrame {
	static GameState state = new GameState();
	static GuiTitle title = new GuiTitle();
	static GuiOption option = new GuiOption();
	static GuiGame game = new GuiGame();
	static GuiResult result = new GuiResult();
	static GuiTheEnd theEnd = new GuiTheEnd();

	public MainGui() {
		this.setBounds(0,0,1000,750);
		this.setResizable(false);
		getContentPane().add(title);
		getContentPane().add(game);
		getContentPane().add(option);
		getContentPane().add(result);
		getContentPane().add(theEnd);
		title.setVisible(true);
		game.setVisible(false);
		option.setVisible(false);
		result.setVisible(false);
		theEnd.setVisible(false);
	}
	static public void changePanel(States state){
		switch(state){
		case Title:
			title.setVisible(true);
			game.setVisible(false);
			option.setVisible(false);
			result.setVisible(false);
			theEnd.setVisible(false);
			System.out.println("Title");
			break;
		case Option:
			title.setVisible(false);
			game.setVisible(false);
			option.setVisible(true);
			result.setVisible(false);
			theEnd.setVisible(false);
			System.out.println("Option");
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
			title.setVisible(false);
			game.setVisible(false);
			option.setVisible(false);
			result.setVisible(true);
			theEnd.setVisible(false);
			break;
		default:
			System.out.println("Error MainGui changePanel()");
			System.exit(1);
			break;
		}
	}
}
