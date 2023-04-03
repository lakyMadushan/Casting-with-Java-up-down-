public class Human {
    void printData(){
        System.out.println("Method of super class!");
    }
}
class Man extends Human{
    void printData(){
        System.out.println("Method of Sub class!");
    }
}
class Test{
    public static void main(String[] args) {
        Human h = new Man(); // upcasting
        Human h1 = new Man();
        h.printData(); // sub class call anytime. because Man()'sub class' create new object 'h'
        h1.printData();
    }
}
