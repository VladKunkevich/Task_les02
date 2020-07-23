package by.http.homW.var1;
//  Вычислить значение выражения по формуле (все переменные принимают действительные значения)
public class Var1 {
	public static void main(String[] args) {
		double a = 10;
		double b = 6;
		double c = 7;
		
		double design = ((b + (Math.sqrt((Math.pow(b, 2)) + 4 * a * c))/2 * a) - ((Math.pow(a, 3)) * c + (Math.pow(b, -2))));
		System.out.println(design);
	}
}