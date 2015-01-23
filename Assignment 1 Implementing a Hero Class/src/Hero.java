
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
	private void generateAbilities(){
		this.strength = (int) (Math.random()*100+1);
		this.speed = (int) (Math.random()*100+1);
		this.health = (int) (Math.random()*100+1);
	}
	private boolean hitAttempt(){
		int hitChance = 2;
		int checkHitSuccess = (int) (Math.random()*10 +1);
		if (checkHitSuccess > hitChance){
			return false;
		}
			else{return true;}
	}
	private int hitDamage(){
		int dmgBonus = (int)(Math.random()*6 +1);
		int dmgDealt = this.strength + dmgBonus;
		return dmgDealt;
	}
	
//PUBLIC METHODS ######################################################################
	public void fight(){
		if(hitAttempt()){
			System.out.println(this.name + " succesfully hit for " + hitDamage() + " damage");
		}
		else{System.out.println(this.name + " missed the attack");}
	}
	public void show(){
		System.out.println(this.name +"'s abilites are \n Strength: " + this.strength + "\n Speed: " +this.speed + "\n Health: " + this.health);
	}
}//END class
