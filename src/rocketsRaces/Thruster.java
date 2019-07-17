package rocketsRaces;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thruster extends Thread implements Runnable{
	
	private int identification;
	private int maxPower;
	private int powerIncrement;
	private int currentPower;
	private Lock shutDown = new ReentrantLock();
	
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
	
	/*public Thruster givePower() {
		
		return this.setPowerIncrement(currentPower);
	}*/
		
	public void run() {
		
		shutDown.lock();
		
		try {
		
		for (int i=0; i<=10;i++) {
			
		
		currentPower+=10;
		
		if (currentPower>=this.getMaxPower()) {
			currentPower=this.getMaxPower();
		} else if (currentPower<=0) {
			currentPower=0;
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(toString());
		//givePower();
		}
		} finally {
			shutDown.unlock();
		}
		
	}

}
