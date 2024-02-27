public class Rectangle {
    private int length;
    private int breadth;
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Rectangle(){

    }
    void setLength(int length){
        this.length=length;
    }
    void setBreadth(int breadth){
        this.breadth=breadth;
    }
    void getLength(){
        System.out.println("Length: "+length);

    }
    void getBreadth(){
        System.out.println("Breadth: "+breadth);
    }
    void Area(){
        System.out.println("Area: "+length*breadth);
    }
    void parameter(){
        System.out.println("Parameter: "+2*(length+breadth));
    }

}
