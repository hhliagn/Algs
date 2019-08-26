package lhh.base.test;

public class StopWatch {

    private static long start = 0L;

    public static void start(){
        start = System.currentTimeMillis();
    }

    public static double elapseTime(){
        long now = System.currentTimeMillis();
        return (start - now) / 1000.0;
    }
}
