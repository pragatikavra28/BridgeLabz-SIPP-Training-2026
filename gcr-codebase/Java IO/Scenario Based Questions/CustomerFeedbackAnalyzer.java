import java.io.*;
class CustomerFeedbackAnalyzer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i=0;i<5;i++) {
            String msg = br.readLine().toLowerCase();
            if(msg.contains("good")) count++;
        }
        System.out.println("Good Feedback Count = " + count);
    }
}