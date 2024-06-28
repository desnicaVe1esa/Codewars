package kyu_6.promenade_fractions_from_bio_2016.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;



public class PromenadeTestSamples {

    public void test(String prom, int a,int b){
        assertArrayEquals(prom+ " should yield "+a+"/"+b,
                new int[]{a,b}, Promenade.promenade(prom));

    }
    @Test
    public void SampleTestCases() {
        test("",1,1);
        test("L",1,2);
        test("R",2,1);
        test("LRLL",4,7);
        test("LLRLR",5,13);
        test("RRRLRRR",19,5);
        test("LLLLRLLLL",6,29);
        test("LLLLLLLLLL",1,11);
    }
}