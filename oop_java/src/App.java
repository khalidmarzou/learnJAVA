public class App {
    public static void main(String[] args) throws Exception {
        
        Car dacia = new Car("Red", "Logan", 2003); // you can inisilize the class anywhere in the same package
        dacia.displayDetails(); // call the method of the class

        Person khalid = new Person("MARZOUG", 17);
        System.out.println(khalid.getName());
        System.out.println(String.format("is %s adult : %b", khalid.getName(), khalid.adult()));


        Electric_car tesla = new Electric_car("black", "X11", 2020, 120000.12);

        tesla.displayDetails();
    }
}
