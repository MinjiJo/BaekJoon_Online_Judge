package ex16_3_5;

public class System1_arraycopy2 {
	public static void main(String[] args) {
		char arr1[] = { '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', 'ī', 'Ÿ', '��', '��' };
		char arr2[] = new char[arr1.length];

		// System.arraycopy(�����迭, ���� �׸� ���� ��ġ,
		// ���� ��� �迭, ���� ��� �׸� ���� ��ġ, ������ �׸��� ��);
		System.arraycopy(arr1, 0,
						 arr2, 0, arr1.length);

		for (char ch : arr2)
			System.out.print(ch + "  ");
	}
}