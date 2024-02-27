public class Rectangle extends Shape{
    float  area;
    int l,b;
    Rectangle(int l,int b,String c){
        this.l=l;
        this.b=b;
        setColor(c);
    }
    void area(){
        area = l*b;
    }
    void display(){
        area();
        System.out.println("Area of circle is : "+area);
        System.out.println("Color of circle is : "+color);
    }

}
