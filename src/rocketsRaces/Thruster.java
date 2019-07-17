package rocketsRaces;

public class Thruster extends Thread implements Runnable{
	
	private int identification;
	private int maxPower;
	private int powerIncrement;
	private int currentPower;
	//private Thruster engine;
	
	public Thruster(int identification, int maxPower, int powerIncrement) {
		
		this.maxPower=maxPower;
		this.identification=identification;
		this.powerIncrement=powerIncrement;
	}
	
	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}

	public int getPowerIncrement() {
		return powerIncrement;
	}

	public void setPowerIncrement(int powerIncrement) {
		this.powerIncrement = powerIncrement;

	}

	
	@Override
	public String toString() {
		/*return "Thruster [maxPower=" + maxPower + ", identification=" + identification + ", powerIncrement="
				+ powerIncrement + "]";*/
		return "  " + identification + ":  " + currentPower;
	}
		
	public void run() {
		
		for (int i=0; i<=100;i+=10) {
			
		
		currentPower+=i;
		
		if (currentPower>=this.getMaxPower()) {
			currentPower=this.getMaxPower();
		} else if (currentPower<=0) {
			currentPower=0;
		}
		
		try {
			sleep(40);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		toString();
		}
		
	}

}
