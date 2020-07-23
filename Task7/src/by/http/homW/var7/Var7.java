package by.http.homW.var7;
//  Подсчитать количество отрицательных среди чисел а, b, с. 
public class Var7 {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 1;
		
		if(a <= 0 && b <= 0 && c <= 0) {
			System.out.println("три отрицательных числа");
		}else if(a >= 0 && b <= 0 && c <= 0) {
			System.out.println("два отрицательных числа");
		}else if(a >= 0 && b >= 0 && c <=0){
			System.out.println("одно отрицательное число");
		}else {
			System.out.println("нет отрицательных чисел");
		}
	}
}
