package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        } else {
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klass.getDisplayName());
        }
    }

    public String introduceWith(Student student) {
        if (this.getKlass().getNumber() == student.getKlass().getNumber()) {
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), student.getName());
        } else {
            return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
        }
    }
}
