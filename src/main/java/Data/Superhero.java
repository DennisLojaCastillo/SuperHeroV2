package Data;

public class Superhero {
    // Attributter
    private String name;
    private String alias;
    private String power;
    private int year;
    private double strength;

    //------------------------------------------------------------------------------------------------
    //Konstruktører
    public Superhero(String name, String alias, String power, int year, double strength) {
        this.name = name;
        this.alias = alias;
        this.power = power;
        this.year = year;
        this.strength = strength;
    }

    //------------------------------------------------------------------------------------------------
    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    //------------------------------------------------------------------------------------------------
    // ToString - Dette printer info om en superhelt
    public String toString() {
        return "Real name: " + name
                + "\nAlias: " + alias
                + "\nSuperpower: " + power
                + "\nYear of publication: " + year
                + "\nStrength: " + strength + "\n";
    }
}

