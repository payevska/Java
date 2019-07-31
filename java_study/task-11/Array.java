// Demonstrate a one-dimensional array.

class Array {
	public static void main(String args[]) {

		/*
		int month_days[];
		month_days = new int[12];
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 30;
		month_days[8] = 31;
		month_days[9] = 30;
		month_days[10] = 31;
		month_days[11] = 31;
		System.out.println("In April " + month_days[3] +  " days.");
		*/

		//int month_days[] = new int[12];

		/*
		int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31};	
		System.out.println("In April " + month_days[3] +  " days.");
		*/	

		int sample[] = new int[10];
		int i;

		for(i = 0; i < 10; i = i+1)	
			sample[i] = i;

		for(i = 0; i < 10; i = i+1)
			System.out.println("This is sample[" + i + "]: " + sample[i]);	
	}
}