public class Student implements Comparable<Student>{
    String name;
    int rollno;
    double totalMark;
    Student(String name, int rollno, double totalMark){
        this.name = name;
        this.rollno = rollno;
        this.totalMark = totalMark;

    }
    @Override
    public int compareTo(Student s){
        if(this.name.equals(s.name) && this.rollno == s.rollno && this.totalMark == s.totalMark){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nRollno: "+rollno+"\nTotal marks: "+totalMark;
    }
}
