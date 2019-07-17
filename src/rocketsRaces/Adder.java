package rocketsRaces;

public class Adder {
	  
	private OnMathOperationPerformed onMathOperationPerformed;
	private int a, b;
	
	public Adder(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Lanza la operacion matematica, con llamada al callback al final 
	 * para notificar al lanzador de que ya se ha terminado la ejecucion
	 */
	public int sum() {
		int result = a + b;
		
		if (onMathOperationPerformed != null) {
			onMathOperationPerformed.onNumbersAdded();
		}		
		
		return result;
	}


	public OnMathOperationPerformed getOnMathOperationPerformed() {
		return onMathOperationPerformed;
	}


	public void setOnMathOperationPerformed(OnMathOperationPerformed onMathOperationPerformed) {
		this.onMathOperationPerformed = onMathOperationPerformed;
	}

}