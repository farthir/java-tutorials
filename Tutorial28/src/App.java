
public class App {

	public static void main(String[] args) {
		int intValue = 888;
		short shortValue = 55;
		byte byteValue = 20;
		long longValue = 28272;
		
		float floatValue = 8834.8f;
		float floatValue2 = (float)99.3;
		double doubleValue = 87.38383;
		
		System.out.println(Byte.MAX_VALUE);
		
		//Casting - won't work
		//intValue = longValue;
		
		//correct way to cast if you want to override Java checks
		int intValue2 = (int)longValue;
		
		System.out.println(intValue2);
		
		//this works
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		//not rounding
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//correctly rounding
		intValue = Math.round(floatValue);
		System.out.println(intValue);
		
		//loops around as byte only up to 127
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}
}
