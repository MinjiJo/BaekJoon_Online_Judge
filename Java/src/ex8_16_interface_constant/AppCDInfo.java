package ex8_16_interface_constant;

class AppCDInfo extends CDInfo implements Lendable{
	String borrower;		//������
	String checkOutDate;	//������
	byte state;				//�������
	String writer;
	
	AppCDInfo(String registerNo, String title, String writer){
		super(registerNo, title);
		this.writer = writer;
	}
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	// �����Ѵ�.
	public void checkOut(String borrower, String date){
		if(state != STATE_NORMAL)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + title + " CD�� ����Ǿ����ϴ�.");
		System.out.println("��  ��:" + writer);
        System.out.println("������:" + borrower);
        System.out.println("������:" + date + "\n");    
	}
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public void checkIn() {		//�ݳ��Ѵ�
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}
}
