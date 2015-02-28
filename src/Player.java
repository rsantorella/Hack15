/**
 * 
 * Player stores the player's traits and school
 *
 */
public class Player {

	private String name;
	private int school;
	private int health;
	private int commonSense;
	private int social;
	private int product;
	private int athletic;
	private double gpa;
	
	/**
	 * 
	 * @param n the name of the player
	 * @param s the school
	 */
	public Player(String n,int s){
		setName(n);
		setSchool(s);
		setHealth(100);
		setCommonSense(50);
		setSocial(70);
		setProduct(25);
		setAthletic(80);
		setGpa(4.0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSchool() {
		return school;
	}

	public void setSchool(int school) {
		this.school = school;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getCommonSense() {
		return commonSense;
	}

	public void setCommonSense(int commonSense) {
		this.commonSense = commonSense;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getAthletic() {
		return athletic;
	}

	public void setAthletic(int athletic) {
		this.athletic = athletic;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
	
	
	
}
