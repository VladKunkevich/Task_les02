package by.http.homW.var5;
// ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������
public class Var5 {
	public static void main(String[] args) {
		int A = 10;
		int B = 5;
		int x = 11;
		int y = 6;
		int z = 6;
		
		if(x <= A && y <= B || y <= A && x <= B || x <= A && z <= B || z <= A && x <= B || z <= A && y <= B || y <= A && z <= B) {
			System.out.println("�������");
		}else {
			System.out.println("�� �������");
		}
	}
}
