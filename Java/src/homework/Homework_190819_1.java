package homework;

public class Homework_190819_1 {
	public static void main(String[] args) {
		System.out.println("\t\t\t\t2019�� 8��\n");
		int day=0;
		while(++day<=31) {
			if(day==1) {
				System.out.printf("\t\t\t\t");
			}
			System.out.printf("\t%d", day);
			if((day-3)%7==0) {
				System.out.println("");
			}
		}
	}
}
