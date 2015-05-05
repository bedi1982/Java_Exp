package sergio.r.lemke.gamev1.play;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Play extends Applet implements KeyListener{
    private Rectangle rect;	
	
	public void Jogar() {
		/*Metodos metodos = new Metodos();
		char[][] tab = new char[10][10];
		tab = metodos.generateTable();
		tab[0][0] = '8';
		//System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
		*/
		this.addKeyListener(this);
		rect = new Rectangle(0,0,50,50);
	}
	
	public void paint(Graphics g){
		setSize(500,500);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(rect);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("la");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			rect.setLocation(rect.x +2, rect.y);
			
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT){
			rect.setLocation(rect.x -2, rect.y);
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP){
			rect.setLocation(rect.x, rect.y - 2);
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			rect.setLocation(rect.x, rect.y + 2);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}