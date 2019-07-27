// вычислить площадь круга

class Area {
	public static void main(String args[]) {
		double pi, r, a;

		r = 10.8;       // радиус окружности
		pi = 3.1416;   // приблезительное значение числа пи
		a = pi * r * r; // вычисление площади круга

		System.out.println("Площадь круга равна " + a);
	}
}