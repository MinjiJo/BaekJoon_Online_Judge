package practice;

public class 이상한_문자_만들기 {
	public static String solution(String s) {
		String answer = "";

        String[] Arr = s.split(" ");
        String[] smallArr;
        String tmp;

        for (int j = 0; j < Arr.length; j++) {
            smallArr = Arr[j].split("");
            for (int i = 0; i < smallArr.length; i++) {
                tmp = smallArr[i];
                
                if (i % 2 == 0) {
                    tmp = tmp.toUpperCase();
                } else {
                    tmp = tmp.toLowerCase();
                }
                smallArr[i] = tmp;
            }
            Arr[j] = String.join("", smallArr);
        }

        answer = String.join(" ", Arr);
        
        int blank = s.length() - answer.length();

        for (int i = 0; i < blank; i++) {
            answer += " ";
        }
        return answer;
	  }
	
	public static void main(String[] args) {
		System.out.println(solution(" +try  hello world   "));
	}
}