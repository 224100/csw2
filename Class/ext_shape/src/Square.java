public class Square extends Shape{
    float  area;
    int r;
    Square(int r,String c){
        this.r=r;
        setColor(c);
    }
    void area(){
        area = r*r;
    }
    void display(){
        area();
        System.out.println("Area of Square is : "+area);
        System.out.println("Color of circle is : "+color);
    }

}
