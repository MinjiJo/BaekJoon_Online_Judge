package practice;

public class 모의고사 {
	public int[] solution(int[] answers) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        int[] precase1 = {1, 2, 3, 4, 5};
        int[] precase2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] precase3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] case1 = new int[answers.length];
        int[] case2 = new int[answers.length];
        int[] case3 = new int[answers.length];
        
        for(int i = 0; i < answers.length; i++) {
        	case1[i] = precase1[i%5];
        	case2[i] = precase2[i%8];
        	case3[i] = precase3[i%10];
        }
        
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == case1[i])
        		a++;
        	
        	if(answers[i] == case2[i])
        		b++;
        	
        	if(answers[i] == case3[i])
        		c++;
        }
        
        String temp = "0";
		if(a > b && a > c) {
			temp = "1";
        }else if(b > a && b > c) {
        	temp = "2";
        }else if(c > a && c > b) {
        	temp = "3";
        }else if(a == b && a > c) {
        	temp = "12";
        }else if( a== c && a > b) {
        	temp = "13";
        }else if ( b== c && b > a) {
        	temp = "23";
        }else if(a==b && b==c) {
        	temp = "123";
        }
		
		int answer[] = new int[temp.length()];
		
		for(int i = 0; i < temp.length(); i++) {
			answer[i] = Integer.parseInt(temp.substring(i,i+1));
		}
        return answer;
    }
}
