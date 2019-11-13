package ex19_4_Serialization_transient;
import java.io.*;
public class ObjectInputExample3 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while(true) {
				BBSItem obj = (BBSItem) in.readObject();//객체를 역직렬화하는 부분

				System.out.println("전체게시물의 수: " + BBSItem.itemNum);
				System.out.println("글쓴이: " + obj.writer);
				System.out.println("패스워드: " + obj.passwd);// transient 인스턴스 필드
				System.out.println("제목: " + obj.title);
				System.out.println("내용: " + obj.content);
			}
		} catch(FileNotFoundException fnfe){
			System.out.println("파일이 존재하지 않습니다.");
		} catch(EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발생하는 오류
			System.out.println("끝");
		} catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				in.close();//파일을 닫습니다.
			} catch(Exception e) {
				System.out.println("파일을 닫는 도중 오류가 발생했습니다.");
			}
		}
	}
}
