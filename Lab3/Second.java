import java.util.*;
import java.util.Scanner;
public class Second{
    public static class Com{
        int roll,marks1,marks2,marks3;
        String name;
        public Com(){
            System.out.println("Null Constructor Called!");
        }
        public Com(int a, int b,int c,int d,String n)
        {
            System.out.println("Parameterized Constructor Called!");
            this.roll=a;
            this.marks1=b;
            this.marks2=c;
            this.marks3=d;
            this.name=n;
        }
        public Com(Com cl)
        {
            System.out.println("Copy Constructor Called!");
            roll = cl.roll;
            marks1=cl.marks1;
            marks2=cl.marks2;
            marks3=cl.marks3;
            name=cl.name;
        }
        public void display(){
            System.out.println("Name: "+name);
            System.out.println("Rollno.: "+roll);
            System.out.println("Marks1: "+marks1);
            System.out.println("Marks2: "+marks2);
            System.out.println("Marks3: "+marks3);

        }
    }


    public static void main(String args[]){
        Com c1= new Com();
        Com c2 = new Com(40,60,70,80,"saurabh");
        Com c3 = new Com(c2);
        c2.display();

    }
}