public class Person {
    
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { // public method
        return name;
    }
    private int getAge() {  // private method 
        return age;
    }

    public boolean adult() {  // method with type return 
        if (getAge() > 18) {
            return true;
        } else {
            return false;
        }
    }

    // we use void in method that not return any type of values like System.out.print .... etc
}
