package jp.ac.meisei.j155.TheDarknessIsDeep;
import javax.swing.JFrame;

public class MainGui extends JFrame {
	GameState state = new GameState();
	GuiTitle title = new GuiTitle(state);
	GuiGame game = new GuiGame(state);

	public MainGui() {
		setResizable(false);
		getContentPane().add(title);
		title.setVisible(true);
        this.setBounds(0,0,1000,750);
	}
	public void changePanel(int i){
		title.setVisible(false);

	}
}
