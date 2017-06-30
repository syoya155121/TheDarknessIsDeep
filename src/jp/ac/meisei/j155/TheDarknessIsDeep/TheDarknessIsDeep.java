package jp.ac.meisei.j155.TheDarknessIsDeep;

import java.awt.EventQueue;

public class TheDarknessIsDeep {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TdidMainGui frame = new TdidMainGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
