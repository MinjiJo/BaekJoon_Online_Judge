import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon_11022 {
    public static StringTokenizer st;
    public static void main(String[] args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        st = new StringTokenizer(br.readLine()); 
        int t = Integer.parseInt(st.nextToken()); 
        for (int i = 0; i < t; i++) { 
            st = new StringTokenizer(br.readLine(), " "); 
            int a = Integer.parseInt(st.nextToken()); 
            int b = Integer.parseInt(st.nextToken()); 
            int j = i + 1; 
            int sum = a + b; 
            System.out.println("Case #" + j + ": " + a + " + " + b + " = " + sum); 
        } 
    } 
}
