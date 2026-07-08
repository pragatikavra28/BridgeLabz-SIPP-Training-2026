public class BubbleSortStudentMarks {
    public static void main(String[] args){
        int[] marks={78,45,90,67,88};
        boolean swapped; int swaps=0;
        for(int i=0;i<marks.length-1;i++){
            swapped=false;
            for(int j=0;j<marks.length-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int t=marks[j]; marks[j]=marks[j+1]; marks[j+1]=t;
                    swapped=true; swaps++;
                }
            }
            if(!swapped) break;
        }
        for(int m:marks) System.out.print(m+" ");
        System.out.println("\nTotal swaps: "+swaps);
    }
}