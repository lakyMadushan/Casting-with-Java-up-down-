public class Animal {
    String name;
    void setName(){
        System.out.println("Elephant");
    }
}
class Fish extends Animal{
    String color;
    void setName(){
        System.out.println("Blue Fish");
    }
}
class Run{
    public static void main(String[] args) {
        Animal a = new Fish();// upcasting
        a.name = "Dog";
        Fish f = new Fish();
        f.name = "Cat";
        f.color = "Red";
        System.out.println("Sub class Object!");
        System.out.println("Name :- "+ a.name);
        a.setName();
        System.out.println("Super class Object!");
        System.out.println("Name :- "+f.name);
        System.out.println("Color :- "+f.color);
        //anytime call sub class

    }
}
