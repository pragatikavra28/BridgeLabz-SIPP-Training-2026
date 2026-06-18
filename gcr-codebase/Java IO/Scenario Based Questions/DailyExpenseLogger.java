import java.io.*;
import java.util.*;
class DailyExpenseLogger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("expenses.txt", true);
        System.out.print("Enter category: ");
        String cat = sc.nextLine();
        System.out.print("Enter amount: ");
        int amt = sc.nextInt();
        fw.write(cat + " - " + amt + "\n");
        fw.close();
        System.out.println("Expense saved.");
    }
}