 /* Name: Sufian Mushtaq, Bahawar Sharif Dhillon, Darman Khan
 * NetID: smushtaq, 
 * Assignment: Project 4
 * Lab: 11:05 - 12:20 
 */
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyApp extends JFrame {
	

	public MyApp() {
		setSize(750, 750);
		setTitle("Lob Pong");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new GameCanvas());
	}
	public static void main(String[] args) {
		new MyApp().setVisible(true);
	}

	
	/*protected class MainMenuCanvas extends JComponent {
		public MainMenuCanvas() {
			setLayout(new BorderLayout());
			add(new MainMenuPanel(), BorderLayout.CENTER);
		}
	}
	protected class MainMenuPanel extends JPanel {
		protected JButton b1, b2;
		public MainMenuPanel() {
			b1 = new JButton("Start Game!");
			b2 = new JButton("High Scores");
		}
	} */
}
