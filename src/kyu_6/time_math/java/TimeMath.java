package kyu_6.time_math.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeMath
{
    @Test
    public void add()
    {
//        assertEquals("03:40:36", Solution.timeMath("01:24:31", "+", "02:16:05"));
//        assertEquals("23:59:59", Solution.timeMath("01:24:31", "+", "22:35:28"));
        assertEquals("00:00:00", Solution.timeMath("00:00:01", "+", "23:59:59"));
        assertEquals("03:36:45", Solution.timeMath("13:48:52", "+", "13:47:53"));
    }
    @Test
    public void subtract()
    {
        assertEquals("00:00:00", Solution.timeMath("11:24:31", "-", "11:24:31"));
        assertEquals("08:09:03", Solution.timeMath("11:24:31", "-", "03:15:28"));
        assertEquals("23:59:59", Solution.timeMath("00:00:01", "-", "00:00:02"));
        assertEquals("02:25:56", Solution.timeMath("08:19:11", "-", "05:53:15"));
    }
}