package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class GuiOption extends JPanel{
	JLabel title, ope,mouse,keyboard,life,lifeNum,bomb,bombNum,save;
	MainGui mg;

	JRadioButton kb,ms;


	GuiOption(){
		setName("Option");
		setLayout(null);
		setSize(1000,750);
		setBackground(new Color(0,0,0));

		title = new JLabel("Option");
		title.setBounds(0, 50, 1000, 100);
		title.setForeground(new Color(255,255,255));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("Impact", Font.PLAIN, 80));


		kb = new JRadioButton("");
		kb.setSelected(true);
		kb.setBounds(420, 210, 28, 23);

		ms = new JRadioButton("");
		ms.setBounds(720, 210, 28, 23);
		ButtonGroup group = new ButtonGroup();
		group.add(kb);
		group.add(ms);


		ope = new JLabel("Oparation");
		ope.setBounds(50, 185, 272, 65);
		ope.setForeground(new Color(255,255,255));
		ope.setHorizontalAlignment(JLabel.CENTER);
		ope.setFont(new Font("Impact", Font.PLAIN, 65));

		keyboard = new JLabel("KeyBoard");
		keyboard.setBounds(460, 196, 198, 50);
		keyboard.setForeground(new Color(255,255,255));
		keyboard.setHorizontalAlignment(JLabel.CENTER);
		keyboard.setFont(new Font("Impact", Font.PLAIN, 50));

		mouse = new JLabel("Mouse");
		mouse.setBounds(750, 200, 138, 43);
		mouse.setForeground(new Color(255,255,255));
		mouse.setHorizontalAlignment(JLabel.CENTER);
		mouse.setFont(new Font("Impact", Font.PLAIN, 50));

		life = new JLabel("Life");
		life.setBounds(135, 350, 99, 57);
		life.setForeground(new Color(255,255,255));
		life.setHorizontalAlignment(JLabel.CENTER);
		life.setFont(new Font("Impact", Font.PLAIN, 65));

		lifeNum = new JLabel("3");
		lifeNum.setBounds(600, 350, 42, 57);
		lifeNum.setForeground(new Color(255,255,255));
		lifeNum.setHorizontalAlignment(JLabel.CENTER);
		lifeNum.setFont(new Font("Impact", Font.PLAIN, 65));

		bomb = new JLabel("Bomb");
		bomb.setBounds(105, 470, 153, 57);
		bomb.setForeground(new Color(255,255,255));
		bomb.setHorizontalAlignment(JLabel.CENTER);
		bomb.setFont(new Font("Impact", Font.PLAIN, 65));

		bombNum = new JLabel("3");
		bombNum.setBounds(600, 470, 42, 57);
		bombNum.setForeground(new Color(255,255,255));
		bombNum.setHorizontalAlignment(JLabel.CENTER);
		bombNum.setFont(new Font("Impact", Font.PLAIN, 65));

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
		add(keyboard);
		add(mouse);
		add(ope);
		add(life);
		add(lifeNum);
		add(bomb);
		add(bombNum);

		add(kb);
		add(ms);

	}
}
