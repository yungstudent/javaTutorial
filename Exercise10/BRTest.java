public class BRTest {

	private int totalReturned = 0;
	private int calls = 0;
	private int successfulCalls = 0;
	private int[] excepCounts = new int[5];

	private final static int ARITHMETICEXCEPTION = 0;
	private final static int NULLPOINTEREXCEPTION = 1;
	private final static int ARRAYINDEXOUTOFBOUNDSEXCEPTION = 2; 
	private final static int CLASSCASTEXCEPTION = 3;
	private final static int NEGATIVEARRAYSIZEEXCEPTION = 4;
	
	public void callIt () { 
		calls++;
		try {
			totalReturned += BadRandom.randVal(); 
			successfulCalls++;
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			excepCounts[ARITHMETICEXCEPTION]++; 
		}
		catch (NullPointerException e) { 
			System.out.println(e.getMessage()); 
			excepCounts[NULLPOINTEREXCEPTION]++;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			excepCounts[ARRAYINDEXOUTOFBOUNDSEXCEPTION]++; 
		}
		catch (ClassCastException e) { 
			System.out.println(e.getMessage()); 
			excepCounts[CLASSCASTEXCEPTION]++;
		}
		catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
			excepCounts[NEGATIVEARRAYSIZEEXCEPTION]++; 
		}
	}

	public void resetCounts () { calls = 0;
		totalReturned = 0;
		successfulCalls = 0;
		for (int i = 0; i < 5; i++){
			excepCounts[i] = 0;
		}
	}

	public void nRandInts (int n) { 
		while (successfulCalls < n) {
			callIt(); 
		}
	}
	
	public void writeData () { 
		System.out.println("\n\n=========================================="); 
		System.out.println("Number of calls: " + calls); 
		System.out.println("Successful calls: " + successfulCalls); 
		System.out.println("Total returned: " + totalReturned); 
		System.out.println("Percentage Arithmetic Exceptions: " +
			((float) excepCounts[ARITHMETICEXCEPTION]/calls*100)); 
		System.out.println("Percentage Null Pointer Exceptions: " +
			((float) excepCounts[NULLPOINTEREXCEPTION]/calls*100)); 
		System.out.println("Percentage Array Index Exceptions: " +
			((float) excepCounts[ARRAYINDEXOUTOFBOUNDSEXCEPTION]/calls*100)); 
		System.out.println("Percentage Class Cast Exceptions: " +
			((float) excepCounts[CLASSCASTEXCEPTION]/calls*100)); 
		System.out.println("Percentage Negative Array Exceptions: " +
			((float) excepCounts[NEGATIVEARRAYSIZEEXCEPTION]/calls*100));
		System.out.println("Percentage of successful calls: " + ((float) successfulCalls/calls*100));
		System.out.println("==========================================\n\n"); 
	}

	public static void main (String[] args) { 
		BRTest me = new BRTest(); 
		me.resetCounts();
		me.nRandInts(30);
		me.writeData(); 
	}
}
