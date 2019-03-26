import java.lang.reflect.Field;
import java.util.Scanner;
public class LabMidesemB3 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        Bakery[] bakeries = new Bakery[3];
        PersonalCare[] personalCares = new PersonalCare[3];
        ElectricProducts[] electricProducts = new ElectricProducts[3];
        Grocery[] groceries = new Grocery[3];
        System.out.println("Enter 3 Bakery Items: id,name,quantity,price,manufactDate , Expiry Date and company name ");
        for(int i=0;i<3;++i){
            bakeries[i]=new Bakery();
            bakeries[i].id=input.next();
            bakeries[i].name=input.next();
            bakeries[i].quantity=input.nextInt();
            bakeries[i].price=input.nextDouble();
            bakeries[i].manufactDate=input.next();
            bakeries[i].expiryDate=input.next();
            bakeries[i].companyName=input.next();
        }
        display(bakeries,"quantity");
        System.out.println("Enter 3 Personal care Items: id,name,quantity,price,manufactDate , Expiry Date and company name ");
        for(int i=0;i<3;++i){

            personalCares[i]=new PersonalCare();
            personalCares[i].id=input.next();
            personalCares[i].name=input.next();
            personalCares[i].quantity=input.nextInt();
            personalCares[i].price=input.nextDouble();
            personalCares[i].manufactDate=input.next();
            personalCares[i].expiryDate=input.next();
            personalCares[i].companyName=input.next();
        }
        display(personalCares,"quantity");
        System.out.println("Enter 3 electric products Items: id,name,quantity,price,manufactDate , Expiry Date and company name ");
        for(int i=0;i<3;++i){
           electricProducts[i]=new ElectricProducts();
           electricProducts[i].id=input.next();
           electricProducts[i].name=input.next();
           electricProducts[i].quantity=input.nextInt();
           electricProducts[i].price=input.nextDouble();
           electricProducts[i].manufactDate=input.next();
           electricProducts[i].expiryDate=input.next();
           electricProducts[i].companyName=input.next();
        }
        display(electricProducts,"quantity");
        System.out.println("Enter 3 grocery Items: id,name,quantity,price,manufactDate , Expiry Date and company name ");
        for(int i=0;i<3;++i){
           groceries[i]=new Grocery();
           groceries[i].id=input.next();
           groceries[i].name=input.next();
           groceries[i].quantity=input.nextInt();
           groceries[i].price=input.nextDouble();
           groceries[i].manufactDate=input.next();
           groceries[i].expiryDate=input.next();
           groceries[i].companyName=input.next();
        }
        display(groceries,"quantity");
        double [] averageQuantity=new double[4];
        averageQuantity[0]=average(bakeries);
        averageQuantity[1]=average(personalCares);
        averageQuantity[2]=average(electricProducts);
        averageQuantity[3]=average(groceries);
        double maxAverage=0;
        int maxAverageIdx=0;
        for(int i=0;i<4;++i){
            if(maxAverage<averageQuantity[i]){
                maxAverage=averageQuantity[i];
                maxAverageIdx=i;
            }
        }
        if(maxAverageIdx==0) {
            System.out.println( "\nBakery has  Max average quantiy");
            sort(bakeries,"amount",0,3);
            display(bakeries,"amount");
        }
        else if(maxAverageIdx==1) {
            System.out.println( "\npersonal care has  Max average quantiy");
            sort(personalCares, "amount", 0, 3);
            display(personalCares,"amount");
        }
        else if(maxAverageIdx==2) {
            System.out.println( "\nelectric product has  Max average quantiy");
            sort(electricProducts, "amount", 0, 3);
            display(electricProducts,"amount");
        }
        else {
            System.out.println( "\ngroceries has  Max average quantiy");
            sort(groceries, "amount", 0, 3);
            display(groceries,"amount");
        }
    }

    static double average(Product[] products){
        int quantity=0;
        for(int i=0;i<3;++i){
            quantity+=products[i].quantity;
        }
        quantity=quantity/3;
        return quantity;
    }
    static void display(Product[] products,String param){
        sort(products,param,1,3);
        for(int i=0;i<3;++i){
            System.out.println("id="+products[i].id+" "+"name="+products[i].name+" "+"quantity="+products[i].quantity+" "+"price="+products[i].price+" ");
        }
    }

    static void sort(Product[] products,String param,int order,int n){
        Class<?> cls=products[0].getClass().getSuperclass();
        Field f;
        try {
            f = cls.getDeclaredField(param);
            for(int i=0;i<n;++i){
                for(int j=0;j<n-i-1;++j) {
                    int quantity1  = (int) (f.get(products[j]));
                    int quantity2  = (int) f.get(products[j + 1]);
                    if (order == 0) {
                        if (quantity1>quantity2){
                            Product temp = products[j];
                            products[j] = products[j + 1];
                            products[j + 1] = temp;
                        }
                    }
                    else{
                        if (quantity1<quantity2){
                            Product temp = products[j];
                            products[j] = products[j + 1];
                            products[j + 1] = temp;
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }


}


class Product{
    String id,name;
    int quantity,amount;
    double price;
    Product(){
        id=null;
        name=null;
        quantity=0;
        price=0;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0)
        this.quantity = quantity;
        else
            this.quantity=0;
    }

    public void setPrice(double price) {
        if(price>=0)
        this.price = price;

        else
            this.price=0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    public void getProductAmount(){
        this.amount=  this.quantity*((int) this.price);
    }
}

class Bakery extends  Product{
    String manufactDate ,expiryDate,companyName;
}

class PersonalCare extends  Product{
    String manufactDate ,expiryDate,companyName;
}
class ElectricProducts extends  Product{
    String manufactDate ,expiryDate,companyName;
}
class Grocery extends  Product{
    String manufactDate ,expiryDate,companyName;
}