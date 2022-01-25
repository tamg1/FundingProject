package model;

// Represents a project in need of funding that has
// a title, target funding amount (in $), and amount funded (in $).
public class ProjectInNeed {

    // REQUIRES: target >= 100
    // EFFECTS: constructs project with given title and target funding
    // and zero funding applied
    public ProjectInNeed(String title, int target) {
        // stub
    }

    // REQUIRES: amount > 0
    // MODIFIES: this
    // EFFECTS: increases funding target for this project by amount (in $)
    public void increaseTargetBy(int amount) {
        // stub
    }

    // REQUIRES: amount > 0 AND getTarget() - amount >= getAmountFunded()
    // MODIFIES: this
    // EFFECTS: decreases funding target for this project by amount (in $)
    public void decreaseTargetBy(int amount) {
        // stub
    }

    // REQUIRES: amount > 0 AND getTarget() - getAmountFunded() >= amount
    // MODIFIES: this
    // EFFECTS: funds this project by amount by increasing the amountFunded by the given amount
    public void fund(int amount) {
        // stub
    }

    public String getTitle() {
        return null; // stub
    }

    public int getTarget() {
        return -1; // stub
    }

    public int getAmountFunded() {
        return -1; // stub
    }

}
