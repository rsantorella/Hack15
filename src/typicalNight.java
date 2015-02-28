
public class typicalNight implements ChoiceEvent{
	
	String[]event=new String[]{"It is a typical week-night..."};
	String[]choices=new String[]{"study", "hang out with friends",
		"watch netflix","do laundry", "clean room","party", "workout", "eat", 
		"go to c-store", "shower", "play games", "go to sleep early", "check social media", 
		"call parents"};
	
	/**
	 * Takes the player's choice and trait stats into account to 
	 * determine the outcome of the event.
	 * @return String[][] of the outcome of the user's traits to
	 * increment and decrement
	 */
	public String[][] getOutcome(String choice){
		String[]incrementing;
		String[]decrementing;
		switch (choice)
		{
			case "study":
				incrementing = new String[]{"product", "gpa"};
				decrementing = new String[0];
				break;
			case "hang out with friends":
				incrementing = new String[]{"social"};
				decrementing = new String[]{"product"};
				break;
			case "watch netflix":
				incrementing = new String[0];
				decrementing = new String[]{"product", "gpa}"};
				break;
			case "do laundry":
				incrementing = new String[]{"product","commonSense"};
				decrementing = new String[0];
				break;
			case "clean room":
				incrementing = new String[]{"product", "commonSense"};
				decrementing = new String[]{};
				break;
			case "party":
				incrementing = new String[]{"social"};
				decrementing = new String[]{"product", "health"};
				break;
			case "workout":
				incrementing = new String[]{"athletic","health", "product"};
				decrementing = new String[]{};
				break;
			case "eat":
				incrementing = new String[]{"health"};
				decrementing = new String[]{"product"};
				break;
			case "go to c-store":
				incrementing = new String[]{};
				decrementing = new String[]{"commonSense"};
				break;
			case "shower":
				incrementing = new String[]{};
				decrementing = new String[]{};
				break;
			case "play games":
				incrementing = new String[]{"social"};
				decrementing = new String[]{"product"};
				break;
			case "go to sleep early":
				incrementing = new String[]{"health"};
				decrementing = new String[]{"social"};
				break;
			case "check social media":
				incrementing = new String[]{"social"};
				decrementing = new String[]{"product","gpa"};
			    break;
			case "call parents":
				incrementing = new String[]{};
				decrementing = new String[]{};
				break;
		    default:
		    	incrementing = new String[]{"error"};
				decrementing = new String[]{"error"};
				break;
		    
		}
		return new String[][]{new String[0],incrementing,decrementing};
	}
	
	/**
	 * Determines what the user can do based on month.
	 * @return choices the player has(4).
	 */
	public String[] getChoices(){
		String[] s=new String[4];
		for(int i= 0; i<4; i++){
			int index=(int)(Math.random()*choices.length);
			s[i]=choices[index];
			for(int c=0;c<i;c++){
				if(choices[c].equals(choices[i]))
					i--;
			}
			
		}
		return s;
	}
	
	public static void main(String[]args){
		typicalNight n=new typicalNight();
		String[] c=n.getChoices();
		for(int i=0; i<c.length; i++){
			System.out.println(" "+ c[i]+ " ");
		}
		String[][]o=n.getOutcome(c[1]);
		System.out.println("decrement:");

		for(int i=0; i<o[1].length; i++){
			System.out.println(" "+ c[i]+ " ");
		}
		System.out.println("decrement:");
		for(int i=0; i<o[2].length; i++){
			System.out.println(" "+ c[i]+ " ");
		}
	}
}
