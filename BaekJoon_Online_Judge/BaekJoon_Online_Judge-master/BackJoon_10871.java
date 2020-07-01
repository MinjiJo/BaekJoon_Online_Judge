import java.util.*;

public class BackJoon_10871 {
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num = sc.nextInt();
        int a[] = new int[count];
        
        for(int i=0; i<count; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<a.length; i++) {
            if(num > a[i]) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    } 
}
