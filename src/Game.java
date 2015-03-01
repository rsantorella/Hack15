
public class Game {
	private Player p;
	private EventSelect eSelect;
	private boolean whichEvent;//t-choice, f-random
	private String[] text;
	private RandomEvent event;//note that ChoiceEvent extends RandomEvent

	public Game(String name, String school){
		p=new Player(name,school);
		eSelect=new EventSelect();
		whichEvent=true;
		String[]text=new String[3];
	}
	
	public RandomEvent getRandomEvent(){
		eSelect.getRandomEvent();
	}
	public ChoiceEvent getChoiceEvent(){
		eSelect.getChoiceEvent();
	}
	public void displayEvent(){
		if(whichEvent){
			event=getChoiceEvent();
			text[0]=event.getEvent();
			text[2]="";
			String[]choices=event.getChoices();
			String schoice="";
			for(int i=0; i<choices.length;i++){
				schoice+=i+". "+choices[i]+"    ";
			}
			text[1]=schoice;
			
			
		}
		else{
			event=getRandomEvent();
			String[][]o=getOutcome();
			p.updateStats(o[1],o[2]);
			text[0]=o[0][0];
			text[1]="";
			text[2]="";
			
		}
			
	}
	
	public void displayOutcome(String choice){
		String[][]o=event.getOutcome(choice);
		p.updateStats(o[1],o[2]);
		text[0]="";
		text[1]="";
		text[2]=o[0][0];
	}
	public String[]getText(){
		
		return text;
	}
}
