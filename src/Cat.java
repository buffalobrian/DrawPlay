import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 150;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/3;
	private static final int EYE_X = HEAD_DIMENSION/3;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;

	private static final int Body_Y = HEAD_DIMENSION;
	private static final int BODY_X = HEAD_DIMENSION*2;
	
	
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		//Draw Ears
		g2.setColor(Color.blue);
		g2.fillPolygon(new int[] {x-10+HEAD_DIMENSION/2, x-30+HEAD_DIMENSION/2, x-20+HEAD_DIMENSION/2}, new int[] {y+10,y+10,y-20}, 3);
		g2.fillPolygon(new int[] {x+10+HEAD_DIMENSION/2, x+30+HEAD_DIMENSION/2, x+20+HEAD_DIMENSION/2}, new int[] {y+10,y+10,y-23}, 3);
		// Draw the head
		g2.setColor(Color.black);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X-25; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.yellow);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow", catX, catY+HEAD_DIMENSION+10);	
		x = catX + 120;
		y = catY + 25;
		// gave the cat legs
		g2.fillOval(x, y, 300, 150);
		y += 30;
		g2.fillRect(x, y, 10, 400);
		x += 30;
		g2.fillRect(x, y, 10, 400);
		x += 90;
		g2.fillRect(x, y, 10, 400);
		x += 30;
		g2.fillRect(x, y, 10, 400);
	}
}
