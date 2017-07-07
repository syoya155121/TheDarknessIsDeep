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

public class GuiGame extends JLayeredPane{
	JLabel score,scoreNum,life,lifeNum,bomb,bombNum,debug;
	JLabel p;
	Player player;
	Graphics g;

	GuiGame(){
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

		JPanel gp = new JPanel();
		gp.setBounds(0,0,1000,700);
		gp.setLayout(null);
		gp.setBackground(new Color(0, 0, 153));
		gp.setVisible(true);
		this.add(gp);

		score = new JLabel("score :");
		score.setBounds(50, 10, 88, 31);
		score.setForeground(new Color(255,255,255));
		score.setHorizontalAlignment(JLabel.CENTER);
		score.setFont(new Font("Impact", Font.PLAIN, 30));

		scoreNum = new JLabel("0");
		scoreNum.setBounds(154, 12, 350, 27);
		scoreNum.setForeground(new Color(255,255,255));
		scoreNum.setHorizontalAlignment(SwingConstants.RIGHT);
		scoreNum.setFont(new Font("Impact", Font.PLAIN, 30));

		life = new JLabel("Life :");
		life.setBounds(550, 10, 54, 31);
		life.setForeground(new Color(255,255,255));
		life.setHorizontalAlignment(SwingConstants.CENTER);
		life.setFont(new Font("Impact", Font.PLAIN, 30));

		lifeNum = new JLabel("99");
		lifeNum.setBounds(605, 12, 45, 31);
		lifeNum.setForeground(new Color(255,255,255));
		lifeNum.setHorizontalAlignment(SwingConstants.CENTER);
		lifeNum.setFont(new Font("Impact", Font.PLAIN, 30));

		bomb = new JLabel("Bomb :");
		bomb.setBounds(680, 10, 88, 31);
		bomb.setForeground(new Color(255,255,255));
		bomb.setHorizontalAlignment(SwingConstants.CENTER);
		bomb.setFont(new Font("Impact", Font.PLAIN, 30));

		bombNum = new JLabel("99");
		bombNum.setBounds(770, 12, 37, 31);
		bombNum.setForeground(new Color(255,255,255));
		bombNum.setHorizontalAlignment(SwingConstants.CENTER);
		bombNum.setFont(new Font("Impact", Font.PLAIN, 30));

		debug = new JLabel("???");
		debug.setBounds(900, 10, 88, 31);
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

		gs.add(score);
		gs.add(scoreNum);
		gs.add(life);
		gs.add(lifeNum);
		gs.add(bomb);
		gs.add(bombNum);
		gs.add(debug);



	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.draw(new Line2D.Double(30.0d, 50.0d, 180.0d, 140.0d));
		g2.setPaint(Color.PINK);
		BasicStroke wideStroke = new BasicStroke(4.0f);
		g2.setStroke(wideStroke);
		g2.draw(new Line2D.Double(30.0d, 120.0d, 250.0d, 70.0d));
	}
}
