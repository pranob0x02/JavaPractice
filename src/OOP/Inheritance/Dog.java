package OOP.Inheritance;

public class Dog extends Animal {


    private String earShape;
    private String tailShape;

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Dog(String type, double weight) {
        this(type, weight, "perky", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
