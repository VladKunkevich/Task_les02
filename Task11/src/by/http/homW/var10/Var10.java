package by.http.homW.var10;
//  Вычислить значения функции на отрезке [а,b] c шагом h: 
public class Var10 {
	public static void main(String[] args) {
		int a = 0;
		int b = 5;
		
		double y = 12.0;
		double x = 9.0;
		double dx = 0.5;
		
		for(x=a;x<=b-dx;x+=dx) {
			System.out.println("x = " + x + ",");
			if(x<0.5) {
				y = Math.sqrt(x) * dx;
				System.out.println("y = " + y);
			}else if(x>=0) {
				y = Math.exp(x);
				System.out.println("y = " + y);
			}
		}
	}
}
