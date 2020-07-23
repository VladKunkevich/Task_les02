package by.http.homW.var6;
// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие
public class Var6 {
	public static void main(String[] args) {
		double a = 45;
		double b = 45;
		
		if((a + b) < 180 && a > 0 && b > 0) {
			System.out.println("Треугольник с такими углами - существует.");
		} else { 
			System.out.println("Треугольник с такими углами - не существует.");
		}
		if((a + b == 90) && a > 0 && b > 0) { 
			System.out.println("Этот треугольник будет прямоугльным.");
		}
	}
}
