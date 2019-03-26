import java.util.Scanner;


public class Lab61 {
    public static void main(String args[]){
        System.out.println("enter real and imaginary part of two numbers");
        Scanner input=new Scanner(System.in);
        double real,imaginary;
        real=input.nextDouble();
        imaginary=input.nextDouble();
        Complex num1=new Complex(real,imaginary);
        real=input.nextDouble();
        imaginary=input.nextDouble();
        Complex num2=new Complex(real, imaginary);
        double[] added=add(num1,num2);
        System.out.println("Added number="+added[0]+"+"+added[1]+"i");
    }

    static double[] add(Complex num1,Complex num2){
        double real=num1.num[0]+num2.num[0];
        double imaginary=num1.num[1]+num2.num[1];
        double [] added=new double[2];
        added[0]=real;
        added[1]=imaginary;
        return added;
    }
}


class Complex{
    double [] num;

    Complex(double real,double imaginary){
        num=new double[2];
        num[0]=real;
        num[1]=imaginary;
    }
}