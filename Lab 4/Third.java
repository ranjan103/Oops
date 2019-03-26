import java.util.*;
import java.util.Scanner;
public class Third{
    public static class TollBooth{
        Integer a;
        double amount;
        public TollBooth(){
            this.a=0;
            this.amount=0;
        }
        public void pay_vehicle(){
            a+=1;
            amount+=50.0;
        }
        public void non_pay_vehicle() {
            a += 1;
        }
        public void display(){
            System.out.println("Total no. of vehicles:"+a);
            System.out.println("Total amount ="+amount);
        };
    }
    public static void main(String args[])
    {
        TollBooth v1 = new TollBooth();
        while(true) {
            System.out.println("Enter 1 for pay_vehicle,2 for non_pay vehicle,3 for display and -1 to exit");
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();

            if (i == 1) {
                v1.pay_vehicle();
            } else if (i == 2) {
                v1.non_pay_vehicle();
            } else if (i == 3) {
                v1.display();
            } else {
                System.exit(0);
            }
        }
    }
}