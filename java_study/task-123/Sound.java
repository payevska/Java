/*
Calculation of the distance to the place of the flash of lightning, the sound of which
comes to the observer in 7.2 seconds
*/

class Sound {
	public static void main(String args[]) {
		double dist;

		dist = 1100 * 7.2;

		System.out.println("The distance to the place of the flash of lightning " 
			              + "is " + dist + " feet");

		double distEcho;

		distEcho = (1100 * 7.2) / 2;
		System.out.println("Distance to echo point " 
			              + "is " + distEcho + " feet");
	}
}