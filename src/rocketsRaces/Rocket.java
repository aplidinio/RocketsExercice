package rocketsRaces;

import java.util.ArrayList;

public class Rocket {
	
	private String codeRocket;
	private ArrayList <Thruster> thrusters;
	
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
	
	
	

	



	
	

}
