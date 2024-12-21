package kyu_8.students_final_grade.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testFixed() {
        assertEquals(100, StudentFinalGrade.finalGrade(99, 1), "Testing with exam = 99 and projects = 1");
        assertEquals( 90, StudentFinalGrade.finalGrade(76, 5), "Testing with exam = 76 and projects = 5");
        assertEquals( 75, StudentFinalGrade.finalGrade(76, 4), "Testing with exam = 76 and projects = 4");
        assertEquals(  0, StudentFinalGrade.finalGrade(52, 1), "Testing with exam = 52 and projects = 1");
    }
}
