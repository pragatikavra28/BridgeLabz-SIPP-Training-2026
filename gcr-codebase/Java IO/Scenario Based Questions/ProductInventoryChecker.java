import java.io.*;
class ProductInventoryChecker {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("inventory.txt"));
        String line;
        while((line=br.readLine())!=null){
            String[] data = line.split("-");
            if(Integer.parseInt(data[1])==0){
                System.out.println(data[0] + " is out of stock");
            }
        }
        br.close();
    }
}