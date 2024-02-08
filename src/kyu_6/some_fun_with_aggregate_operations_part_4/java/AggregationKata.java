package kyu_6.some_fun_with_aggregate_operations_part_4.java;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationKata {

    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {

        return students
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.groupingBy(Student::getGender, Collectors.counting())));
    }

}




