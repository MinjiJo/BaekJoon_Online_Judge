package homework_190902_1;

public class Student {
	private int no;
	private String name;
	private int kor, math, eng, tot;
	private float avg;
	private int rank;
	static int korTotal;
	static int mathTotal;
	static int engTotal;
	
	public Student(int count, String name2, int kor2, int math2, int eng2) {
		no = count;
		name = name2;
		kor = kor2;
		math = math2;
		eng = eng2;
		tot = kor2 + math2 + eng2;
		avg = tot/3;
		korTotal += kor2;
		mathTotal += math2;
		engTotal += eng2;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(Student[] hs) {
		rank = 1;
		for (int i = 0; i < hs.length; i++)
				for (int j = 0; j < hs.length; j++)
					if (i != j && hs[i].avg < hs[j].avg)
						hs[i].rank++;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int count) {
		this.no = count;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name2) {
		this.name = name2;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor2) {
		this.kor = kor2;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math2) {
		this.math = math2;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng2) {
		this.eng = eng2;
	}
	
	public String toString() {
		return no+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+tot+"\t"+avg+"\n";
	}
}
