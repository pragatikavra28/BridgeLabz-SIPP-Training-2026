import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int day=sc.nextInt();
        boolean spring=(month==3&&day>=20)||(month>3&&month<6)||(month==6&&day<=20);
        System.out.println(spring?"Its a Spring Season":"Not a Spring Season");
    }
}