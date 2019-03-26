import java.util.Scanner;


public class Lab71 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        Bus bus=new Bus();
        System.out.println("Enter regNumer  mileage, color, ownerName  and route of bus");
        bus.regNumber=input.nextInt();
        bus.mileage=input.nextDouble();
        bus.color=input.next();
        bus.ownerName=input.next();
        bus.setRouteNumber(input.nextInt());
        bus.showData();

        Car car=new Car();
        System.out.println("Enter regNumer , mileage, color, ownerName and manufacturerName of car");
        car.regNumber=input.nextInt();
        car.mileage=input.nextDouble();
        car.color=input.next();
        car.ownerName=input.next();
        car.setManufacturerName(input.next());
        car.showData();

        Vechile vechile=new Vechile();
        vechile.regNumber=5;

    }
}

class Vechile{
    protected int regNumber;
    protected double mileage;
    protected String color,ownerName;
    void showData(){
        System.out.println("regNumer="+regNumber+ " mileage="+mileage+" color="+color+" ownerName="+ownerName);
    }
}

class Bus extends Vechile{
    private int routeNumber;
    void showData(){
        super.showData();
        System.out.println("routeNumer="+routeNumber);
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }
}

class Car extends Vechile{
    private String manufacturerName;
    void showData(){
        super.showData();
        System.out.println("manufacturerName="+manufacturerName);
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}