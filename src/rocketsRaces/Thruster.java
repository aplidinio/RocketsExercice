package rocketsRaces;

public class Thruster {
	
	private int power;
	private int identification;
	
	public Thruster(int identification, int power) {
		
		this.power=power;
		this.identification=identification;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}

	@Override
	public String toString() {
		//return "Thruster "+this.getIdentification()+": [power= " + power + "   identification= " + identification + "] \n";
		return " " +power;
	}
	
	public int accelerate(Thruster thruster, int powerIncrement) {
		
		power+=powerIncrement;
		
		if (power>=thruster.getPower()) {
			power=thruster.getPower();
		} else if (power<=0) {
			power=0;
		}
		return power;
		
	}

}
