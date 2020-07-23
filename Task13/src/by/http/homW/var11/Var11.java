package by.http.homW.var11;
// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа. 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Var11 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите любое целое положительное число: ");
		int a = Integer.parseInt(r.readLine());
		
		int sum = 0;
		
		for(int i = 1; i <= a;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
