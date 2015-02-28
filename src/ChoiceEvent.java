/**
 * 
 * RandomEvent defines an event that can happen to a player, the choices 
 * the player can choose from, and possible outcomes of the situation.
 *
 */
public interface ChoiceEvent {
	
	/**
	 * Takes the player's choice and trait stats into account to 
	 * determine the outcome of the event.
	 * @return String[][] of the outcome of the user's choice, traits to
	 * increment and decrement
	 */
	public String[][] getOutcome(String choice);
	
	/**
	 * Determines what the user can do based on month.
	 * @return choices the player has.
	 */
	public String[] getChoices();
	 
	
}
