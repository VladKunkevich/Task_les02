package by.http.homW.var12;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// Требуется определить факториал числа, которое ввел пользователь
public class Var12 {
	static int CalcFactorial(int n) {
		int result = 1;
		for(int i = 1;i <= n;i++) {
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите число: ");
		int n = Integer.parseInt(r.readLine());
		System.out.println(CalcFactorial(n));
	}
}
