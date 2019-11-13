package ex15_5_HashSet;
import java.util.*;
public class Lotto_treeset {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		while(set.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
			}
		
		System.out.println(set);
		
	}
}
