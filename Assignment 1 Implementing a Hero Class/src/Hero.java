
public class Hero {
//PRIVATE VARIABLES ##################################################################
	private int strength,speed,health;
	
//PUBLIC VARIABLES ##################################################################
	public String name;
	
//CONSTRUCTOR ########################################################################
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}
//PRIVATE METHODS ####################################################################
	//creates each Hero's ability variables randomly between 1 and 100
	private void generateAbilities(){
		this.strength = (int) (Math.random()*100+1);
		this.speed = (int) (Math.random()*100+1);
		this.health = (int) (Math.random()*100+1);
	}
	//randomly returns whether or not a hit was landed based on Hero's chance to hit
	private boolean hitAttempt(){
		int hitChance = 2; // chance that lands a hit out of a value of 10
		int checkHitSuccess = (int) (Math.random()*10 +1);
		if (checkHitSuccess > hitChance){
			return false;
		}
			else{return true;}
	}
	//method that calculates the damage a Hero deals based on their strength added to a random number
	private int hitDamage(){
		int dmgBonus = (int)(Math.random()*6 +1);
		int dmgDealt = this.strength + dmgBonus;
		return dmgDealt;
	}
	
//PUBLIC METHODS ######################################################################
	//method that prints to console if Hero misses an attack or how much damage he deals on a succesful attack
	public void fight(){
		if(hitAttempt()){
			System.out.println(this.name + " succesfully hit for " + hitDamage() + " damage");
		}
		else{System.out.println(this.name + " missed the attack");}
	}
	//prints to the console the Hero's ability values
	public void show(){
		System.out.println(this.name +"'s abilites are \n Strength: " + this.strength + "\n Speed: " +this.speed + "\n Health: " + this.health);
	}
}//END class
