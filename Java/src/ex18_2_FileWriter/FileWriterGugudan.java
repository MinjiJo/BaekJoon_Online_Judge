package ex18_2_FileWriter;

import java.io.*;

public class FileWriterGugudan {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("gugudan.txt");
			
			for (int i = 2; i < 10; i++) {
				writer.write("["+i+"단]\t");
			}
			writer.write("\n");
			
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					writer.write(j + "*" + i + "=" + i*j +"\t");
				}
				writer.write("\n");
			}
			
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				writer.close();// 파일을 닫습니다.
			} catch (Exception e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}
}
