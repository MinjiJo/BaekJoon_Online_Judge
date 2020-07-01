import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackJoon_15552 {
    public static StringTokenizer st;
    public static void main(String[] args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine()); 
        int t = Integer.parseInt(st.nextToken()); 
        for (int i = 0; i < t; i++) { 
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b; 
            bw.write(sum+"\n"); 
        }
	bw.flush();
	bw.close();
    } 
}
