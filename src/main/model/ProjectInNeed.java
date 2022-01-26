package model;

// Represents a project in need of funding that has
// a title, target funding amount (in $), and amount funded (in $).
public class ProjectInNeed {

    private String title;
    private int target;
    private int amountFunded;

    // REQUIRES: target >= 100
    // EFFECTS: constructs project with given title and target funding
    // and zero funding applied
    public ProjectInNeed(String title, int target) {
        this.title = title;
        this.target = target;
        this.amountFunded = 0;
    }

    // REQUIRES: amount > 0
    // MODIFIES: this
    // EFFECTS: increases funding target for this project by amount (in $)
    public void increaseTargetBy(int amount) {
        this.target = this.target + amount;
    }

    // REQUIRES: amount > 0 AND getTarget() - amount >= getAmountFunded()
    // MODIFIES: this
    // EFFECTS: decreases funding target for this project by amount (in $)
    public void decreaseTargetBy(int amount) {
        this.target = this.target - amount;
    }

    // REQUIRES: amount > 0 AND getTarget() - getAmountFunded() >= amount
    // MODIFIES: this
    // EFFECTS: funds this project by amount by increasing the amountFunded by the given amount
    public void fund(int amount) {
        this.amountFunded = this.amountFunded + amount;
    }

    public String getTitle() {
        return title;
    }

    public int getTarget() {
        return target;
    }

    public int getAmountFunded() {
        return amountFunded;
    }

}
