package model;

// Represents a sponsor having a name and a
// number of projects funded
public class Sponsor {

    private String name;
    private int numProjectsFunded;

    // EFFECTS: constructs a sponsor with given name and
    // no projects funded
    public Sponsor(String name) {
        this.name = name;
        this.numProjectsFunded = 0;
    }

    // MODIFIES: this
    // EFFECTS: adds one to number of projects funded by this sponsor
    public void fundProject() {
        this.numProjectsFunded++;
    }

    public String getName() {
        return name;
    }

    public int getNumProjectsFunded() {
        return numProjectsFunded;
    }
}
