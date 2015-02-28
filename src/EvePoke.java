
public class EvePoke implements RandomEvent {

	String[] event={"Eve pokes you on Facebook."};
	String[] incrementingTraits={"social"};
	
	public String[][] getOutcome() {
		String[][] o= {event,incrementingTraits,new String[0]};
		return o;
	}
	
	

}
