public class OpenDryer implements RandomEvent {

    String[] event = {"There is an open dryer in the laundry room!"};
    String[] incrementingTraits = {"product", "commonSense"};

    public String[][] getOutcome() {
	String[][] o = {event, incrementingTraits, new String[0]};
	return o;
    }

}
