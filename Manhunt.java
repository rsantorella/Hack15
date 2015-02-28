public class Manhunt implements RandomEvent {

    String[] event = {"You are chased by a zombie during Humans vs. Zombies"};
    String[] incrementingTraits = {"health"};

    public String[][] getOutcome(){
	String[][] o = {event, incrementingTraits, new String[0]};
	return o;
    }
}
