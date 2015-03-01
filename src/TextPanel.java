import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 
 * A JPanel that displays text.
 *
 */
public class TextPanel extends JPanel {
	private Game game;
	String[] text;
	
	public TextPanel(Game g){
		game=g;
		text=new String[3];
	}
	/**
	 * Draws the string[]text. text[o] is a situation. text[1] is an outcome.
	 * text[2] are choices.
	 */
	public void paintComponent(Graphics gr){
		super.paintComponent(gr);
		game.getText();
		gr.drawString(text[0], 20, 40);
		gr.drawString(text[1], 20, 100);
		gr.drawString(text[2], 20, 300);
		
	}
}
