// demonstrates the modulus operator.
class Modulus {
	public static void main(String args[]) {
		int x = 42;
		double y = 42.25;

		System.out.println("x mod 10 = " + x % 10);
		System.out.println("x mod 10 = " + y % 10);

		int iresult, irem;
		double dresult, drem;

		iresult = 10 / 3;
		irem = 10 % 3;
		dresult = 10.0 / 3.0;
		drem = 10.0 % 3.0;

		System.out.println("Result and remainder of 10 / 3: " + 
			iresult +  " " + irem);
		System.out.println("Result and remainder of 10.0 / 3.0: " + 
			dresult +  " " + drem);
	}
}