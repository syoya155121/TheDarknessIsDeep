package jp.ac.meisei.j155.TheDarknessIsDeep;
import java.awt.Color;
import javax.swing.JFrame;

public class MainGui extends JFrame {
	GuiTitle title = new GuiTitle(this);
	GameState state = new GameState();

	public MainGui() {
		setResizable(false);
		getContentPane().add(title);
		title.setVisible(true);
        this.setBounds(0,0,1000,750);
	}
}
