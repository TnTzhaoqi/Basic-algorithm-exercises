package tokey.search;
import java.util.HashSet;
import java.util.Iterator;

public class BinarySearch {

    public  static int []  arr = {1,2,3,4,5,6,7,8,9,11};


    public static void main(String[] args) {
        String s  ="111";
        BinarySearch bin = new BinarySearch();
        System.out.printf(s);
        if(s==null||s.length()==0){
            HashSet set = new HashSet();
        }
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        char ch2 = 'w';



    }
    public void setZeroes(int[][] matrix) {
        if(matrix==null||matrix.length==0)
            return;
        HashSet<Integer> row_set = new HashSet<Integer>();
        HashSet<Integer> column_set = new HashSet<Integer>();
        int row_len = matrix.length;
        int column_len = matrix[0].length;
        for(int i = 0;i<row_len;i++){
            for(int j = 0 ;j<column_len;j++){
                if(matrix[i][j]==0){
                    row_set.add(i);
                    column_set.add(j);
                }




            }

        }


        Iterator<Integer> row_it = row_set.iterator();
        while(row_it.hasNext()){
            int row = row_it.next();
            for(int i = 0 ; i <column_len ; i++){
                matrix[row][i]= 0;
            }
        }
        Iterator<Integer> column_it = column_set.iterator();
        while(column_it.hasNext()){
            int column = column_it.next();
            for(int i = 0 ; i<row_len;i++){
                matrix[i][column] = 0;
            }


        }



    }
   public static  void   swap(int [] A  ,int a , int b){
            int temp = A[a];
            A[a] = A[b];
            A[b] = temp;

   }


}
