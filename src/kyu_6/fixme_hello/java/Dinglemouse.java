package kyu_6.fixme_hello.java;

import java.util.LinkedHashMap;

public class Dinglemouse extends LinkedHashMap<String, String> {

    public Dinglemouse() {
    }

    public Dinglemouse setAge(int age) {
        put("age", "I am " + age + ".");
        return this;
    }

    public Dinglemouse setSex(char sex) {
        String mOrF = sex == 'M' ? "male" : "female";
        put("sex", "I am " + mOrF + ".");
        return this;
    }

    public Dinglemouse setName(String name) {
        put("name", "My name is " + name + ".");
        return this;
    }


    public String hello() {
        return values().isEmpty() ? "Hello." : "Hello. " + String.join(" ", values());
    }
}
