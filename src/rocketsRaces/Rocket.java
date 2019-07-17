package rocketsRaces;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Rocket extends Thread implements Runnable{
	
	private String codeRocket;
	private ArrayList <Thruster> thrusters= new ArrayList<Thruster>();
	private Lock shutDown = new ReentrantLock();
	
	public Rocket(String codeRocket, ArrayList<Thruster> thrusters) {
		
		this.codeRocket=codeRocket;
		this.thrusters=thrusters;		
	}

	public String getCodeRocket() {
		return codeRocket;
	}

	public void setCodeRocket(String codeRocket) {
		this.codeRocket = codeRocket;
	}

	public ArrayList<Thruster> getThrusters() {
		return thrusters;
	}

	public void setThrusters(ArrayList<Thruster> thrusters) {
		this.thrusters = thrusters;
	}
	
	public void showAllThrustersData() {
		for (Thruster thruster : this.getThrusters()) {
			thruster.toString();
		}
	}
	
	@Override
	public String toString() {
		return "Rocket [codeRocket=" + this.getCodeRocket() + " thrusters=" + this.getThrusters().size() + "]";
	}
	
	public void run() {
		
		shutDown.lock();
		
		for(int i=0; i<thrusters.size(); i++) {
			
			thrusters.get(i).start();
		}

		
			
			/*for(int j=0; j<thrusters.size(); j++) {
				
				thrusters.get(j).getPowerIncrement();
				System.out.println("**************");
				try {
					sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			

		}*/
		shutDown.unlock();
	}
	
	
	

	



	
	

}
