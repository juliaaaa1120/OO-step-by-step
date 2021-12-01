package practice10;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = (LinkedList<Klass>) classes.clone();
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " " + "I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " " + String.format("I am a Teacher. I teach Class %s.", classes.stream().map(klass -> klass.getNumber().toString()).collect(Collectors.joining(", ")));
        }
    }

    public String introduceWith(Student student) {
        if (this.isTeaching(student)) {
            return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", student.getName());
        } else {
            return super.introduce() + " " + String.format("I am a Teacher. I don't teach %s.", student.getName());
        }
    }

    public Boolean isTeaching(Student student) {
        if (classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber())) {
            return true;
        } else {
            return false;
        }
    }
}

