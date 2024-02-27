public class circle extends Shape{
    float  area;
    int r;
    circle(int r,String c){
        this.r=r;
        setColor(c);
    }
    void area(){
        area = 3.14f*r*r;
    }
    void display(){
        area();
        System.out.println("Area of circle is : "+area);
        System.out.println("Color of circle is : "+color);
    }

}
