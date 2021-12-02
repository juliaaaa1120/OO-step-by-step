package practice06;

public class Student extends Person {
    private final Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
    }
}
