package kyu_8.basic_subclasses_adam_and_eve.java;

public class God {
    public static Human[] create(){
        return new Human[]{new Man(), new Woman()};
    }
}

abstract class Human {
    public Human() {}
}

class Man extends Human {
    public Man() {}
}

class Woman extends Human {
    public Woman() {}
}
