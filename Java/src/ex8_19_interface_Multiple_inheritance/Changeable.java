package ex8_19_interface_Multiple_inheritance;
//외형 변경 인터페이스 선언
interface Changeable extends Resizable, Colorable {
	public abstract void setFont(String font);
}
