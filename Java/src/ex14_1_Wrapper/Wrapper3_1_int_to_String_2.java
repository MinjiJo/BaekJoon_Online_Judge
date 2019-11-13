package ex14_1_Wrapper;

public class Wrapper3_1_int_to_String_2 {
	public static void main(String[] args) {
		String value="10";
		
		byte b = Byte.parseByte(value);
		System.out.println("Byte.parseByte=" + b);
		
		short s = Short.parseShort(value);
		System.out.println("Short.parseShort=" + s);
		
		int i = Integer.parseInt(value);
		System.out.println("Integer.parseInt=" + i);
		
		long l = Long.parseLong(value);
		System.out.println("Long.parseLong=" + l);
		
		float f = Float.parseFloat(value);
		System.out.println("Float.parseFloat=" + f);
		
		double d = Double.parseDouble(value);
		System.out.println("Double.parseDouble=" + d);
		
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println("Boolean.parseBoolean(true):" + b1);
		
		boolean b2 = Boolean.parseBoolean(value);
		System.out.println("Boolean.parseBoolean(" + value + "):" + b2);
		
		Character c2 = new Character('1');
		System.out.println("value.charAt(0):" + c2.charValue());
		
		char c = value.charAt(0);	//String이 없어서 파싱하지 못하고 문자 1개만 분리해냄
		System.out.println("value.charAt(0):" + c);
		}
}
