package practice09;

public class Klass {
    private final Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (this.isIn(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public Boolean isIn(Student student) {
        if (this.number == student.getKlass().getNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
