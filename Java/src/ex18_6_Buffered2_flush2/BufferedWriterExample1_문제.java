package ex18_6_Buffered2_flush2;
import java.io.*;
public class BufferedWriterExample1_문제 {
	public static void main(String args[]) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("F:\\JAVA\\Java\\src\\ex18_6_Buffered2_flush2\\output.txt");
			bw = new BufferedWriter(fw, 5);
			char arr[] = {'내','꺼','인','1','듯',
						  '2','내','꺼','3','아',
						  '닌','4','내','꺼','5',
						  '같','은','6','너'};
			for (int cnt = 0; cnt < arr.length; cnt++)
				bw.write(arr[cnt]);
			bw.flush();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		finally {
			try {
				fw.close();//아직 버퍼에 남아 있는데 출력 스트림을 닫습니다.
				//bw.close();//보조 기반 스트림이 정상적으로 닫힐 때
							//자동으로 flush() 메소드를 호출합니다.
			}catch(Exception e){
			}
		}
	}
}
