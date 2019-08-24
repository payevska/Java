public class Artifact {
	int century;
	String culture;
	static int  count = 212121;

	public Artifact() {	
		this.century;	
		this.culture = "unknoun";
	}

	public Artifact(String culture) {		
		this.culture = culture;		
	}

	public Artifact(int century, String culture) {
		this.century = century;
		this.culture = culture;
	}

	public static void main(String[] args) {
		Artifact artifact1 = new Artifact();
		Artifact artifact2 = new Artifact("Aztecs");
		Artifact artifact3 = new Artifact(12, "Aztecs");
		System.out.println(count + " " + artifact1.century + " " + artifact1.culture);
		System.out.println(count + " " + artifact2.century + " " + artifact2.culture);
		System.out.println(count + " " + artifact3.century + " " + artifact3.culture);
		
	}
}
