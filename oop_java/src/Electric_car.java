public class Electric_car extends Car {

    private double volt;

    public Electric_car (String color, String model, int year, double volt) {
        super(color, model, year);
        this.volt = volt;
    }

    public double getVolt() {
        return volt;
    }

    @Override // optional , but in good practice you must use it , it s main that displayDetails from the super class :
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getVolt());
    }
}