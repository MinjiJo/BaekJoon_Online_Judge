//���� ������ Ŭ������ �����
//1�ܰ� - Cloneable �������̽� ����
//2�ܰ� - clone()�޼ҵ� �������̵��ϱ�
package ex13_8_clone_2;

//Cloneable �������̽��� �����Ǿ� �ִٴ� ���� Ŭ���� �ۼ��ڰ� ������ ����Ѵٴ� �ǹ�
class Rectangle implements Cloneable {
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*���� ��ȯ Ÿ��(covariant return type)-JDK1.5���� ����
	 * �������̵��� �� ���� �޼����� ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ������ ����ϴ� ���Դϴ�.
	 * ��, ��ȯ���� Object���� �ڼ� Ŭ���� Ÿ������ ������ ����մϴ�.
	 
	 * ������ : clone() ȣ�� �� �� ��ȯ�� �ʿ� �����ϴ�.(main �޼���)
	   Rectangle obj2 = (Rectangle) obj1.clone();
	   ==>	Rectangle obj2 = obj1.clone();
	 */
	
	public Rectangle clone() {//����� �� : Object�� -> Rectangle������
		try {
			//���� Ŭ������ clone �޼ҵ带 ȣ���ؼ� �� ����� ����
			return (Rectangle) super.clone(); // ����� �� : Rectangle�� ����ȯ
		}
		//���� Ŭ������ clone�޼ҵ尡 �߻��ϴ� �ͼ����� ó��
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
