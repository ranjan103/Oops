public class Lab52 {
    public static void main(String args[]){


        Executive executive=new Executive();
        executive.department="Ads";
        executive.designation="CEO";
        executive.name="Harish";
        executive.salary=259657;
        executive.display();
    }
}
class Employee{
    String name,designation;
    float salary;

}

class Manager extends Employee{
    String department;

    void display(){
        System.out.println("name="+name+" department="+department+" salary="+salary);
    }
}

class Executive extends Manager{
    void display(){
        System.out.println("Executive:");
        super.display();
    }
}