package tokey.leecode;

import org.junit.Test;

public class KMP {

    @Test
    public void test(){
        String s = "aa  b c safa q ";
        int next[] = new int[s.length()];
        getnext(next , s);
        for(int i : next){
            System.out.println(i);
        }



    }
    void getnext(int next[],String t)
    {
        int j=0,k=-1;//前后指针
        next[0]=-1; //初始化next0
        while(j<t.length()-1)//这个很好理解 遍历String t
        {
            if(k == -1 || t.charAt(j)== t.charAt(k))//前一个和后面的字符相等
            {
                j++;k++;
                next[j] = k;
            }
            else k = next[k];//此语句是这段代码最反人类的地方，如果你一下子就能看懂，那么请允许我称呼你一声大神！
        }
    }

}
