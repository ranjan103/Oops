import java.beans.IntrospectionException;
import java.lang.Math;
import java.util.Scanner;

public class Lab63 {
    public static void main(String[] args){
        System.out.println("Enter bank ");
        Scanner input=new Scanner(System.in);
        RBI myBank;
        String bank=input.next();
        if(bank.compareTo("RBI")==0){
             myBank=new RBI();
        }
        else if(bank.compareTo("SBI")==0)
            myBank=new SBI();
        else if(bank.compareTo("ICICI")==0)
            myBank=new ICICI();
        else
            myBank=new PNB();

        myBank.setMinintrest(8);
        System.out.println("Enter rate of Intrest,principal,time");
        myBank.setIntrest(input.nextDouble());
        myBank.setPrincipal(input.nextDouble());
        myBank.setTime(input.nextDouble());
        double amount=myBank.calculateAmount();
        System.out.println("Amount ="+amount);
    }
}

class RBI{
    double intrest;
    double minIntrest;
    double principal,time;

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getIntrest() {
        return intrest;
    }

    public double getMinintrest() {
        return minIntrest;
    }

    public void setMinintrest(double minintrest) {
        this.minIntrest = minintrest;
    }

    public void setIntrest(double intrest) {
        if(intrest>this.minIntrest)
            this.intrest = intrest;
        else {
            System.out.println("Interest does not satisfy RBI guidelines");
            System.exit(0);
        }
    }

    double calculateAmount(){
        return principal*intrest*time+principal;
    }
}

class SBI extends RBI{
    double calulateAmount(){
        return principal*Math.pow((1+(intrest/100)/12),12);
    }
}

class ICICI extends RBI{
    double calulateAmount(){
        return principal*Math.pow((1+(intrest/100)/6),6*time)+principal*time*intrest;
    }
}

class PNB extends RBI{
    double calulateAmount(){
        return principal*Math.pow((1+(intrest/100)/12),12);
    }
}