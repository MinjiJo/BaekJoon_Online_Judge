import java.util.Scanner;
 
public class BackJoon_1110 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
         
        int number = n;
        int count = 0;
         
        number = number % 10 * 10 + (number / 10 + number % 10) % 10;
        count++;
        
        while(n!=number) {
            number = number % 10 * 10 + (number / 10 + number % 10) % 10;
            count++;
        };
         
        System.out.println(count);
    }
}
