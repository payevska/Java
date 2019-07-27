/*вычисление расстояние, проходимое светом, 
исспользуя переменные типа long*/

class Light {
	public static void main(String args[]) {
		int lightspeed;
		long days;
		long seconds;
		long distance;

		// приблезительная скорость света, миль в секунду
		lightspeed = 186000;

		days = 1000;//указать количество дней

		seconds = days * 24 * 60 * 60; // преобразовать в секунды

		distance = lightspeed * seconds; // вычеслить расстояние

		System.out.print("За " + days);
		System.out.print(" дней свет пройдет около ");
		System.out.println(distance + " миль.");
	}
}