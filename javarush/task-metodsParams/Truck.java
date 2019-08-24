public class Truck {
	int length;
	int width;
	int height;

	int weight;

	public int getVolume() {
		int volume = length * width * height;
		return volume;
	}

	public static class BridgeOfficer {

		int maxWeight;

		public BridgeOfficer(int normalVolume) {
			this.maxWeight = normalVolume;
		}

		public boolean checkTruck(Truck truck) {
			if (truck.weight > maxWeight) {
				return false;		
			} else {
				return true;
			}
		}
	}	

	public static void main(String[] args) {
		Truck first = new Truck();
		first.weight = 10000;
		Truck second = new Truck();
		second.weight = 20000;

		BridgeOfficer officer = new BridgeOfficer(15000);
		System.out.println("Truck number 1! Can I go, officer?");
		//call method checkTruck
		boolean canFirstTruckGo = officer.checkTruck(first); //true
		System.out.println(canFirstTruckGo);

		System.out.println();

		System.out.println("Truck number 2! Can I go too?");
		//call method checkTruck
		boolean canSecondTruckGo = officer.checkTruck(second); //false
		System.out.println(canSecondTruckGo);

	}
}
