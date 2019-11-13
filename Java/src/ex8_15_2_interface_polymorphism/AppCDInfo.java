package ex8_15_2_interface_polymorphism;

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
		if(state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + title + " CD�� ����Ǿ����ϴ�.");
		System.out.println("��  ��:" + writer);
        System.out.println("������:" + borrower);
        System.out.println("������:" + date + "\n");    
	}
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public void checkIn() {		//�ݳ��Ѵ�
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}
}
