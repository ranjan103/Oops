class ProductTest{
    private String Itemname;
    private int unitPrice;

    public ProductTest() {
        this.Itemname="no ProductTest";
        this.unitPrice=0;
    }

    public ProductTest(String itemname, int unitprice) {
        Itemname = itemname;
        unitPrice = unitprice;
    }

    public int getPrice() {
        return unitPrice;
    }

    public String toString() {
        return Itemname+" " + "@Rs" + unitPrice+"/- ";
    }
}

class WeightedProductTest extends ProductTest{
    private int weightInKg;

    WeightedProductTest(String itemname,int unitprice,int w){
        super(itemname,unitprice);
        this.weightInKg=w;
    }
    public int getPrice() {
        return super.getPrice()*weightInKg;
    }

    public String toString(){
        return super.toString()+weightInKg + "KG Rs"+this.getPrice()+"/-";
    }

}

class CountedProductTest extends ProductTest{
    private int quantity;
    public CountedProductTest(String itemname,int unitPrice,int q){
        super(itemname,unitPrice);
        this.quantity=q;
    }
    public int getPrice() {
        return super.getPrice()*quantity;
    }

    public String toString(){
        return super.toString()+quantity+"quantity Rs"+this.getPrice()+"/-";
    }

}

public class Lab62 {
    public static void main(String args[]){
        CountedProductTest c = new CountedProductTest("a",30,5);
        WeightedProductTest w = new WeightedProductTest("b",15,5);
        System.out.println(c.toString());
        System.out.println(w.toString());
    }
}
