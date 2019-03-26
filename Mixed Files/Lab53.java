import java.util.Scanner;

public class Lab53 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of passengers");
        int n=sc.nextInt();
        Passengers[] passengers=new Passengers[n];
        String name ;
        String places_visited ;
        String ss;
        String rs;
        int age;

        for(int i=0;i<n;i++)
        {
            System.out.println("Name, place visited, start date(, return date and age");
            name = sc.next();
            places_visited = sc.next();
            ss=sc.next();
            rs=sc.next();
            age=sc.nextInt();
            passengers[i] = new Passengers(name,places_visited,ss,rs,age);

        }

        for(int i=0;i<n;i++)
        {
            if(passengers[i].age<=12)
                passengers[i].display();
        }
    }

}


class Travel{
    String name,startDate,returnDate,place;

    public Travel(String name, String startDate, String returnDate, String place) {
        this.name = name;
        this.startDate = startDate;
        this.returnDate = returnDate;
        this.place = place;
    }
    void display(){
        System.out.println("name="+name+ " startDate="+startDate +" returnDate"+returnDate+" place="+place);
    }
}

class Passengers extends Travel{

    int age;

    public Passengers(String name, String startDate, String returnDate, String place,int age) {
        super(name, startDate, returnDate, place);
        this.age=age;
    }
    void display(){
        super.display();
        System.out.println(" age="+age);
    }
}