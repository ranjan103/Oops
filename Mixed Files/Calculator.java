import java.util.Scanner;

public class Calculator{
    public static void main(String [] args) {
        float a, b;
        char c;
        System.out.println("Enter number , operator and another number");
        Scanner input = new Scanner(System.in);
        a=input.nextFloat();
        c=input.next().charAt(0);
        b=input.nextFloat();
        Funtions funtions=new Funtions();
        if(c=='+')
            System.out.println("Result="+funtions.add(a,b));
        else if(c=='-')
            System.out.println("Result="+funtions.subract(a,b));
        else if(c=='*')
            System.out.println("Result="+funtions.multiply(a,b));
        else
            System.out.println("Result="+funtions.divide(a,b));
    }
}

class Funtions{
    float add(float a,float b){
        return a+b;
    }
    float multiply(float a,float b){
        return a*b;
    }
    float divide (float a,float b){
//        if(b==0) {
//            System.out.println("Cannot divide by zero");
//            return 0;
//        }
        return a/b;
    }
    float subract(float a,float b){
        return a-b;
    }
}