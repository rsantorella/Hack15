import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUI extends JFrame implements ActionListener{

	private Container content;
	private JPanel gen;
	private JPanel stats;
	private JTextField choice;
	private TextPanel gameText;
	private boolean nextEvent;
	
	private Game game;
	
	public GUI(){
		game= new Game();
		setSize(800,500);
		setTitle("TCNJ Text Adventure");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		content= getContentPane();
		
		//main/only? panel
		gen = new JPanel();
		content.add("gen",gen);
		gen.setLayout(new BorderLayout());

		//player inputs choice here
		choice= new JTextField();
		gen.add(choice,BorderLayout.SOUTH);
		choice.addActionListener(this);
		choice.setActionCommand("choiceText");
		JButton nextButton= new JButton("Continue");
		nextButton.addActionListener(this);
		gen.add(nextButton,BorderLayout.SOUTH);
		nextButton.setActionCommand("nextButton");

		//game text is displayed here
		gameText= new TextPanel(game);
		gen.add(gameText,BorderLayout.CENTER);
		
		//stats
		stats= new LabelPanel(game.getPlayer());
		gen.add(stats,BorderLayout.NORTH);
		
		
		game.displayEvent();
		nextEvent=false;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("choiceText")){
			
			game.displayOutcome(choice.getText());
			gameText.repaint();
			stats.repaint();
			nextEvent=true;
		}
		else if(e.getActionCommand().equals("nextButton")){
			if(nextEvent)
				game.displayEvent();
				gameText.repaint();
				stats.repaint();
				nextEvent=false;
		}
		
	}
	public static void main(String[] args){
		GUI gui= new GUI();
		gui.setVisible(true);
	}
}
