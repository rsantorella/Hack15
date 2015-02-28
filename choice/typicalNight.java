import java.util.random
public class typicalNight implements ChoiceEvent{
	
	String[]event={"It is a typical week-night..."}
	String[]choices{"study", "hang out with friends",
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
				incrementing = {"product", "gpa"};
				decrementing = [0];
				break;
			case "hang out with friends":
				incrementing = {"social"};
				decrementing = {"product"};
				break;
			case "watch netflix":
				incrementing = [0];
				decrementing = {"product", "gpa}"}
				break;
			case "do laundry":
				incrementing = {"product","commonSense"};
				decrementing = [0];
				break;
			case "clean room":
				incrementing = {"product", "commonSense"};
				decrementing = {};
				break;
			case "party":
				incrementing = {"social"};
				decrementing = {"product", "health"};
				break;
			case "workout":
				incrementing = {"athletic","health", "product"};
				decrementing = {};
				break;
			case "eat":
				incrementing = {"health"};
				decrementing = {"product"};
				break;
			case "go to c-store":
				incrementing = {};
				decrementing = {"commonSense"};
				break;
			case "shower":
				incrementing = {};
				decrementing = {};
				break;
			case "play games":
				incrementing = {"social"};
				decrementing = {"product"};
				break;
			case "go to sleep early":
				incrementing = {"health"}
				decrementing = {"social"};
				break;
			case "check social media":
				incrementing = {"social"};
				decrementing = {"product","gpa"};
			    break;
			case "call parents":
				incrementing = {};
				decrementing = {};
				break;
		    default:
		    	incrementing = {"error"};
				decrementing = {"error"};
				break;
		    
		}
		return {new String[0],incrementing,decrementing};
	}
	
	/**
	 * Determines what the user can do based on month.
	 * @return choices the player has(4).
	 */
	public String[] getChoices(){
		String[] s=new String[4];
		for(int i= 0; i<4; i++){
			int index=Math.random()*choices.length;
			s[i]=choices[index];
			for(int c=0;c<i;c++){
				if(choices[c].equals(choices[i]))
					i--;
			}
			
		}
		return s;
	}
	
	public static void main(String[]args){
		String[] c=getChoices();
		for(int i=0; i<c.length(); i++){
			System.out.println(" "+ c[i]+ " ");
		}
		String[][]o=getOutcome(c[1]);
		System.out.println("decrement:");

		for(int i=0; i<o[1].length(); i++){
			System.out.println(" "+ c[i]+ " ");
		}
		System.out.println("decrement:");
		for(int i=0; i<o[2].length(); i++){
			System.out.println(" "+ c[i]+ " ");
		}
	}
}
