import java.util.*;
class Contact{String name,phone,email;Contact(String n,String p,String e){name=n;phone=p;email=e;}}
public class AddressBookApp{
 static ArrayList<Contact> list=new ArrayList<>(); static HashMap<String,Contact> map=new HashMap<>(); static HashSet<String> phones=new HashSet<>();
 public static void add(String n,String p,String e){if(!phones.add(p)){System.out.println("Duplicate phone");return;} Contact c=new Contact(n,p,e);list.add(c);map.put(n,c);}
 public static void search(String n){System.out.println(map.getOrDefault(n,null));}
 public static void delete(String n){Contact c=map.remove(n); if(c!=null){phones.remove(c.phone);list.remove(c);}}
 public static void display(){Collections.sort(list,Comparator.comparing(a->a.name)); for(Contact c:list)System.out.println(c.name+" "+c.phone+" "+c.email);}
 public static void main(String[]a){add("A","1","a@x");add("B","2","b@x");display();}}
