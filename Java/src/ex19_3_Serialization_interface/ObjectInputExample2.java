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
				
				System.out.println("상품코드:" + code + "\t상품수량:" + num);
			}
		} catch(FileNotFoundException fnfe){
			System.out.println("파일이 존재하지 않습니다.");
		} catch(EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발생하는 오류
			System.out.println("끝");
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}
		finally {
			try {
				in.close();//파일을 닫습니다.
			} catch(Exception e) {
				System.out.println("파일을 닫는 도중 오류가 발생했습니다.");
			}
		}
	}
}
