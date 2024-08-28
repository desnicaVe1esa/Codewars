package kyu_6.string_array_duplicates.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"codewars","picaniny","hubububo"},Solution.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra","alote","asese"},Solution.dup(new String[]{"abracadabra","allottee","assessee"}));
        assertArrayEquals(new String[]{"keles","kenes"},Solution.dup(new String[]{"kelless","keenness"}));
    }
}
