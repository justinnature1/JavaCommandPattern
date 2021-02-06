package javaCommandPattern;

public class Player extends Actor {
	
	protected Attack specialAttack = new SpecialAttack();
	
	public Player(Weapon weapon) {
		this.hitPoints = this.maxHitPoints = 1000;
		this.defense = 50;
		this.name = "Player";
		this.weapon = weapon;
		this.attackCommand = new AttackCommand(normalAttack,this,null);
	}
	
	//Better implemented in another class that handles keyboard and/or mouse commands
	//These two methods on my eclipse are not brought up by my player instance in the test class.
	//These methods would be a good invoker for the player's attack command too.
	public void rightMouseClicked(){
		this.attackCommand.setAttack(specialAttack);	
	}
	
	public void leftMouseClicked(){
		this.attackCommand.setAttack(normalAttack);		
	}
	
	
}
