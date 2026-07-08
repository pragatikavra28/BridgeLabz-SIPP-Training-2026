import java.util.*;
public class Stack<T>{
 List<T> list=new ArrayList<>();
 void push(T x){list.add(x);}
 T pop(){return list.remove(list.size()-1);}
}