import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class sorter extends JPanel implements MouseListener, Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3441070212877164982L;
	int box = 12;
	int num1 = 0;
	int boxx = 50;
	int boxy = 30;
	int m = 0;
	boolean clicky = false;
	double[] x = new double[box+1];
	double[] y = new double[box+1];
	JFrame f = new JFrame("Hello world");
	JLabel label1 = new JLabel("Resistence1 Calcultor");
	JPanel p = new JPanel();
	Color Brown = new Color(160,82,45);
	Color Red = new Color(255,0,0);
	Color Orange = new Color(255,165,0);
	Color Yellow = new Color(255,255,0);
	Color Green = new Color(0,255,0);
	Color Blue = new Color(0,0,255);
	Color Violet = new Color(138,43,226);
	Color Gray = new Color(128,128,128);
	Color White = new Color(255,255,255);
	Color Gold = new Color(255,215,0);
	Color Silver = new Color(192,192,192);
	
	public sorter() {
		addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(int i = 1; i < box+1;i++) {
			if(i == m) {
		g2.setColor(Color.BLACK);
			}if(i == m) {
		g2.setColor(Brown);
			}if(i == m+2) {	
		g2.setColor(Color.RED);
			}if(i == m+3) {
		g2.setColor(Color.ORANGE);		
			}if(i == m+4) {
		g2.setColor(Color.YELLOW);		
			}if(i == m+5) {
		g2.setColor(Color.GREEN);		
			}if(i == m+6) {
		g2.setColor(Color.BLUE);		
			}if(i == m+7) {
		g2.setColor(Violet);		
			}if(i == m+8) {
		g2.setColor(Color.GRAY);		
			}if(i == m+9) {
		g2.setColor(White);		
			}if(i == m+10) {
		g2.setColor(Gold);		
			}if(i == m+11) {
		g2.setColor(Silver);		
			}
		//g2.fill(new Rectangle2D.Double(getWidth()/i, getHeight()/10, x[i-1], y[i-1]));
		g2.fill(new Rectangle2D.Double(getWidth()/10+(getWidth()/16*i), getHeight()/10, boxx, boxy));
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j = 1; j <= box+1;j++ ) {
			x[j-1] = getWidth()/10+(getWidth()/16*j);
			y[j-1] = getHeight()/10;
			if(clicky) {
				System.out.println(num1);
			}if(!clicky) {
				num1=0;
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int mouse = e.getButton();
		for(int k = 1; k < box+1; k++) {
		if(mouse == 1 && getMousePosition().x < (x[k] + boxx) && getMousePosition().x > (x[k] - boxx) && getMousePosition().y < (y[k] + boxy) && getMousePosition().y > (y[k] - boxy)) {
			//num1 = k;
			System.out.println(k);
			//clicky = true;
		}else{
			clicky = false;
		}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		}
}
