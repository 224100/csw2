public class Student {
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && mark == student.mark && name.equals(student.name);
    }

    @Override
    public String toString() {
        return
                "name= " + name  +
                ", age=" + age +
                ", mark=" + mark
                ;
    }
}