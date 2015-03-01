
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class LabelPanel extends JPanel {
	
	JLabel health;
	JLabel commonSense;
	JLabel social;
	JLabel product;
	JLabel athletic;
	JLabel gpa;
	Player player;
	
	public LabelPanel(Player p){
		player=p;
		this.setLayout(new FlowLayout());
		health=new JLabel("Health: ");
		this.add("health",health);
		commonSense=new JLabel("Common Sense: ");
		this.add("cs",commonSense);
		social=new JLabel("Social: ");
		this.add("social",social);
		product=new JLabel("Productivity: ");
		this.add("product",product);
		athletic=new JLabel("Athletic: ");
		this.add("athletic",athletic);
		gpa=new JLabel("GPA: ");
		this.add("gpa",gpa);
	}
	
	public void paintComponent(Graphics gr){
		super.paintComponent(gr);
		updateStats();
		
	}

	private void updateStats() {
		health.setText("Health: "+ player.getHealth());
		commonSense.setText("Common Sense:"+ player.getCommonSense());
		social.setText("Social: "+ player.getSocial());
		product.setText("Productivity: "+ player.getProduct());
		athletic.setText("Athletic: "+ player.getAthletic());
		gpa.setText("GPA: "+ player.getGpa());
	}
	
}
