package ex11_1_String;

public class StringExample9_2 {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";
		int len = message.length();
		
		/* 1. �迭ũ��� �迭�̸�.length�� ���մϴ�.
		   ��) arr.length
		   2. ���ڿ� ������ String.length()�� ���մϴ�.
		   ��) message.length();
		 */

		System.out.println("�� ���ڼ� = " + message.length());
		System.out.println("===������ index ��ġ ã�� : charAt()===");
		// message �߿��� ' '�� ã��
		for (int i = 0; i < len; i++) {
			if (message.charAt(i) == ' ') {
				System.out.println("index = " + i);
			}
		}

		System.out.println("===������ index ��ġ ã�� : substring()===");
		for (int i = 0; i < len; i++) {
			if (message.substring(i, i + 1).equals(" ")) {
				System.out.println("index = " + i);
			}
		}

		System.out.println("===������ index ��ġ ã�� : indexOf()===");
		int index;
		for(int i = 0; ; i = index+1) {
			index = message.indexOf(' ', i);
			if(index==-1)
				break;
			System.out.println("index = " + index);
		}
	}
}
