
public class Student implements Comparable<Student>{
    String name;
    int rn;
    double totalMark;

    public Student(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }


    @Override
    public int compareTo(Student o) {
        Student s =(Student)o;
        if(this.totalMark == s.totalMark && this.name.equals( s.name) && this.rn==s.rn){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nRollno: "+rn+"\nTotal marks: "+totalMark;
    }

}
