package rocketsRaces;

public class SuperAdder {
	  
	public static void main(String[] args) {
		
		// Probamos primero sin meter un callback
		
		System.out.println(" --- Operation ");
		
		Adder adder = new Adder(127, 326);
		int result = adder.sum();
		
		System.out.println("Operation 127 + 326, result is "+result);
		
		System.out.println(" --- ");
		
		// Probamos ahora con callback
		System.out.println(" --- Operation ");

		Adder adder2 = new Adder(563, 646);
		adder2.setOnMathOperationPerformed(new OnMathOperationPerformed() {
			
			@Override
			public void onNumbersAdded() {
				System.out.println("Numbers added! This is a callback.");
			}
		});
		
		int result2 = adder2.sum();
		
		System.out.println("Operation 563 + 646, result is "+result2);
		System.out.println(" --- ");
	}

}