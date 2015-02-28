public class typicalNight implements Concert 
{

    String[] event = new String[] {"There's a concert tonight..."};
    String[] choices = new String[] {"attend", "study"};

    public String[][] getOutcome(String choice)
    {
	String[] output;
	String[] incrementing;
	String[] decrementing;
	switch (choice)
	    {
	    case "attend":
		output = new String[]{"You attend the concert and have a great time!"};
		incrementing = new String[]{"social"};
		decrementing = new String[]{"product"];
		break;
	    case "study":
		output = new String[]{"You spend your night studying and ace your test the next day!"};
		incrementing = new String[]{"product", "gpa"};
		decrementing = new String[0];
		break;
	    }
	return new String[][]{output, incrementing, decrementing};
    }

}
