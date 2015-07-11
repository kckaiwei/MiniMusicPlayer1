import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel implements ControllerEventListener {

	boolean msg = false;

	public void controlChange(ShortMessage event) {
		msg = true;
		repaint();
	}

	public void paintComponent(Graphics g) {
		if (msg) {
			Graphics2D g2 = (Graphics2D) g;

			int r = (int) (Math.random() * 255);
			int gr = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);

			g.setColor(new Color(r, gr, b));

			int ht = (int) ((Math.random() * 120) + 10);
			int width = (int) ((Math.random() * 120) + 10);
			int x = (int) ((Math.random() * 40) + 10);
			int y = (int) ((Math.random() * 44) + 10);
			g.fillRect(x, y, ht, width);
			msg = false;

		}
	}

	public MyDrawPanel() {
		// TODO Auto-generated constructor stub
	}

}
