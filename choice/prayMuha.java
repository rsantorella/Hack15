public class prayMuha implements Choice Event
{

    Sptring[] event = new String[] {"You have a paper due tomorrow morning..."};
    String[] choices = new String[] {"Pray to Muha and sleep", "Pull an all-nighter and finish it"};

    public String[][] getOutcome(String choice)
    {
	String[] output;
	String[] incrementing;
	String[] decrementing;
	switch(choice)
	    {
	    case "Pray to Muha and sleep":
		output = new String[]{"Muha has smiled upon you - classes are cancelled"};
		incrementing = new String[]{"health"};
		decrementing = new String[]{"product", "commonSense"};
		break;
	    case "Pull an all-nighter and finish it":
		output = new String[]{"You finish the paper, but classes were cancelled."};
		incrementing = new String[0];
		decrementing = new String[]{"health"};
		break;
	    }
	return new String[][]{output,incrementing,decrementing};
    }
}
