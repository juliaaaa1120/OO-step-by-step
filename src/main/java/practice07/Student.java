package practice07;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.getKlass().getLeader() != null && super.getId() == this.getKlass().getLeader().getId()) {
            return String.format("%s I am a Student. I am Leader of %s.", super.introduce(), klass.getDisplayName());
        } else {
            return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
        }
    }
}
