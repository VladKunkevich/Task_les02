package lineapp.hw.task9;

public class Task9 {
	public static void main(String[] args) {
		double a = 1 + (Math.random()* 11);
		double b = 2 + (Math.random()* 12);
		double c = 3 + (Math.random()* 13);
		double d = 4 + (Math.random()* 14);
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " +d);
		
		double dis = ((a/c)*(b/d))-((a * b - c)/(c * d));
		System.out.printf("%.2f",dis);
	}
}
