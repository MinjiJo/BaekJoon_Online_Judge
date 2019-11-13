package ex18_6_Buffered2_flush2;
import java.io.*;
public class BufferedWriterExample1_���� {
	public static void main(String args[]) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("F:\\JAVA\\Java\\src\\ex18_6_Buffered2_flush2\\output.txt");
			bw = new BufferedWriter(fw, 5);
			char arr[] = {'��','��','��','1','��',
						  '2','��','��','3','��',
						  '��','4','��','��','5',
						  '��','��','6','��'};
			for (int cnt = 0; cnt < arr.length; cnt++)
				bw.write(arr[cnt]);
			bw.flush();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		finally {
			try {
				fw.close();//���� ���ۿ� ���� �ִµ� ��� ��Ʈ���� �ݽ��ϴ�.
				//bw.close();//���� ��� ��Ʈ���� ���������� ���� ��
							//�ڵ����� flush() �޼ҵ带 ȣ���մϴ�.
			}catch(Exception e){
			}
		}
	}
}
