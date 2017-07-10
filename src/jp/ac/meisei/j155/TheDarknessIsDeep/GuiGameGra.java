package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GuiGameGra extends JPanel{
	Graphics g;
	Player player;
	Enemy[] enemy = new Enemy[5];

	GuiGameGra(){
		setBounds(0,0,1000,700);
		setLayout(null);
		setBackground(new Color(0, 0, 153));
		setVisible(true);
		player=new Player();
	}

	public void paint(Graphics g){
		g.setColor(new Color(0,0,192));

	}
	public void update(Graphics g){
		paint(g);
	}

}
