package operations;

import history.HistoryStructure;
import history.MyQueue;

public final class Multiplication {
    public static int multiply(int a, int b)
    {
        int res=a*b;
        HistoryStructure hs=new HistoryStructure("multiply",a+"",b+"",res+" ");
        MyQueue.add(hs);
        return res;
    }
}
