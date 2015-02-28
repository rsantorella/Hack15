public class Wifi implements RandomEvents {

    String[] event = {"Oh no! The wifi isn't working!"};
    String[] decrementingTraits = {"product"};

    public String[][] getOutcome(){
	String[][] o = {event, new String[0], decrementingTraits};
	return o;
    }
}
