package kyu_6.triple_sorting_sort_and_stringify_a_list_by_3_attributes.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TripleSorter {

    public static String sort(List<Student> students) {
        return students.stream()
                .sorted(sortOrder)
                .map(Student::getFullName)
                .collect(Collectors.joining(","));
    }

    static final Comparator<Student> sortOrder = Comparator
            .comparingInt(Student::getGpa).reversed()
            .thenComparing(s -> s.getFullName().split(" ")[1].charAt(0))
            .thenComparingInt(Student::getAge);
}