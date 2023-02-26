package operations;

import history.HistoryStructure;
import history.MyQueue;

public final class Division {
    public static int divide(int a, int b)
    {
        int res=a/b;
        HistoryStructure hs=new HistoryStructure("divide",a+"",b+"",res+" ");
        MyQueue.add(hs);
        return res;
    }
    public static double divide(double a, double b)
    {
        double res=a/b;
        HistoryStructure hs=new HistoryStructure("divide",a+"",b+"",res+" ");
        MyQueue.add(hs);
        return res;
    }



}
