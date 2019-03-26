import java.util.*;
import java.util.Scanner;
public class Second{
    public abstract static class Shape{
        int a,b;
        public Shape(int a,int b){
            this.a=a;
            this.b=b;
        }
        public abstract void print_area();
    }
    public static class Rectangle extends Shape{
        public Rectangle(int a,int b){
            super(a,b);
        }
        int area = a*b;
        @Override
        public void print_area(){
            System.out.println("The area of rectangle is :"+area);
        }

    }
    public static class Triangle extends Shape{
        public Triangle(int a,int b){
            super(a,b);
        }
        double area = 0.5*a*b;
        @Override
        public void print_area(){
            System.out.println("The area of triangle is :"+area);
        }

    }
    public static class Circle extends Shape{
        public Circle(int a,int b){
            super(a,b);
        }
        double area = 3.14*a*b;
        @Override
        public void print_area(){
            System.out.println("The area of circle is :"+area);
        }

    }
    public static void main(String args[]){
        System.out.println("Enter 1 for rectangle,2 for triangle and 3 for circle");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if(i==1){
            System.out.println("Enter length and breadth");
            int l = input.nextInt();
            int b= input.nextInt();
            Shape v1 = new Rectangle(l,b);
            v1.print_area();
        }
        else if(i==2)
        {
            System.out.println("Enter height and base");
            int l = input.nextInt();
            int b= input.nextInt();
            Shape v1 = new Triangle(l,b);
            v1.print_area();
        }
        else
        {
            System.out.println("Enter radius");
            int l = input.nextInt();
            Shape v1 = new Circle(l,l);
            v1.print_area();
        }




    }
}