package by.http.homW.var8;
// Вычислить значение функции
public class Var8 {
	public static void main(String[] args) {
		double func;
		double x = 4;
		
		if(x <= 3) {
			func = Math.pow(x, 2) - 3 * x + 9;
			System.out.println(func);
		}else if(x > 3) {
			func = 1 / (Math.pow(x, 3) + 6);
			System.out.println(func);
		}
	}
}
