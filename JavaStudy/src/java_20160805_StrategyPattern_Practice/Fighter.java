package java_20160805_StrategyPattern_Practice;

public abstract class Fighter {
	
	Fly fly;
	AttackMissile attackMissile;
	AttackHandToHand attackHandToHand;
	Defence defence;
	
	// variable
	public static int health;
	public static int mana;
	public static int offensivePower;
	public static int defensivePower;
	
	// constructor
	public Fighter() {
		
	}
	
	// setter
	public void setFly(Fly fly){
		this.fly = fly;
	}
	
	public void setAttackMissile(AttackMissile attackMissile){
		this.attackMissile = attackMissile;
	}
	
	public void setAttackHandToHand(AttackHandToHand attackHandToHand){
		this.attackHandToHand = attackHandToHand;
	}
	
	public void setDefence(Defence defence){
		this.defence = defence;
	}
	
	// method
	// special method
	public void fly(){
		this.fly.fly();
	}
	
	public void attackMissile(){
		this.attackMissile.attackMissile();
	}
	
	public void attackHandToHand(){
		this.attackHandToHand.attackHand();
	}
	
	public void defence(){
		this.defence.defence();
	}
	
	// common method
	public abstract void identity();
	public abstract void goToField();
	
}
