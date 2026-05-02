public class MultipleInheritance { //through Interface
    public static void main(String[] args) {
        Bear b1=new Bear();
        b1.eatPlants();
        b1.eatMeat();
    }
}
interface Herbivore {
    void eatPlants();
}
interface Carnivore {
    void eatMeat();
}
class Bear implements Herbivore,Carnivore {
    public void eatPlants() {
        System.out.println("Eats plants");
    }
    public void eatMeat() {
        System.out.println("Eats Meat");
    }
}