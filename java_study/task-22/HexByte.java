// Right shift of the bits
class HexByte {
	public static void main(String args[]) {	
		char hex[] = {
			'0', '1', '2', '3', '4', '5', '6', '7', 
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' 
		};

		byte b = (byte) 0xf1; // 11110001
		System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);


		// Division by 2.
		int num = 32; 		
		num = num >> 2;
			System.out.println(num); 		
	}
}