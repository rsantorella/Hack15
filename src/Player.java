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

	public void updateStats(String[]increment,String[] decrement){
		for(int i=0; i<increment;i++){
			String trait=increment[i];
			if(trait.equals("health"))
				health+=5;
			else if(trait.equals("commonSense")){
				commonSense+=5;
			}
			else if(trait.equals("social")){
				social+=5;
			}else if(trait.equals("product")){
				product+=5;
			}else if(trait.equals("athletic")){
				athletic+=5;
			}else if(trait.equals("gpa")){
				if(gpa<4.0)
					gpa+=0.1;
			}else
				//error
		}
		
		for(int i=0; i<decrement;i++){
			String trait=decrement[i];
			if(trait.equals("health"))
				health-=5;
			else if(trait.equals("commonSense")){
				commonSense-=5;
			}
			else if(trait.equals("social")){
				social-=5;
			}else if(trait.equals("product")){
				product-=5;
			}else if(trait.equals("athletic")){
				athletic-=5;
			}else if(trait.equals("gpa")){
				if(gpa>0.0)
					gpa-=0.1;
			}else
				//error
		}
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
