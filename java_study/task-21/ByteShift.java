// Left shift of the bits
class ByteShift {
	public static void main(String args[]) {
		byte a = 64, b;
		int i;

		i = a << 2;
		b = (byte) (a << 2);

		System.out.println("first value a: " + a); // 64
		System.out.println("i and b: " + i + " " + b); // 256 0

		// demonstration multiply value by 2
		int j;
		int num = 0xFFFFFFE; // 0000 1111 1111 1111 1111 1111 1111 1110

		for(j = 0; j < 4; j++) {
			num = num << 1;
			System.out.println(num); // j thirth -32: 0001 1111 1111 1111 1111 1111 1111 1100
		}
	}
}