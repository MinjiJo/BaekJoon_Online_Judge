package ex15_5_HashSet;
import java.util.*;
class Member{
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//String 클래스와 hashCode()는 같은 문자열에 대한 hashCode()값을
	//같도록 오버라이딩 했습니다.
	public int hashCode() {
		System.out.println("hashCode()=" + (name+age).hashCode());
		return (name+age).hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj != null & obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
}

public class HashSet4_hashCode_equals {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
	}
}
