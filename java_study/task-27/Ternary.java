// Ternary operations
class Ternary {
	public static void main(String[] args) {
		int i, k;

		i = 10;
		k = i < 0 ? -i : i;
		System.out.print("absolutly value ");
		System.out.println(i + " equal " + k);

		i = -10;
		k = i < 0 ? -i : i;
		System.out.print("absolutly value ");
		System.out.println(i + " equal " + k);
	}
}