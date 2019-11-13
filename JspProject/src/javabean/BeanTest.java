package javabean;
/*
 * �ڹٺ�(JavaBeen)�� �ڹٺ� �Ծ࿡ ���� �ۼ��� �ڹ� Ŭ�����Դϴ�.
 * ���� ��� ȸ�� ����, �Խ��� �� ���� ������ ����� �� ������ �����ϰ� �ִ�
      �ڹٺ� ��ü�� ����ϰ� �˴ϴ�. 
 * ������ �ڹٺ��� �Ծ��Դϴ�.
  1. �ʵ� ���� ������ get/set �޼��尡 �����ؾ� �Ѵ�.
  2. get �޼���� �Ķ���Ͱ� �������� �ʾƾ� �Ѵ�.
  3. set �޼ҵ�� �ݵ�� �ϳ� �̻��� �Ķ���Ͱ� �����ؾ� �Ѵ�.
  4. ���� ������Ʈ�� �Ӽ��� �ݵ�� �б� �Ǵ� ���Ⱑ �����ؾ� �Ѵ�.
           ��, �б� ������ ��� get �Ǵ� is �޼��常 ������ �� �ִ�.
  5. �����ڴ� �Ķ���Ͱ� ���� �⺻ �����ڸ� �ݵ�� �ۼ��� �־�� �Ѵ�.
  6. �ʵ��� ���� �����ڴ� private�̰� �� set/get �޼����� ���� �����ڴ�
  	 public���� ���ǵǾ�� �ϸ� Ŭ������ ���� �����ڴ� public���� �����Ѵ�.
  
  * �ڹٺ� Ŭ������ �����͸� �����ϴ� �ʵ�, �����͸� �о�� �� ���Ǵ� �޼���,
         ���� ������ �� ���Ǵ� �޼���� �����˴ϴ�.
         ������Ƽ(property)�� �ڹٺ� ����Ǿ� �ִ� ���� ��Ÿ����
         �޼��� �̸��� ����ؼ� ������Ƽ(property)�� �̸��� �����ϰ� �˴ϴ�.
         
         ���� ��� ������Ƽ�� �̸��� name�̰� ���� Ÿ���� int�� ���
         ������Ƽ�� ���õ� �޼����� �̸��� ������ ���� �����˴ϴ�.
    public void setName(int value);
    public int getName();
    
         ������Ƽ�� Ÿ���� boolean�� ��� get��� is�� ���� �� �ֽ��ϴ�.
         
         ��, ������Ƽ�� ���� �����ϴ� �޼����� ��� ������Ƽ�� �̸� �� ù ���ڸ� �빮�ڷ�
         ��ȯ�� ���ڿ� �տ� set�� ���̰�
         ������Ƽ�� ���� �о���� �޼����� ��� ������Ƽ�� �̸� �� ù ���ڸ�
         �빮�ڷ� ��ȯ�� ���ڿ� �տ� get�� ���Դϴ�.
         ������Ƽ�� �̸��� �ʵ��� �̸��� ���� �ʾƵ� �˴ϴ�.
         
         ���� ��� name ������Ƽ�� ���� ������ �����ϴ� �ʵ尡 _name�� ���
         private String _name;
         
         public String getName() {
         	return _name;
         }
         
         public void setName(String name) {
         	_name = name;
         }
  */
public class BeanTest {
	//���� �����ϴ� �ʵ�
	//private String name="honggildong";
	private String name="ȫ�浿";
	
	//�⺻ ������
	public BeanTest() {}
	
	//�ʵ��� ���� �о���� �޼���
	public String getName() {
		return name;
	}
	
	//�ʵ��� ���� �����ϴ� �޼���
	public void setName(String name) {
		this.name = name;
	}
}