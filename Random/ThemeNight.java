public class ThemeNight implements RandomEvent {

    String[] event = {"There's a theme night in Eick! You eat a lot of food."};
    String[] decrementingTraits = {"health"};

    public String[][] getOutcome {
	String[][] o = {event, new String[0], decrementingTraits};
	return o;
    }

}
