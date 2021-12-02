package practice10;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    private final Integer number;
    private Student leader;
    private Teacher teacher;

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

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Student student) {
        if (this.isIn(student)) {
            this.leader = student;
            if (this.teacher != null) {
                System.out.print(String.format("I am %s. I know %s become Leader of %s.\n", this.teacher.getName(), student.getName(), student.getKlass().getDisplayName()));
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (this.teacher != null) {
            System.out.print(String.format("I am %s. I know %s has joined %s.\n", this.teacher.getName(), student.getName(), student.getKlass().getDisplayName()));
        }
    }

    public Boolean isIn(Student student) {
        if (this.number == student.getKlass().getNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
