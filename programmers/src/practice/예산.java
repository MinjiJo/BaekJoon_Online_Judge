package practice;

public class ���� {
	public static int solution(int[] d, int budget) {
	      int answer = 0;
	      
	      //��������
	      for(int i = 0; i < d.length; i++) {
	    	  for(int j = 0; j < d.length-1; j++) {
	    		  if ( d[i] < d[j]) {
						int imsi = d[i];
						d[i] = d[j];
						d[j]= imsi;
				   }
	    	  }
	      }
	      
	      for(int i = 0; i < d.length; i++) {
	    	  System.out.println(d[i]);
	      }
	      
	      //��� �պ��� ���ؼ� budget���� ���� ���ư��� i�� answer�� ����
	      int sum = 0;
	      for(int i = 0; sum <= budget && i < d.length; i++) {
	    	  sum += d[i];
	    	  if(sum > budget) {
	    		  answer = i;
	    		  System.out.println("sum = " + sum + " answer = " + answer);
	    		  break;
	    	  }else if(sum == budget){
	    		  answer = i+1;
	    		  System.out.println("sum = " + sum + " answer = " + answer);
	    	  }else if(sum < budget){
	    		  answer = i+1;
	    		  System.out.println("sum = " + sum + " answer = " + answer);
	    	  }
	      }
	      return answer;
	  }
	
	static int exam[] = {3,3, 2, 2};
	public static void main(String[] args) {
		solution(exam, 1000);
	}
}