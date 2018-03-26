import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class screen{
	JFrame f = new JFrame("Hello world");
	sorter s = new sorter();
	JLabel label1 = new JLabel("Resistence Calcultor");
	JPanel p = new JPanel();
public screen() {
	gui();
}
public void gui() {
	p.add(label1);
	f.add(p);
	f.add(s);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(1000,500);
	f.setVisible(true);
	f.add(p, BorderLayout.NORTH);
	while(true) {
	s.run();
	}
}
	public static void main(String[] args) {
		new screen();
		}
}