package practice;

public class �ݶ���_���� {
	public int solution(int num) {
	      int answer = -1;
	      double dnum = num;
	      int i = 0;
	      while(i < 500){
	          if(dnum == 1){
	              answer = i;
	              break;
	          } else{//���� ���׿����� �ȵǳ�? dnum%2 ==0 ? dnum = dnum / 2 : dnum = dnum * 3 + 1;
	              if(dnum%2 == 0) {
	            	  dnum = dnum / 2 ;
	              } else {
	            	  dnum = dnum * 3 + 1;
	              }
	          }
	          i++;
	      }
	      
	      return answer;
	  }
}
