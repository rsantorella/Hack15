public class LockedOut implements RandomEvent {

    String[] event = {"You accidentally forget your key, and you are locked out of your room!"};
    String[] decrementingTraits = {"product"};

    public String[][] getOutcome() {
	String[][] o = {event, new String[0], decrementingTraits};
	return o;
    }
}
