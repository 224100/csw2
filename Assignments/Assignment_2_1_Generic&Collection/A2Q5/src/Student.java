public class Student implements Comparable<Student>{
    String name;
    int rollno;
    double totalMark;
    Student(String name, int rollno, double totalMark){
        this.name = name;
        this.rollno = rollno;
        this.totalMark = totalMark;

    }
    public void sort(Student[] s){
        for (int i =4;i>=0;i--) {
            for(int j =0;j<i;j++){
                if(s[j].compareTo(s[j+1])==1){
                    Student temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
    }
    @Override
    public int compareTo(Student s){
        if(this.rollno > s.rollno){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nRollno: "+rollno+"\nTotal marks: "+totalMark;
    }
}
