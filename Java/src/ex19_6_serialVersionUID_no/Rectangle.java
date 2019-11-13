//���� �簢�� Ŭ������ �޼ҵ带 �߰��� ���
//���� �߻� : ����ȭ�� �� ����� Ŭ������
//������ȭ�� �� ����� Ŭ������ ������ �ٸ��� ����
package ex19_6_serialVersionUID_no;
class Rectangle implements java.io.Serializable {
	private static final long serialVersionUID = -3177450505124451093L;
	//private static final long serialVersionUID = 1L;
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	/*������
	//
	 * 1. �Ʒ� getArea �޼ҵ��� �ּ��� �ް� ������ ��쿡�� ���� ����
	 	ObjectOutputExample.java�� ����
	 	ObjectInputExample.java ����
	 * 2. �Ʒ� �޼ҵ��� �ּ��� Ǭ �� - ���� �߻�
	     ObjectInputExample.jva ����
	     
	     serialVersionUID�� ���� Ŭ�������� �˷��ִ� �ĺ��� ������ �ϸ�
	     Serializable �������̽��� ������ Ŭ������ �������ϸ� �ڵ�������
	     serialVersionUID ���� �ʵ尡 �߰��˴ϴ�.
	     
	     serialVersionUID�� �ڹ��� ����ȭ ��Ŀ����� ������ȭ ��Ŀ������ ����� ��
	     �ڵ����� �ο��Ǵµ� ����ȭ ���� Ŭ������ ������ �״���̸� ���� ��ȣ�� �ο��ǰ�
	     Ŭ������ ������Ұ� �ϳ��� �ٲ�� ������ �ٸ� serialVersionUID�� �ο��˴ϴ�.
	     
	     ������ ��������� Ŭ������ serialVersionUID�� ����Ǿ� ������
	     ������ �� �߰� ���� �ʱ� ������ ������ ���� ������ �� �ֽ��ϴ�.
	 */

	int getArea() {
		return width * height;
	}

}
