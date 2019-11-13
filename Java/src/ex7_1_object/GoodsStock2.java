//�����ڸ� �߰��� GoodsStock Ŭ����

package ex7_1_object;

public class GoodsStock2 {
	public String goodsCode;	  // ��ǰ �ڵ�
	public int stockNum;		  // ��� ����
	/*
	������
		1) �ν��Ͻ��� ������ �� ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���'�Դϴ�.
		       ���� �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ�
		       ����Ǿ�� �� �۾��� ���ؼ��� ���˴ϴ�.
		2) �����ڵ� �����ε��� �����Ͽ� ���� ���� �����ڰ� ������ �� �ֽ��ϴ�.
	������ ����
		1) �������� �̸��� Ŭ������ �̸��� ���ƾ� �մϴ�.
		2) �����ڴ� ���� ���� �����ϴ�.
	 */
	
	//�Ű������� ���� ������-�⺻ ������
	//Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� ���ǵǾ� �־�� �մϴ�.(cf.�ʵ�, �޼���� ������ �� �ֵ��� static�� �پ� �մ� ���� �����ڰ� ��� ��)
	//�����ڰ� ���� ��� �ڵ����� �߰��Ǵ� �������Դϴ�.
	//�Ű������� �ִ� �����ڰ� �Ѱ��� �ۼ��� ��쿡�� �⺻ �����ڴ� �ڵ� �߰����� �ʽ��ϴ�.
	
	public GoodsStock2(String code, int num){
		goodsCode = code;
		stockNum = num;
	}
	
	public void addStock(int amount){	//��� ���Ѵ� ��ɿ�
		stockNum += amount;
	}
	
	public int subtractStock(int amount) {
		if(amount > stockNum)
			return 0;
		stockNum -= amount;
		return stockNum;
	}
}
