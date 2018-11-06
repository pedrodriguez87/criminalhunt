package bts.tech.criminalhunt;

public class Suspect {

    private String name;
    private double age;
    private double height;
    private double weight;
    private String haircolor;
    private String eyecolor;
    private boolean male;

    public Suspect(String name, double age, double height, double weight, String haircolor, String eyecolor, boolean male) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public boolean isMale() {
        return male;
    }

}
