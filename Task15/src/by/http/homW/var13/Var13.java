package by.http.homW.var13;
// Найти НОД двух целых положительных чисел

public class Var13 {
	public static void main(String[] args){
		int a = 9;
		int b = 27;
		
		System.out.println(Factor(a, b));
	}
	
	public static int Factor(int a, int b) {
		int minAandB = Math.min(a, b);
		int maxAandB = Math.max(a, b);
		
		for(int i = minAandB;i > 0;i--) {
			if((minAandB % i == 0) && (maxAandB % i ==0)) {
				return i;
			}
		}
		return 1;
	}
}
