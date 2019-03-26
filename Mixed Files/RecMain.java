import java.util.Scanner;

public class RecMain {
    public static void main(String [] args){
        RecRectangle rec1,rec2;
        rec1=new RecRectangle();
        rec2=new RecRectangle();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter len width and color of rec1");
        double width,length;
        String  color;
        length=input.nextDouble();
        width=input.nextDouble();
        color=input.next();
        rec1.set_length(length);
        rec1.set_color(color);
        rec1.set_width(width);
        rec1.find_area();
        System.out.println("Enter len width and color of rec2");
        length=input.nextDouble();
        width=input.nextDouble();
        color=input.next();
        rec2.set_length(length);
        rec2.set_color(color);
        rec2.set_width(width);
        rec2.find_area();
        String col;
        if(rec1.color.compareTo(rec1.color)==0)
            col="Same";
        else
            col="not same";

        System.out.printf("area of rec=%f\n area of rec2=%f \n Color are %s",rec1.area,rec2.area,col);


    }
}
class RecRectangle{
    double width,length,area;
    String  color;
    void set_length(double length){
        this.length=length;
    }
    void set_width(double width){
        this.width=width;
    }
    void set_color(String color){
        this.color=color;
    }
    void find_area(){
        this.area=this.length*this.width;
    }
}