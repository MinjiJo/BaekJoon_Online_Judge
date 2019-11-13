package ex8_19_interface_Multiple_inheritance;

class InterfaceExample5 {

	public static void main(String args[]) {
		Label obj = new Label("안녕하세요", 100, 30, "yellow", "green", "굴림체");
		
		printLable(obj);
		obj.resize(200, 70);
		obj.setForeground("black");
		obj.setBackground("white");
		obj.setFont("궁서체");
		printLable(obj);
	}
	
	static void printLable(Label obj) {
		System.out.printf("%s: %d x %d 배경색(%s) 전경색(%s) 폰트(%s)\n",
	obj.text, obj.width, obj.height, obj.foreground, obj.background, obj.font);
	}
}
