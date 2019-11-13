package practice;

public class K¹øÂ°¼ö {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i = 0; i < commands.length; i++) {
			int[] temp = new int[commands[i][1]-commands[i][0]+1];
			
			int z = 0;
			for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
				temp[z] = array[j];
				z++;
			}
			
			for(int a = 0; a < temp.length; a++) {
		    	  for(int j = 0; j < temp.length-1; j++) {
		    		  if ( temp[a] < temp[j]) {
							int imsi = temp[a];
							temp[a] = temp[j];
							temp[j]= imsi;
					   }
		    	  }
		      }
			
			answer[i] = temp[commands[i][2]-1];
		}
		
		for(int i = 0; i < commands.length; i++) {
			System.out.println("answer[" + i + "] = " + answer[i]);
		}
        return answer;
    }
	
	static int[] array = {1, 5, 2, 6, 3, 7, 4};
	static int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
	
	public static void main(String[] args) {
		System.out.println(solution(array, commands));
	}
}
