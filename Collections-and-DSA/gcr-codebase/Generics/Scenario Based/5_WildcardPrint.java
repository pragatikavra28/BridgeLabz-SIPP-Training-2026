import java.util.*;
public class WildcardPrint{
 static void print(List<?> list){
  for(Object x:list) System.out.println(x);
 }
}