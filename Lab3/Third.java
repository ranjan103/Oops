import java.util.*;
import java.util.Scanner;
public class Third{

        public static class Rectangle{
            double a,b,area;
            String color;
            public void set_Length(double al)
            {
                a=al;
            }
            public void set_width(double al)
            {
                b=al;
            }
            public void set_color(String c)
            {
                color=c;
            }
            public double find_area()
            {
                return a*b;
            }
        }
    public static void main(String args[]){
            Rectangle r1 = new Rectangle();
            r1.set_Length(2.5);
            r1.set_width(3.5);
            r1.set_color("yellow");
            Rectangle r2 = new Rectangle();
            r2.set_Length(3.5);
            r2.set_width(2.5);
            r2.set_color("yello");
            if(r1.find_area()==r2.find_area()&&r1.color==r2.color)
            {
                System.out.println("Matching Rectangles");
            }
            else
            {
                System.out.println("Not Matching Rectangles");
            }
    }

}