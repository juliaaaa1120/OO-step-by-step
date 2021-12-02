package practice10;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.setTeacher(this);
        }
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
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        } else {
            String classesToString = classes.stream().map(klass -> klass.getNumber().toString()).collect(Collectors.joining(", "));
            return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), classesToString);
        }
    }

    public String introduceWith(Student student) {
        if (this.isTeaching(student)) {
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), student.getName());
        } else {
            return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
        }
    }

    public Boolean isTeaching(Student student) {
        return classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber());
    }
}

