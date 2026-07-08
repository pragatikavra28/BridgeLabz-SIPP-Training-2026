import java.util.*;
public class Repository<T>{
 List<T> data=new ArrayList<>();
 void add(T x){data.add(x);}
 List<T> getAll(){return data;}
}