package tokey.leecode;

import org.junit.Test;

import java.util.*;

public class GenerateParenthesis {
    @Test
    public void test(){
        List list = generateParenthesis(3);
        System.out.println(list);



    }


    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        if(n==1){
            String str = "()";
            list.add(str);
            list.add

        }else {
            List list2 = generateParenthesis(n-1);
            Iterator<String> iterator = list2.iterator();
            while(iterator.hasNext()){
                String s = iterator.next();
                set.addAll(getStringSet(s));

            }

        }
        list.addAll(set);
        return list;


    }
    public Set<String> getStringSet (String s){
        Set<String> set = new HashSet();
        int len = s.length();

        for(int i = 0 ; i<len ;i++){
            StringBuilder sb = new StringBuilder(s);
            sb.insert(i,"()");
            set.add(sb.toString());

        }

        return set;


    }

}
