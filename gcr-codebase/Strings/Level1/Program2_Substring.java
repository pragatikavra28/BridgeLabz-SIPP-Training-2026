import java.util.*;
public class Program2_Substring {
    static String sub(String s,int start,int end){
        String r="";
        for(int i=start;i<end;i++) r+=s.charAt(i);
        return r;
    }
    static boolean compare(String a,String b){ return a.equals(b); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String a=sub(s,start,end);
        String b=s.substring(start,end);
        System.out.println(a);
        System.out.println(compare(a,b));
    }
}