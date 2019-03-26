import java.util.*;
import java.util.Scanner;
public class First{
    public static class Calc{
        int a,b;
        public Calc(int a,int b){
            this.a=a;
            this.b=b;
        }
        public int add()
        {
            return a+b;
        }
        public int sub()
        {
            return a-b;
        }
        public int mul(){
            return a*b;
        }
        public int div(){
            return a/b;
        }

    }
    public static void main(String args[])
    {
        System.out.println("Enter operand 1");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter operator");
        char c= input.next().charAt(0);
        System.out.println("Enter operand 2");
        int b= input.nextInt();
        Calc obj = new Calc(a,b);
        switch (c){
            case ('+'):
                System.out.println(obj.add());
                break;
            case ('-'):
                System.out.println(obj.sub());
                break;
            case ('*'):
                System.out.println(obj.mul());
                break;
            case ('/'):
                System.out.println(obj.div());

        }

    }
}