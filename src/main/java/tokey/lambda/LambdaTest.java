package tokey.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/*
lambda 表达式要求接口有且只有一个需要覆写的抽象方法
*/
public class LambdaTest {


    @Test
    public void test(){
        Operation sum1 = (int x ,int y) ->(x+y);
        Operation sum2 = (x, y) -> x*y;




    }

    @Test
    public void test2(){

        ArrayList<String> list  = new ArrayList<>();
        list.add("qq");
        list.add("qqq");
        list.add("qqqq");
        list.add("qqqqq");
        list.add("qqq");
        list.add("qqqq");
        list.add("qqqq");
        list.add("qq");
        list.add("qqq");
        list.add("aa");
        list.add("aqdddda");
        list.add("asa");
        list.add("qsd");
        list.add("qssq");
        list.add("qssq");
        list.add("qssq");
        list.add("qsssq");

        list.sort(
            (o1,o2)-> o1.length()==o2.length()?o1.compareTo(o2):o1.length()-o2.length()
        );

        list.stream().forEach(System.out::println);


    }
}
