public class Dog {
    private String name = "Default Doggo";
    private String breed = "Unknown Mutt";
    private String colour = "dog-coloured";
    private int legs = 4;
    private int size = 0;

    public Dog(){

    }
    public Dog(String name, String breed, String colour, int legs, int size) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.legs = legs;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String Bark() {
        if (size > 60) {
            return "Woof!";
        } else if (size > 30) {
            return "Arf!";
        } else {
            return "Yip Yip!";
        }
    }
}

