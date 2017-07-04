package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class GuiGame extends JPanel{
	JLabel score,scoreNum,life,lifeNum,bomb,bombNum,debug;
	
	GuiGame(){
		setName("Game");
		setLayout(null);
		setSize(1000,750);
		setBackground(new Color(0,0,0));

		score = new JLabel("score :");
		score.setBounds(100, 650, 88, 31);
		score.setForeground(new Color(255,255,255));
		score.setHorizontalAlignment(JLabel.CENTER);
		score.setFont(new Font("Impact", Font.PLAIN, 30));

		scoreNum = new JLabel("0");
		scoreNum.setBounds(400, 652, 79, 31);
		scoreNum.setForeground(new Color(255,255,255));
		scoreNum.setHorizontalAlignment(SwingConstants.RIGHT);
		scoreNum.setFont(new Font("Impact", Font.PLAIN, 30));

		life = new JLabel("Life :");
		life.setBounds(600, 650, 54, 31);
		life.setForeground(new Color(255,255,255));
		life.setHorizontalAlignment(SwingConstants.CENTER);
		life.setFont(new Font("Impact", Font.PLAIN, 30));

		lifeNum = new JLabel("99");
		lifeNum.setBounds(655, 650, 45, 31);
		lifeNum.setForeground(new Color(255,255,255));
		lifeNum.setHorizontalAlignment(SwingConstants.CENTER);
		lifeNum.setFont(new Font("Impact", Font.PLAIN, 30));

		bomb = new JLabel("Bomb :");
		bomb.setBounds(720, 650, 88, 31);
		bomb.setForeground(new Color(255,255,255));
		bomb.setHorizontalAlignment(SwingConstants.CENTER);
		bomb.setFont(new Font("Impact", Font.PLAIN, 30));

		bombNum = new JLabel("99");
		bombNum.setBounds(810, 650, 37, 31);
		bombNum.setForeground(new Color(255,255,255));
		bombNum.setHorizontalAlignment(SwingConstants.CENTER);
		bombNum.setFont(new Font("Impact", Font.PLAIN, 30));

		debug = new JLabel("???");
		debug.setBounds(900, 700, 88, 31);
		debug.setForeground(new Color(255,255,255));
		debug.setHorizontalAlignment(SwingConstants.CENTER);
		debug.setFont(new Font("Impact", Font.PLAIN, 30));
		debug.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				GameState.setState(States.Title);
				MainGui.changePanel(GameState.getState());
			}
			public void mouseEntered(MouseEvent e) {debug.setForeground(new Color(235,121,136));}
			public void mouseExited(MouseEvent e) {debug.setForeground(new Color(255,255,255));}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});

		add(score);
		add(scoreNum);
		add(life);
		add(lifeNum);
		add(bomb);
		add(bombNum);
		add(debug);
	}
}
