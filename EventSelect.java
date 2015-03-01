import choice.*;
import Random.*;

public class EventSelect {
    private RandomEvent[] randEvent;
    private ChoiceEvent[] choiceEvent;
    public EventSelect()
    {
         randEvent = new RandomEvent[]{new goParty(), new MuhaSnow(),new LockedOut(),new OpenDryer(),new ThemeNight(),new Manhunt(),new procrastinate(),new Wifi()};
    
	 choiceEvent = new ChoiceEvent[]{new Concert(), new typicalNight(),new prayMuha()};
    }


    public RandomEvent getRandomEvent()
    {
	int index = (int)Math.random()*randEvent.length;
	RandomEvent event = randEvent[index];
	return event;
    }

    public ChoiceEvent getChoiceEvent()
    {
	int index = (int)Math.random()*choiceEvent.length;
	ChoiceEvent event = choiceEvent[index];
	return event;
    }


public static void main(String[] args)
{
    EventSelect e=new EventSelect();

    RandomEvent event1 =  e.getRandomEvent();
    ChoiceEvent event2 = e.getChoiceEvent();

    System.out.println(event1);
    System.out.println(event2);


}
}
