package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class GuiOption extends JPanel{
	JLabel title, mouse,keyboad,life,lifeNum,bomb,bombNum,save;
	MainGui mg;

	GuiOption(){
		setName("Option");
		setLayout(null);
		setSize(1000,750);
		setBackground(new Color(0,0,0));

		setBackground(new Color(0,0,0));
		title = new JLabel("Option");
		title.setBounds(0, 50, 1000, 100);
		title.setForeground(new Color(255,255,255));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("Impact", Font.PLAIN, 80));

		save = new JLabel("Save");
		save.setBounds(800, 650, 99, 43);
		save.setForeground(new Color(255,255,255));
		save.setHorizontalAlignment(JLabel.CENTER);
		save.setFont(new Font("Impact", Font.PLAIN, 50));
		save.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				GameState.setState(States.Title);
				MainGui.changePanel(GameState.getState());
			}
			public void mouseEntered(MouseEvent e) {save.setForeground(new Color(235,121,136));}
			public void mouseExited(MouseEvent e) {save.setForeground(new Color(255,255,255));}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});
		add(title);
		add(save);
	}
}
