package jp.ac.meisei.j155.TheDarknessIsDeep;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GuiTitle extends JPanel {
	JLabel titleLabel,gamestartLabel,optionLabel,exitLabel;
	MainGui mg;
	public GuiTitle(MainGui m) {
		mg=m;
		setName("Title");
		setLayout(null);
		setSize(1000,750);
		setBackground(new Color(0,0,0));
		titleLabel = new JLabel("The Darkness is Deep");
		titleLabel.setBounds(0, 50, 1000, 100);
		titleLabel.setForeground(new Color(255,255,255));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("Impact", Font.PLAIN, 80));

		gamestartLabel = new JLabel("Game Start");
		gamestartLabel.setBounds(700, 500, 135, 30);
		gamestartLabel.setForeground(new Color(255,255,255));
		gamestartLabel.setHorizontalAlignment(JLabel.CENTER);
		gamestartLabel.setFont(new Font("Impact", Font.PLAIN, 30));
		gamestartLabel.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				System.out.println("gamestart");
			}
			public void mouseEntered(MouseEvent e) {
				// TODO 自動生成されたメソッド・スタブ
				gamestartLabel.setForeground(new Color(235,121,136));
			}
			public void mouseExited(MouseEvent e) {
				gamestartLabel.setForeground(new Color(255,255,255));
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});

		optionLabel = new JLabel("Option");
		optionLabel.setBounds(700, 550, 80, 30);
		optionLabel.setForeground(new Color(255,255,255));
		optionLabel.setHorizontalAlignment(JLabel.CENTER);
		optionLabel.setFont(new Font("Impact", Font.PLAIN, 30));
		optionLabel.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				System.out.println("option");
			}
			public void mouseEntered(MouseEvent e) {
				// TODO 自動生成されたメソッド・スタブ
				optionLabel.setForeground(new Color(235,121,136));
			}
			public void mouseExited(MouseEvent e) {
				optionLabel.setForeground(new Color(255,255,255));
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});

		exitLabel = new JLabel("EXIT");
		exitLabel.setBounds(700, 600, 49, 30);
		exitLabel.setForeground(new Color(255,255,255));
		exitLabel.setHorizontalAlignment(JLabel.CENTER);
		exitLabel.setFont(new Font("Impact", Font.PLAIN, 30));
		exitLabel.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			public void mouseEntered(MouseEvent e) {
				// TODO 自動生成されたメソッド・スタブ
				exitLabel.setForeground(new Color(235,121,136));
			}
			public void mouseExited(MouseEvent e) {
				exitLabel.setForeground(new Color(255,255,255));
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});

		add(titleLabel);
		add(gamestartLabel);
		add(optionLabel);
		add(exitLabel);
	}
	public void mouseClicked(MouseEvent e){

	}
}
