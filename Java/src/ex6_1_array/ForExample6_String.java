package ex6_1_array;

public class ForExample6_String {
	public static void main(String[] args) {
		String[] name = {"ȫ�浿","�̼���","�������"};
		
		//Ȯ�� for�� (jdk 1.5�̻�)
		for(String na : name) { //name�� ù ��° �� ������ ���ʴ�� na ������ �����մϴ�.
			System.out.println(na);
		}
		
		//����for��
		for(int i=0;i<name.length;i++)
			System.out.println(name[i]);
	}
}
