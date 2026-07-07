public class InsertionSortEmployeeIDs{
 public static void main(String[] args){
  int[] ids={105,101,104,102,103};
  for(int i=1;i<ids.length;i++){
    int key=ids[i],j=i-1;
    while(j>=0&&ids[j]>key){ids[j+1]=ids[j];j--;}
    ids[j+1]=key;
  }
  for(int x:ids) System.out.print(x+" ");
 }
}