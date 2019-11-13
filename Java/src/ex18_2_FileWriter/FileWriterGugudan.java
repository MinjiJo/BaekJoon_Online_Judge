package ex18_2_FileWriter;

import java.io.*;

public class FileWriterGugudan {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("gugudan.txt");
			
			for (int i = 2; i < 10; i++) {
				writer.write("["+i+"��]\t");
			}
			writer.write("\n");
			
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					writer.write(j + "*" + i + "=" + i*j +"\t");
				}
				writer.write("\n");
			}
			
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				writer.close();// ������ �ݽ��ϴ�.
			} catch (Exception e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
