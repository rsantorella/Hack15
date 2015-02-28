public class typicalNight implements Concert 
{

    String[] event = new String[] {"There's a concert tonight..."};
    String[] choices = new String[] {"attend", "study"};

    public String[][] getOutcome(String choice)
    {
	String[] incrementing;
	String[] decrementing;
	switch (choice)
	    {
	    case "attend":
		incrementing = new String[]{"social"};
		decrementing = new String[]{"product"];
		break;
	    case "study":
		incrementing = new String[]{"product", "gpa"};
		decrementing = new String[0];
		break;
	    }
	return new String[][]{new String[0], incrementing, decrementing};
    }

}
