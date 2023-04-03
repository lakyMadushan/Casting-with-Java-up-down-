public class World {
    String name;
    void process(){
        System.out.println("Earth can Rotation");
    }
}
class Earth extends World{
    int area;
    void process(){
        System.out.println("Earth is a World!");
    }
}
class TestCasting{
    public static void main(String[] args) {
        World w = new Earth(); //upcasting
        w.name = "Earth";
        System.out.println(w.name);
        w.process();

        Earth e = (Earth) w; //downcasting
        e.area = 510;
        System.out.println(e.name);
        System.out.println(e.area);
        e.process();
    }
}