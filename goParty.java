public class goParty implements RandomEvent {

    String[] event = {"Your group partner went to a party instead of working in your project"};
    String[] decrementingTraits = {"gpa"};

    public String[][] getOutcome() {
        String[][] o = {event, new String[0], decrementingTraits};
        return o;
    }
}