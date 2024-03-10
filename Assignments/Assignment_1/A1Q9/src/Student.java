public class Student{
    String name;
    long regno;

    public Student(String name, long regno) {
        this.name = name;
        this.regno = regno;
    }

    public String getName() {
        return name;
    }
    void display(){
        System.out.println("Name: "+name +"  RegdNo: "+regno);
    }
}