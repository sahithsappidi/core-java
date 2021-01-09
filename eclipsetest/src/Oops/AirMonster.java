package Oops;

public class AirMonster extends Monster {
	
	public AirMonster(String name) {
		super(name);
	}
	
	
	@Override
	public  String attack() {
		return "attack from airmonster";
	}

}
