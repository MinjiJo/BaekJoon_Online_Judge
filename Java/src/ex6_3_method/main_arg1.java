/*
   ������
   1. ��Ŭ�������� ���� ����
   	1) �ش� �ҽ����� Ctrl + F11
   	2) Package Explorer���� �ҽ��� ���� �� ������ ���콺 ��ư Ŭ��
   	   -> Run as -> Run Configurations
   	   -> ������ ȭ���� Arguments�� ���� ��
   	   -> Program arguments ���ڿ��� ���� �Է��մϴ�.
   	   -> �� �� �̻� ���ÿ��� blank �Ǵ� ���ͷ� �����մϴ�.
   	   
   2. cmdȯ��
   C:\workspace_java\Java_ex\bin �ؿ� 
   	��Ű�� ex6_3_method �ȿ� main_arg1.class�� �ִ� ��� ������
   	
   	ù°: �������� ����Ʈ�ڵ尡 �ִ� bin���� �����ϴ� ���
   		����) java ��Ű����, Ŭ������ ���ڰ�1, ���ڰ�2...
   		3.C:\workspace_java\JAVA_ex\bin\java ex6_3_method.main_arg1
   		*/

package ex6_3_method;

public class main_arg1 {
	/*public static void main(String[] args) {
		
		for(int i = 0; i<args.length; i++)
			System.out.println(args[i]);
		
	}*/
	
	public static void main(String v[]) {
		
		for(String a : v) {
			System.out.println(a);
		}
		
	}
}
