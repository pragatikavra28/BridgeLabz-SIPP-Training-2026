import java.util.*;
public class EmployeeAttendanceRanking{
 public static void main(String[] args){
  int[] ids={101,102,103,104,105};
  int[] att={92,85,98,92,80};
  int k=3;
  Integer[] idx={0,1,2,3,4};
  Arrays.sort(idx,(i,j)-> att[i]!=att[j]? att[j]-att[i]: ids[i]-ids[j]);
  for(int i=0;i<k;i++) System.out.print(ids[idx[i]]+" ");
 }
}