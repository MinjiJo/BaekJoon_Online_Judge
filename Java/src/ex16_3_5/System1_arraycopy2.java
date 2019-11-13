package ex16_3_5;

public class System1_arraycopy2 {
	public static void main(String[] args) {
		char arr1[] = { '가', '나', '다', '라', '마', '바', '사', '아', '자', '차', '카', '타', '파', '하' };
		char arr2[] = new char[arr1.length];

		// System.arraycopy(원본배열, 원보 항목 시작 위치,
		// 복사 대상 배열, 복사 대상 항목 시작 위치, 복사할 항목의 수);
		System.arraycopy(arr1, 0,
						 arr2, 0, arr1.length);

		for (char ch : arr2)
			System.out.print(ch + "  ");
	}
}