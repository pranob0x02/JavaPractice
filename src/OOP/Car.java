package OOP;

public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Grey";
    private int doors = 4;
    private boolean convertible = true;


    // Getter practise
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }


    //setter practise
    public void setMake(String make) {

        if (make == null) make = "unknown";
        String lowerCase = make.toLowerCase();
        switch (lowerCase) {
            case "tesla", "porsche" -> this.make = make;
            default -> {
                this.make = "unsuppported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println("Doors: " + doors);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Make: " + make);
        System.out.println("Convertible: " + convertible);
    }
}


