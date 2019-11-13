package ex11_5_Calendar;
import java.util.GregorianCalendar;
public class Calendar3_3_set {
	public static void main(String[] args) {
		Today t = new Today();
		System.out.println(t.toString());//toString()을 쓰지 않고 참조변수만 써도 
		
		Today t1 = new Today(new GregorianCalendar(2019,7,2));
		System.out.println(t1.toString());
		
		Today t2 = new Today(new GregorianCalendar(2019,7,2,10,10,10));
		System.out.println(t2.toString());
	}
}
