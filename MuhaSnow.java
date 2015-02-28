public class MuhaSnow implements RandomEvent {

    String[] event = {"Muha declares today a snow day!"};
    String[] incrementingTraits = {"social"};

    public String[] [] getOutcome() {
	String[] [] o = {event, incrementingTraits, new String[0]};
	return o;
    }	

}
