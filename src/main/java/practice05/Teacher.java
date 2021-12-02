package practice05;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        } else {
            return String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass);
        }
    }
}