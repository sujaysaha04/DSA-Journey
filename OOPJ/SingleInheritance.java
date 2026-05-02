public class SingleInheritance {
    public static void main(String[] args) {
        Fish ob=new Fish();
        ob.eat();
        ob.breathe();
        ob.swim();
    }
}
class Animal {
    void eat() {
        System.out.println("It eats");
    }
    void breathe() {
        System.out.println("It breathes");
    }
}
class Fish extends Animal {
    int fins=4;
    void swim() {
        System.out.println("It swims with " +fins+" fins");
    }
}