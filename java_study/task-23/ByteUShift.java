//  unsigned right shift
class ByteUShift {
	public static void main(String args[]) {	
		char hex[] = {
			'0', '1', '2', '3', '4', '5', '6', '7', 
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' 
		};

		byte b = (byte) 0xf1; // 11110001
		System.out.println( b ); // -15
		byte c = (byte) (b >> 4); //0xff: 11111111
		System.out.println( c ); //-1
		byte d = (byte) (b >>> 4); // don't chanch: 11111111
		System.out.println( d ); //-1
		byte e = (byte) ((b & 0xff) >> 4); //0x0f: 00001111
		System.out.println( e ); // 15

		System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
		System.out.println("b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
		System.out.println("b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
		System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);

		
	}
}