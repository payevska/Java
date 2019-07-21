class BoolDemo {
	public static void main(String args[]) {
		boolean b;

		b = false;
		System.out.println("Value b: " + b);

		b = true;
		System.out.println("Value b: " + b);

		/*Boolean can be used
		to control conditional instruction if*/
		if(b) {
			System.out.println("It instruction will be perform");
		}

		b = false;
		if(b) {
			System.out.println("It instruction will not be perform");
		}

		// The result of the comparison is a logical value.
		System.out.println("The result of the comparison 10 > 9: " + (10 > 9));
	}
}