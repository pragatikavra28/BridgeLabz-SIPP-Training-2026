import java.io.*;
class GroceryBillReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("bill.txt"));
        String line;
        int count = 0;
        while((line = br.readLine()) != null) {
            System.out.println(line);
            count++;
        }
        br.close();
        System.out.println("Total lines = " + count);
    }
}