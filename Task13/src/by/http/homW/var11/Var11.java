package by.http.homW.var11;
// �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����. 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Var11 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������� ����� ����� ������������� �����: ");
		int a = Integer.parseInt(r.readLine());
		
		int sum = 0;
		
		for(int i = 1; i <= a;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
