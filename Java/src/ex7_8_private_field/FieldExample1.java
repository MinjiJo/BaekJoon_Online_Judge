//Circle Ŭ���� �ȿ� ����� �ʵ带 ����ϴ� ���α׷�
//������ ���� : ��ü�� ������Ҹ� �ܺηκ��� ���ߴ� ���
package ex7_8_private_field;

import java.util.Scanner;

public class FieldExample1 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���>");
		double input = sc.nextInt();
		
		Circle obj = new Circle(input);
		double area = obj.getArea();
		System.out.println("���� ������ = " + obj.getRadius());
		System.out.println("���� ���� = " + area);
		sc.close();
	}
}
