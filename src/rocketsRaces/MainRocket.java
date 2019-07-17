package rocketsRaces;

import java.util.ArrayList;

public class MainRocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Thruster> thrustersRocket1=new ArrayList<Thruster>();
		Thruster t1R1= new Thruster (1,10, 0);
		Thruster t2R1= new Thruster (2,30, 0);
		Thruster t3R1= new Thruster (3,80, 0);

		thrustersRocket1.add(t1R1);
		thrustersRocket1.add(t2R1);
		thrustersRocket1.add(t3R1);
		
		ArrayList <Thruster> thrustersRocket2=new ArrayList<Thruster>();
		Thruster t1R2= new Thruster (1,30, 0);
		Thruster t2R2= new Thruster (2,40, 0);
		Thruster t3R2= new Thruster (3,50, 0);
		Thruster t4R2= new Thruster (4,50, 0);
		Thruster t5R2= new Thruster (5,30, 0);
		Thruster t6R2= new Thruster (6,10, 0);

		thrustersRocket2.add(t1R2);
		thrustersRocket2.add(t2R2);
		thrustersRocket2.add(t3R2);
		thrustersRocket2.add(t4R2);
		thrustersRocket2.add(t5R2);
		thrustersRocket2.add(t6R2);
		
		Rocket rocket1 = new Rocket ("32WESSDS", thrustersRocket1);
		Rocket rocket2 = new Rocket ("LDSFJA32", thrustersRocket2);
		
		rocket1.showAllThrustersData();
		rocket2.showAllThrustersData();

		
		System.out.println("Rocket " + rocket1.getCodeRocket() + " has " + rocket1.getThrusters().size() + " trusters. \n" + "Power: " + rocket1.getThrusters().toString());
		System.out.println("");
		System.out.println("Rocket " + rocket2.getCodeRocket() + " has " + rocket2.getThrusters().size() + " trusters. \n" + "Power: " + rocket2.getThrusters().toString());

		rocket1.start();
	}

}
