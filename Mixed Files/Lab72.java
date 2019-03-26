
public class Lab72 {
    public static void main(String[] args){
        Leaf leaf=new Leaf();
        Page page =new Page();
        Pancake pancake=new Pancake();
        Vechiles vechiles=new Vechiles();
        Ship ship=new Ship();
        leaf.turn();
        page.turn();
        pancake.turn();
        vechiles.turn();
        ship.turn();

    }
}

interface Turning{
    void turn();
}

class Leaf implements Turning{

    @Override
    public void turn() {
        System.out.println("Chganging Color");
    }
}
class Page implements Turning{
    @Override
    public void turn() {
        System.out.println("Going to the next page");
    }
}
class Pancake implements Turning{
    @Override
    public void turn() {
        System.out.println("Flipping");
    }
}

class Vechiles implements Turning{
    @Override
    public void turn() {
        System.out.println("Turning left");
    }
}

class Ship implements Turning{
    @Override
    public void turn() {
        System.out.println("Turn over");
    }
}

