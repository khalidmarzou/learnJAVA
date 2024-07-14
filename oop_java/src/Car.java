public class Car {
    
    protected String color; // make sure about privacy at first
    protected String model;
    protected int year;

    public Car(String color, String model, int year) { // constructor make sure to don't use void

        this.color = color; // this is how inisialize attributes
        this.model = model;
        this.year = year;
    }

    public void displayDetails() { // methods make sure to use void

        System.out.println(String.format("the model is : %s, color : %s, year fabrication : %d", model, color, year)); // format string s string d integer f float and double t date n newline c character
    }
}