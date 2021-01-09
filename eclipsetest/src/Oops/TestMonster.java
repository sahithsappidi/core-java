package Oops;

public class TestMonster {

	public static void main(String[] args) {
			Monster m1= new AirMonster("emo ro");
			Monster m2= new WaterMonster(" vintunnav raa");
			Monster m3= new StoneMonster(" gaddalakonda ganesh ikkada");
			
			System.out.println(m1.attack());
			System.out.println(m2.attack());
			System.out.println(m3.attack());
			
	}

}
