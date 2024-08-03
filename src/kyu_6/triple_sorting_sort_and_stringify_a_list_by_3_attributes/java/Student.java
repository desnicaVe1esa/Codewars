package kyu_6.triple_sorting_sort_and_stringify_a_list_by_3_attributes.java;

public class Student {

    private int gpa;
    private int age;
    private String fullName;

    public Student(int age, int gpa, String fullName){
        this.age = age;
        this.gpa = gpa;
        this.fullName = fullName;
    }

    public int getGpa() {
     return gpa;
    }
    public int getAge() {
        return age;
    }
    public String getFullName(){
        return fullName;
    }
}
