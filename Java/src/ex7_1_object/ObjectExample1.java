//StringBuffer��ü�� �����ϰ� ����ϴ� ���α׷�
package ex7_1_object;

public class ObjectExample1 {
	public static void main(String args[]) {
		StringBuffer obj;						//���� ����
		obj = new StringBuffer("Hey, Java");	//��ü ����
		obj.deleteCharAt(1);	// Hy, Java
		System.out.println(obj);
		
		obj.deleteCharAt(1);	// H, Java
		System.out.println(obj);
		
		obj.insert(1, 'i');	//	Hi, Java
		System.out.println(obj);//StringBuffer ��ü�� �Ѱ� �� �� �ֽ��ϴ�.
	}
}
