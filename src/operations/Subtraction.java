package operations;

import history.HistoryStructure;
import history.MyQueue;

public final class Subtraction {
    public static int subtract(int a,int b)
    {
        int res=a-b;
        HistoryStructure hs=new HistoryStructure("subtract",a+"",b+"",res+" ");
        MyQueue.add(hs);
        return res;
    }
}
