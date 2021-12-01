package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " " + "I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", klass.getDisplayName());
        }
    }

    public String introduceWith(Student student) {
        if (this.getKlass().getNumber() == student.getKlass().getNumber()) {
            return super.introduce() + " " + String.format("I am a Teacher. I teach %s.", student.getName());
        } else {
            return super.introduce() + " " + String.format("I am a Teacher. I don't teach %s.", student.getName());
        }
    }
}
