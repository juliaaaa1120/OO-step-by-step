package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String output = "";
        if (this.getKlass().getLeader() != null) {
            if (super.getId() == this.getKlass().getLeader().getId()) {
                output =  super.introduce() + " " + String.format("I am a Student. I am Leader of %s.", klass.getDisplayName());
            }
        } else {
            output = super.introduce() + " " + String.format("I am a Student. I am at %s.", klass.getDisplayName());
        }
        return output;
    }
}
