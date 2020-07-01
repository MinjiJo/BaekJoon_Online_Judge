import java.util.Scanner;

public class BackJoon_14681 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     
	 int num1 = sc.nextInt();
     int num2 = sc.nextInt();
	 
     if(num1*num2 > 0){
         if(num1 > 0){
             System.out.println(1);
         } else {
             System.out.println(3);
         }
     } else {
         if(num1 > 0){
             System.out.println(4);
         } else {
             System.out.println(2);
         }
     }
     
     sc.close();
 }
}
