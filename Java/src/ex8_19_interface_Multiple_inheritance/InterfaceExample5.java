package ex8_19_interface_Multiple_inheritance;

class InterfaceExample5 {

	public static void main(String args[]) {
		Label obj = new Label("�ȳ��ϼ���", 100, 30, "yellow", "green", "����ü");
		
		printLable(obj);
		obj.resize(200, 70);
		obj.setForeground("black");
		obj.setBackground("white");
		obj.setFont("�ü�ü");
		printLable(obj);
	}
	
	static void printLable(Label obj) {
		System.out.printf("%s: %d x %d ����(%s) �����(%s) ��Ʈ(%s)\n",
	obj.text, obj.width, obj.height, obj.foreground, obj.background, obj.font);
	}
}
