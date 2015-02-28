public class procrastiante implements RandomEvent {

    String[] event = {"You did not procrastinate on your homework!"};
    String[] incrementingTraits = {"gpa"};

    public String[][] getOutcome() {
        String[][] o = {event, new String[0], incrementingTraits};
        return o;
    }
}