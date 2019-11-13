package ex19_3_Serialization_interface;
import java.io.*;
public class ObjectInputExample2 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while(true) {
				GoodsStock stock = (GoodsStock) in.readObject();
				
				String code = stock.code;
				int num = stock.num;
				
				System.out.println("��ǰ�ڵ�:" + code + "\t��ǰ����:" + num);
			}
		} catch(FileNotFoundException fnfe){
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(EOFException eofe) {//���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� ����
			System.out.println("��");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		}
		finally {
			try {
				in.close();//������ �ݽ��ϴ�.
			} catch(Exception e) {
				System.out.println("������ �ݴ� ���� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
