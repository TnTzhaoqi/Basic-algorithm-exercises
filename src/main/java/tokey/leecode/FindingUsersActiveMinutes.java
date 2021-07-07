package tokey.leecode;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;
/*




 */
public class FindingUsersActiveMinutes {
    @Test
    public void test(){
        int [][] logs = {{1,1},{2,2},{2,3}};
        int k = 5;
        int [] result = findingUsersActiveMinutes(logs , k );
        for(int x : result){
            System.out.println(x);
        }


    }


    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int [] result =new  int[k];
        Map<Integer, Set<Integer>> map = new HashMap();
        for(int [] x : logs){

            if(map.containsKey(x[0])){
                Set<Integer> set = map.get(x[0]);
                if(!set.contains(x[1])){
                    set.add(x[1]);

                }

            }else {
                Set<Integer> set = new HashSet();
                set.add(x[1]);
                map.put(x[0],set);
            }
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Set<Integer> set = map.get(iterator.next());
            int minutes = set.size();
            if(minutes<=k){
                result[minutes-1]++;
            }
        }








        return result;








    }







}
