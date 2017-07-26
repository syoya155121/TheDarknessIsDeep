package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import jp.ac.meisei.j155.TheDarknessIsDeep.GameState.States;

public class GuiResult extends JPanel{
	static JLabel titleLabel,time;
	JLabel end;
	static String title;
	static int timenum=0;
	static void vUpdate(){
		timenum=GuiGameGra.time/60;
		if(GuiGameGra.flag==1) title="Game Over";
		if(GuiGameGra.flag==2) title="Congratulations!!!!";
		titleLabel.setText(title);
		time.setText("Time :"+timenum);
	}
	GuiResult(){
		setName("Title");
		setLayout(null);
		setSize(1000,750);
		setBackground(new Color(0,0,0));

		time = new JLabel();
		time.setBounds(400,400,400,100);
		time.setForeground(new Color(255,255,255));
		time.setHorizontalAlignment(JLabel.LEFT);
		time.setFont(new Font("Impact", Font.PLAIN, 60));
		add(time);

		titleLabel = new JLabel(title);
		titleLabel.setBounds(0, 50, 1000, 100);
		titleLabel.setForeground(new Color(255,255,255));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("Impact", Font.PLAIN, 80));

		end = new JLabel("End");
		end.setBounds(800, 650, 99, 43);
		end.setForeground(new Color(255,255,255));
		end.setHorizontalAlignment(JLabel.CENTER);
		end.setFont(new Font("Impact", Font.PLAIN, 50));
		end.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				//ゲームリセット時リセットしたい値はここに記述
				GuiGameGra.flag=0;
				GuiGameGra.time=0;
				GuiGameGra.player.init();
				GuiGameGra.boss.init();
				GameState.setState(States.Title);
				MainGui.changePanel(GameState.getState());
			}
			@Override
			public void mousePressed(MouseEvent e) {end.setForeground(new Color(235,121,136));}
			@Override
			public void mouseReleased(MouseEvent e) {end.setForeground(new Color(255,255,255));}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
		});

		add(titleLabel);
		add(end);
	}
}
