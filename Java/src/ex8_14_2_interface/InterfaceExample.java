//단행본 클래스와 부록 CD 클래스를 사용하는 프로그램
package ex8_14_2_interface;
class InterfaceExample {
	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미", "베르베르");
		obj1.checkOut("수지", "2019-02-28");
		obj1.checkIn();
		
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
		obj2.checkOut("수지", "2019-02-28");
		obj2.checkIn();
	}
}
