

import java.lang.Math;
import java.util.Scanner;

public class Lab51 {
    public static void main(String args[]){

//        System.out.println("Enter Type of figure");
//        String type;
        Scanner input=new Scanner(System.in);
//        type=input.next();
        System.out.println("Enter Coordinates");
        double x1,y1,x2,y2,x3,y3,x4,y4;
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();
        x3=input.nextDouble();
        y3=input.nextDouble();
        x4=input.nextDouble();
        y4=input.nextDouble();

        Quadrilateral quadrilateral=new Quadrilateral( x1, y1, x2, y2,x3, y3, x4, y4);
        System.out.println("Area="+quadrilateral.area());
    }

    public static double distance(double x1,double y1,double x2,double y2){
        double dis=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return dis;
    }
}



class Quadrilateral{
    double x1,y1,x2,y2,x3,y3,x4,y4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    double area(){
        double marea=0.5*Math.abs(x1*y2+x2*y3+x3*y4+x4*y1-(x2*y1+x3*y2+x4*y3+x1*y4));
        return marea;
    }
}


class Parallelogram extends Quadrilateral{
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
}

class Rectangle extends Quadrilateral{
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
}

class Square extends Quadrilateral{
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
}

class Trapezoid extends Quadrilateral{
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
}
