package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class GuiGameState extends JLayeredPane{
	JLabel score;
	static JLabel scoreNum;
	JLabel life;
	JLabel lifeNum;
	JLabel bomb;
	JLabel bombNum;
	JLabel debug;

	GuiGameState(){
		this.setName("Game");
		this.setLayout(null);
		this.setSize(1000,750);
		this.setBackground(new Color(0,0,0));

		//GameStates
		JPanel gs = new JPanel();
		gs.setBounds(0, 700, 1000, 50);
		gs.setLayout(null);
		gs.setBackground(new Color(0,0,0));
		gs.setVisible(true);
		this.add(gs);

		GuiGameGra ggg = new GuiGameGra();
		this.add(ggg);

		score = new JLabel("BossLife :");
		score.setBounds(50, 10, 150, 31);
		score.setForeground(new Color(255,255,255));
		score.setHorizontalAlignment(JLabel.CENTER);
		score.setFont(new Font("Impact", Font.PLAIN, 30));

		scoreNum = new JLabel("0");
		scoreNum.setBounds(100, 12, 350, 27);
		scoreNum.setForeground(new Color(255,255,255));
		scoreNum.setHorizontalAlignment(SwingConstants.CENTER);
		scoreNum.setFont(new Font("Impact", Font.PLAIN, 30));

		life = new JLabel("Life :");
		life.setBounds(550, 10, 54, 31);
		life.setForeground(new Color(255,255,255));
		life.setHorizontalAlignment(SwingConstants.CENTER);
		life.setFont(new Font("Impact", Font.PLAIN, 30));

		lifeNum = new JLabel("1");
		lifeNum.setBounds(605, 12, 45, 31);
		lifeNum.setForeground(new Color(255,255,255));
		lifeNum.setHorizontalAlignment(SwingConstants.CENTER);
		lifeNum.setFont(new Font("Impact", Font.PLAIN, 30));

		bomb = new JLabel("Bomb :");
		bomb.setBounds(680, 10, 88, 31);
		bomb.setForeground(new Color(255,255,255));
		bomb.setHorizontalAlignment(SwingConstants.CENTER);
		bomb.setFont(new Font("Impact", Font.PLAIN, 30));

		bombNum = new JLabel("0");
		bombNum.setBounds(770, 12, 37, 31);
		bombNum.setForeground(new Color(255,255,255));
		bombNum.setHorizontalAlignment(SwingConstants.CENTER);
		bombNum.setFont(new Font("Impact", Font.PLAIN, 30));

//		debug = new JLabel("???");
//		debug.setBounds(900, 10, 88, 31);
//		debug.setForeground(new Color(255,255,255));
//		debug.setHorizontalAlignment(SwingConstants.CENTER);
//		debug.setFont(new Font("Impact", Font.PLAIN, 30));
//		debug.addMouseListener(new MouseListener(){
//			public void mouseClicked(MouseEvent e) {
//				GuiGameGra.playerBullets.clear();
//				GuiGameGra.enemyBullets.clear();
//				GuiGameGra.bossBullets.clear();
//				GameState.setState(States.Title);
//				MainGui.changePanel(GameState.getState());
//			}
//			public void mouseEntered(MouseEvent e) {debug.setForeground(new Color(235,121,136));}
//			public void mouseExited(MouseEvent e) {debug.setForeground(new Color(255,255,255));}
//			public void mousePressed(MouseEvent e) {}
//			public void mouseReleased(MouseEvent e) {}
//		});

		gs.add(score);
		gs.add(scoreNum);
		gs.add(life);
		gs.add(lifeNum);
		gs.add(bomb);
		gs.add(bombNum);
		//gs.add(debug);


	}
}
