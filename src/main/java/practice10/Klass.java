package practice10;

import java.util.List;

public class Klass {
    private Integer number;
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
            System.out.print(String.format("I am Tom. I know %s become Leader of %s.", student.getName(), student.getKlass().getDisplayName()));
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        System.out.print(String.format("I am Tom. I know %s has joined %s.", student.getName(), student.getKlass().getDisplayName()));
    }

    public Boolean isIn(Student student) {
        if (this.number == student.getKlass().getNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
